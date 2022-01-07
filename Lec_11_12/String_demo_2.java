package Lec_11_12;

public class String_demo_2 {
	public static void main(String[] args) {
//		String str000 ="hello";
//        String str1000 ="hell"+"o";
//        System.out.println(str000==str1000); ??

        System.out.println("***********");
		
		String str1 = "hello";

		String str12 = new String(str1);
		String str112 = str12;
		
		System.out.println(str112 == str1);
		System.out.println(str112.equals(str1));
		

		String POP = str1 + "i";
		System.out.println(POP.substring(0, POP.length() - 1));

		System.out.println("***********");
		String SS00 = new String(str1);
		String SS11 = new String("hello");

		System.out.println("==============");
		System.out.println(SS00 == SS11);
		System.out.println("==============");
		System.out.println(SS00 == str1);
		System.out.println("****************");
		str1 = str1.concat("OOOP");
		System.out.println(str1);

		System.out.println(str1 == str12);

		System.out.println("==============");

		String str3 = str1;
		String str2 = str1 + "i"; // O(n)!!

//		Compare Value!!
		System.out.println(str2 == str1);
		System.out.println(str1 == str3);

//		Compare Strings?! content!!
		System.out.println(str1.equals(str2));

	}
}
