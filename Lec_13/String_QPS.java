package Lec_13;

public class String_QPS {
	public static void main(String[] args) {
		String str = "the sky is blue";
//		Palin_ss(str);
//		revString(str);
		str ="";
		long start = System.currentTimeMillis();
		for(int i=0;i<100000;i++) {
			str = str+i;
		}
		long end = System.currentTimeMillis();
		System.out.println(end-start);
	}

	public static void Palin_ss(String str) {
		int count = 1;
		for (int c = 0; c < str.length(); c++) {
			for (int r = 0; r + c < str.length() && c - r >= 0; r++) {
				if (str.charAt(r + c) == str.charAt(c - r)) {
//					System.out.println(str.substring(c - r, r + c + 1));
					count++;
				} else {
					break;
				}
			}
		}
//		
		for (double c = 0.5; c < str.length(); c++) {
			for (double r = 0.5; r + c < str.length() && c - r >= 0; r++) {

				if (str.charAt((int) (r + c)) == str.charAt((int) (c - r))) {
//					System.out.println(str.substring((int)(c - r), (int)(r + c + 1)));
					count++;
				} else {
					break;
				}
			}
		}
		System.out.println(count);
	}

	public static void revString(String str) {
		while (true) {
			int idx = str.lastIndexOf(' ');
			String word = str.substring(idx+1);
			System.out.println(word);
			if(idx==-1) {
				break;
			}
			str = str.substring(0,idx);
		}
	}
}
