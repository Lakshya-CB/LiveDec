package Lec_6;

public class Rotation2 {
	public static void main(String[] args) {
		int n = 123456;
		int r = 4;
		
		int num = n; // copy !!
		int nod = 0;
		while (n > 0) {
			n = n / 10;
			nod++;
		}
		
//		reduce rotation!!
		r = r%nod;
		
		System.out.println(nod);
//		System.out.println(n);

		System.out.println("===============");

		int p1 = (int)(num/Math.pow(10, r));
		int p2 = (int)(num%Math.pow(10, r));
		System.out.println(p1);	
		System.out.println(p2);
		
		System.out.println("===============");
		int ans = (int)(p2*Math.pow(10, nod-r)+p1);
		System.out.println(ans);
	}
}
