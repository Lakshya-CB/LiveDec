package Lec_6;

public class Rotation {
	public static void main(String[] args) {
		int n = 123456;
		int r = 40;
		
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
//		rotation once!!

		while (r > 0) {
			int digit = num % 10;
			num = num / 10;
//		System.out.println(digit);
			num = (int) (digit * Math.pow(10, nod - 1) + num); // Math.pow!!! for power!!

//			System.out.println(num);
			
			r--;
		}
		System.out.println(num);
	}
}
