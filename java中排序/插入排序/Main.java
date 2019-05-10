package ≤Â»Î≈≈–Ú;

public class Main {
	public static void main(String[] args) {
		int[] arr = new int[] { 5, 4, 3, 2, 1 };
		sortProcess(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void sortProcess(int[] arr) {
		if (arr == null || arr.length < 2) {
			return;
		}
		for (int i = 1; i < arr.length; i++) {
			for (int j = i - 1; j >= 0 && arr[j] > arr[j + 1]; j--)
				swap(arr, j, j + 1);
		}
	}

	private static void swap(int[] arr, int j, int i) {
		int temp = arr[j];
		arr[j] = arr[i];
		arr[i] = temp;
	}
}
