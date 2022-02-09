package Lec_25;

public class client {
	public static void main(String[] args) throws Exception {
		Student s = new Student(12, "Chottu");
		try {
			s.setAge(13);
			System.out.println(s.getAge());
			s.setAge(-20);
			System.out.println(s.getAge());
			System.out.println("try END");
		} finally {
			System.out.println("finally done");
		}
		System.out.println("LOLO");

	}
}
