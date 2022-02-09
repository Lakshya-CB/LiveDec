package Lec_24;

public class Student {
//	Parsing!!

	int Age = 9999;
	String Name = "gum shuda";

	public Student() {
	}

//	constructor!!
	public Student(int Age, String Name) {
		this.Age = Age;
		this.Name = Name;
	}

	public void Intro() {
		System.out.println(this);
		System.out.println(Age + "__" + Name);
//		System.out.println(this.Age + "__" + this.Name);

	}

	public void sayHi(String Name) {
		System.out.println(this.Name + " say hi to " + Name);
	}

	public void party(Student S) {
		System.out.println(this.Name + " party!!!!! with " + S.Name);
	}
}
