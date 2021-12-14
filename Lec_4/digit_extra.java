package Lec_4;

public class digit_extra {
	public static void main(String[] args) {
		int num = 12345;
		int nn = 0;
		int mult = 1;
		while(num>0) {
			int digit = num%10;
			
			nn = nn + digit *mult;
			mult = mult*10;
			
			System.out.println(digit+ " , "+nn);
			num=num/10;
		}
	}
}
