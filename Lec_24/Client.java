package Lec_24;

public class Client {
	public static void main(String[] args) {
		Student s = new Student();
		System.out.println(s);
		System.out.println(s.Age);
		System.out.println(s.Name);

		Student s1 = s;
		System.out.println(s1);
		System.out.println(s);

		Student s2 = new Student();
		System.out.println(s2);

//		System.out.println("================");
//		s.Name = "Bhai?!";
//		System.out.println(s1.Name);
		s1.Name = "s1";
		s1.Age = 10;

		s2.Name = "s2";
		s2.Age = 20;

		System.out.println(s1.Age + "_" + s1.Name);
		System.out.println(s2.Age + "_" + s2.Name);

//		Test2(s1, s2);

		System.out.println(s1.Age + "_" + s1.Name);
		System.out.println(s2.Age + "_" + s2.Name);

		System.out.println("====================");

		
		String myName = "SlimShady";
		int myAge = 50;
		Test3(s1, s2.Name, s2.Age, myAge, myName);
		
		System.out.println(s1.Age + "_" + s1.Name);
		System.out.println(s2.Age + "_" + s2.Name);
	}

	public static void Test1(Student s1, Student s2) {
		Student temp = s1;
		s1 = s2;
		s2 = temp;
	}

	public static void Test2(Student s1, Student s2) {
		s1 = new Student();

		String temp_s = s1.Name;
		s1.Name = s2.Name;
		s2.Name = temp_s;

		int temp_i = s1.Age;
		s1.Age = s2.Age;
		s2.Age = temp_i;
	}

	public static void Test3(Student s1, String Name, int Age, int myAge, String myName) {
		s1.Name = "";
		s1.Age = 0;

		Name = "";
		Age = 0;

		myName = "";
		myAge = 0;
	}

}
