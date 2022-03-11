package Lec_34;

public class Student implements Comparable<Student> {
	String Name;
	int Age;
	static int no_of_students = 0;

	public Student(String ss, int aa) {
		Name = ss;
		Age = aa;
	}

	public Student() {

		// TODO Auto-generated constructor stub
		no_of_students++;
	}

	public String toString() {
		return "{ " + Name + " " + Age + " }";
	}

	public static void Bacha_huo_Bully(Student Ranja) {
		Ranja.Name = "Chomu";
		int ll = 1023;
		no_of_students--;
//		Student S = new Student();
//		S.Intro();
	}

	public void Intro() {
		Bacha_huo_Bully(null);
		System.out.println(Name);
	}

	@Override
	public int compareTo(Student o) {
//		arr[j].compareTo(arr[j+1])
//		this = arr[j]
//		o=arr[j+1];
		
//		return this.Age - o.Age // Marks!!
//		return o.Age - this.Age // rank!!
		return this.Age - o.Age;
	}
}
