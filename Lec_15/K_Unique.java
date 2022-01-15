package Lec_15;

public class K_Unique {
	public static void main(String[] args) {
		String str = "nitiltiin";
		int k = 3;
		k(str, k);
	}

	public static void k(String str, int k) {
		int[] batua = new int[26];
		int s = 0;// which char to delete
		int e = 0; // which char to add
		int score = 0;
		int ans = 0;
		while (e<str.length()) { // nitiltiin";
			
			if (score <= k) {
				char ch = str.charAt(e);
//				Score?!!?1
				if (batua[ch - 'a'] == 0) {
					score++;
				}
				batua[ch - 'a']++;
				e++;
			} else {
				char ch = str.charAt(s);
//				Score?!!?1
				if (batua[ch - 'a'] == 1) {
					score--;
				}
				batua[ch - 'a']--;
				s++;
			}
			if (score <= k) {
				System.out.println(str.substring(s, e) + " =  " + score + " {" + s + "," + e + "}");
				ans = Math.max(e - s, ans);
			}
		}
	}
}
