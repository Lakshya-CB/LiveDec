package Lec_6;

public class F_C {
	public static void main(String[] args) {
		int min_F = 0;
		int max_F = 100;
		int step = 20;
		
		for(int F = min_F;F<=max_F;F=F+step) {
//			int C  = (5/9)*(F-32);
//			int C = (int)((5/9.0)*(F-32));
//			int C  = 5*(F-32)/9;
//			double ll = 16.2;
			double C = (5/9.0)*(F-32);

//			System.out.println(F + " " + C);
//			String.format("%.nf", C); round off til n digit after point and print!!
			System.out.println(F + " " + String.format("%.2f", C));
			
		}
	}
}
