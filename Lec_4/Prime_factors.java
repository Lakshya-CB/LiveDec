package Lec_4;

public class Prime_factors {
	public static void main(String[] args) {
		int num = 28;
		int fact = 2;
		int sum =0;
		while(num>1) {
			if(num%fact==0) {
//				fact is a factor!!
//				System.out.println(fact);
				int copy = fact;
				while(copy>0) {
					int digit = copy%10;
					System.out.println(digit);
					copy=copy/10;
				}
				num=num/fact;
			}
			else {
				fact++;
			}
		}
	}
}
