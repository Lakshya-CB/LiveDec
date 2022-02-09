package Lec_24;

public class Client_2 {
	public static void main(String[] args) {
		Student s = new Student();
		s.Age = 10;
		s.Name = "Babu bhaiya~~";
		s.Intro();

		Student s1 = new Student();
		s1.Age = 50;
		s1.Name = "RRRRRRaju";
		s1.Intro();

		s.sayHi(s1.Name);

		s.party(s1);

		Student gum = new Student();
		System.out.println(gum.Age);
		System.out.println(gum.Name);
		
		
		System.out.println("******************");
		Student s2 = new Student(9, "Ranja Lucifer");
		System.out.println(s2.Name);
	}
}
