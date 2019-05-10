package πÈ≤¢≈≈–Ú;

public class Main {
	public static void main(String[] args) {
		int[] arr = new int[] { 5, 4, 3, 2, 1 };
		sortProcess(arr, 0, arr.length - 1);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void sortProcess(int[] arr, int l, int r) {
		if (l == r)
			return;
		int mid = l + ((r - l) >> 2);
		sortProcess(arr, l, mid);
		sortProcess(arr, mid + 1, r);
		merge(arr, l, mid, r);
	}

	private static void merge(int[] arr, int l, int mid, int r) {
		int[] help = new int[r - l + 1];
		int p1 = l;
		int p2 = mid + 1;
		int i = 0;
		while (p1 <= mid && p2 <= r) {
			help[i++] = arr[p1] < arr[p2] ? arr[p1++] : arr[p2++];

		}
		while (p1 <= mid) {
			help[i++] = arr[p1++];
		}
		while (p2 <= r) {
			help[i++] = arr[p2++];
		}
		for (int j = 0; j < help.length; j++) {
			arr[l + j] = help[j];
		}
	}
}
