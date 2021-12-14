package Lec_4;

public class Chew_baka {
	public static void main(String[] args) {
		
		int num = 99999;
		int nn = 0;
		int mult = 1;
		while(num>0) {
			int digit = num%10;
			if(digit>=5) {
				digit = 9-digit;
			}
			
			nn = nn + digit *mult;
			mult = mult*10;
			
//			System.out.println(digit+ " , "+nn);
			num=num/10;
		}
		System.out.println(nn);
	}
}
