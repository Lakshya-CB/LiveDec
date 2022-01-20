package Lec_17;

import java.util.ArrayList;
import java.util.List;

public class Rec_2 {
	public static void main(String[] args) {
//		subseqASCII("abc", "");
//		CT_HH(4, "", false);
		List<String> AL = new ArrayList<String>();
		LetterKey("23","", AL);
		System.out.println(AL);
	}

	public static void subseq(String str, String ans) {
		if (str.isEmpty()) {
//			System.out.println(ans);
			return;
		}

//		Inc
		char ch = str.charAt(0);
		subseq(str.substring(1), ans + ch);
//		Ex
		subseq(str.substring(1), ans);

	}

	public static void CT(int num, String ans) {
		if (num == 0) {
			System.out.println(ans);
			return;
		}
		CT(num - 1, ans + "H");
		CT(num - 1, ans + "T");

	}

	public static void CT_HH(int num, String ans, boolean lastHead) {
		if (num == 0) {
			System.out.println(ans);
			return;
		}
		if (!lastHead)
			CT_HH(num - 1, ans + "H", true);
		CT_HH(num - 1, ans + "T", false);

	}

	public static void subseqASCII(String str, String ans) {
		if (str.isEmpty()) {
			System.out.println(ans);
			return;
		}

//		Inc
		char ch = str.charAt(0);
		subseqASCII(str.substring(1), ans + ch);
//		Ex
		subseqASCII(str.substring(1), ans);
		subseqASCII(str.substring(1), ans + (int) ch);
	}

	public static void LetterKey(String str, String sol, List<String> AL) {
		if(str.isEmpty()) {
//			System.out.println(sol);
			AL.add(sol);
			return;
		}
		
		String options = getComb(str.charAt(0));
		for(int i=0;i<options.length();i++) {
			LetterKey(str.substring(1), sol+options.charAt(i), AL);
		}
		
	}

	public static String getComb(char ch) {
		if (ch == '2') {
			return "abc";
		} else if (ch == '3') {

			return "def";
		} else if (ch == '4') {

			return "ghi";
		} else if (ch == '5') {

			return "jkl";
		} else if (ch == '6') {

			return "mno";
		} else if (ch == '7') {

			return "pqrs";
		} else if (ch == '8') {

			return "tuv";
		} else if (ch == '9') {

			return "wxyz";
		}
		return "";
	}

}
