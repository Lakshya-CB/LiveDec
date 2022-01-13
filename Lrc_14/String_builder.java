package Lrc_14;

public class String_builder {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("momi momo");
		System.out.println(sb);
//		get index!! chaAt
		System.out.println(sb.charAt(0));
//		last index?!
		System.out.println(sb.charAt(sb.length()-1));	
//		Substring!!
		System.out.println(sb.substring(0, 3));

//		Kya alag heihn ?
		sb.append("POP"); //O(1)
		
		System.out.println("=============");
		System.out.println(sb);
//		Add at index O(n)
		sb.insert(0,"LL"); // O(n)
		System.out.println(sb);
		System.out.println("=============");
		
		sb.setCharAt(0, '~'); //O(1)
		System.out.println(sb);
		System.out.println("=============");
		
		System.out.println(sb.delete(0, 3));
		System.out.println("=============");
		String ans = sb.toString();
		System.out.println(ans);
		
		
		
		
	}
}
