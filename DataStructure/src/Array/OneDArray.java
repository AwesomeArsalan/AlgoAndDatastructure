package Array;

public class OneDArray {

	public static void main(String[] args) {
		// Array declaration
		int[] arr; // (or)
		int[] arr1; // (or)
		int arr2[];
		int size = 8;
		// Array Initialization
		arr = new int[size];
		arr[0] = 9;
		System.out.println(arr.length + ", " + arr);
		arr = new int[size + 5];
		arr[1] = 1;
		System.out.println(arr.length + ", " + arr);

		System.out.println(arr[0] + " " + arr[1]);
		// declaration, instantiation and initialization
		int arr3[] = { 33, 3, 4, 5 };

		// printing array
		for (int i = 0; i < arr3.length; i++)// length is the property of array
		{
			System.out.print(arr3[i] + ", ");
		}
		System.out.println();
		for (int item : arr3) {
			System.out.print(item + ", ");
		}
		System.out.println();
		min(arr3);
	}

	static void min(int arr[]) {
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println(min + ", ");
	}
}
