package Lec_11_12;

public class String_demo {
	public static void main(String[] args) {
		String str = "abcdbcdbcdbcd";
		System.out.println(str);
		System.out.println("LOLOLO");
		
//		Size?!
		int len = str.length();
//		Ith char ?!
		char ch = str.charAt(0);
		System.out.println(ch);
		System.out.println("/////////////////");
//		System.out.println(str.charAt(str.length()));
		
		for(int s = 0;s<str.length();s++) {
			for(int e= s+1;e<=str.length();e++) {
				System.out.println(str.substring(s,e));
			}
		}
		System.out.println("//");
		System.out.println(str.substring(1));
		
		System.out.println("//");
		System.out.println(str.indexOf("abcd")); // works from left side?!!?
		
		System.out.println(str.lastIndexOf("bcd")); //works from right side!!
		
//		Suffix?!
		System.out.println(str.endsWith("bc"));
//		Prefix?!!?
		System.out.println(str.startsWith("abcd"));
	}
}
