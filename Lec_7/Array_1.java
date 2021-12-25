package Lec_7;

public class Array_1 {
	public static void main(String[] args) {
//		Declare and create!!
		int[] arr = new int[5];
		System.out.println(arr);
//		arr is actually an address!!
//		arr = null; // pani wala null!!
		System.out.println(arr);
//		What happened to 10k ?! where the the 50x 4b memory?
//		Garbage Collector!! , memory!! , jaha par koi address nahi hota!!

//		arr = 5;

//		Find length of the array!!
		int len = arr.length;
		System.out.println(len);
		System.out.println(arr.length);

//		Indexing!!
		arr[0] = 10;
		arr[1] = 20;
		System.out.println(arr);
//		arr[5] =9;
		arr[4]=9;
		arr[arr.length-1]= 90;
		System.out.println(arr[4]);
		System.out.println("===============");
//		Print array!!
		for(int i = 0; i<arr.length;i++) {
			System.out.println(i+" i th index "+arr[i]);
		}
		arr[2] = 99;
		System.out.println("===============");
//		Print array!!
		for(int i = 0; i<arr.length;i++) {
			System.out.println(i+" i th index "+arr[i]);
		}
		
		int[] arr2= {10,20,30,40,50};
		System.out.println("===============");
//		Print array!!
		for(int i = 0; i<arr2.length;i++) {
			System.out.println(i+" i th index "+arr2[i]);
		}
		
	}
}
