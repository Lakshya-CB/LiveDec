package Lec_34;

import java.util.Comparator;

public class Client_G {
	public static void main(String[] args) {
		Student[] arr = new Student[5];
		arr[0] = new Student("AA1", 10);
		arr[1] = new Student("Harambe Sharma", 12);
		arr[2] = new Student("Ranja", 15);
		arr[3] = new Student("Michel", 20);
		arr[4] = new Student("Chomu", 2);

		print(arr);
//		System.out.println(arr[0]);
		sort(arr,new AgeCom());
		print(arr);
		sort(arr,new NameCom());
		print(arr);

	}

	static class AgeCom implements Comparator<Student>{

		@Override
		public int compare(Student o1, Student o2) {
			// TODO Auto-generated method stub
			return o1.Age-o2.Age;
		}
		
	}
	static class NameCom implements Comparator<Student>{

		@Override
		public int compare(Student o1, Student o2) {
			// TODO Auto-generated method stub
			return o1.Name.compareTo(o2.Name);
		}
		
	}

//	public static void print(Object[] arr) {
//		System.out.print("[");
//		for(Object s: arr) {
//			System.out.print(s+" ");
//		}
//		System.out.println("]");
//	}
	public static <OOOO> void print(OOOO[] arr) {
		System.out.print("[");
		for (OOOO s : arr) {
			System.out.print(s + " ");
		}
		System.out.println("]");
	}

//	public static void sort(Student[] arr) {
//		for(int count=0;count<arr.length;count++) {
//			for(int j=0;j<arr.length-1;j++){
//				if(arr[j].Age>arr[j+1].Age) {
////					swap!!
//					Student temp = arr[j];
//					arr[j] = arr[j+1];
//					arr[j+1]= temp;
//				}
//			}
//		}
//				
//	}
//	
	public static <jojo extends Comparable<jojo>> void sort(jojo[] arr) {
		for (int count = 0; count < arr.length; count++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j].compareTo(arr[j + 1]) > 0) {
//				if(arr[j].Age>arr[j+1].Age) {
//					swap!!
					jojo temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

	}

	public static <jojo> void sort(jojo[] arr, Comparator<jojo> LL) {
		for (int count = 0; count < arr.length; count++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (LL.compare(arr[j], arr[j + 1]) > 0) {
//				if(arr[j].Age>arr[j+1].Age) {
//					swap!!
					jojo temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

	}
}
