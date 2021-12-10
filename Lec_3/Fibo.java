package Lec_3;

public class Fibo {
	public static void main(String[] args) {
		int n = 20;
		int i = 0;

		int a = 0;
		int b = 1;
		while (i < n) {	
			int c = a + b;
			
			System.out.println(a);
			
//			Update!!
			a = b;
			b = c;
			

			i++;
		}
	}
}
