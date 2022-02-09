package Lec_25;

public class Student {
//	Parsing!!

	private int Age = 9999;
	private String Name = "gum shuda";

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

	public int getAge() {
		return this.Age;
	}

	public String getName() {
		return this.Name;
	}

	public void setAge(int age) throws Exception  {

		if (age > 0) {
			this.Age = age;
		} else {
			throw new Exception("-ve age kuch bhi!!");

		}
		System.out.println("DONE!!!!!!!!!!!!");

	}
}