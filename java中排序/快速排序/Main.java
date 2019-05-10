package 快速排序;

public class Main {
	public static void main(String[] args) {
		int R = 9;
		int[] arr = new int[] { 6, 1, 6, 4, 1, 7, 8, 7, 7, 5 };
		quickSort(arr, 0, R);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	/* 快速排序 */
	public static void quickSort(int[] arr, int L, int R) {
		if (L < R) {
			/* 随机选择一个数放到数组末尾 */
			swap(arr, (int) (L + Math.random() * (R - L + 1)), R);
			int[] p = partition(arr, L, R);
			quickSort(arr, L, p[0] - 1);
			quickSort(arr, p[1] + 1, R);
		}
	}

	/* 荷兰国旗问题 */
	public static int[] partition(int[] arr, int L, int R) {
		int less = L - 1;
		int more = R;
		while (L < more) {
			if (arr[L] < arr[R]) {
				swap(arr, ++less, L++);
			} else if (arr[L] > arr[R]) {
				swap(arr, --more, L);
			} else {
				L++;
			}
		}
		swap(arr, more, R);
		return new int[] { less + 1, more };
	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
