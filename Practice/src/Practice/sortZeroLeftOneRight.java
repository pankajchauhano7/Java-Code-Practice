package Practice;

public class sortZeroLeftOneRight {
	public static void moveZeroesAndOnes(int[] arr) {
		int left = 0, right = arr.length - 1;

		while (left < right) {

			while (left < right && arr[left] == 0) {
				left++;
			}

			while (left < right && arr[right] == 1) {
				right--;
			}

			if (left < right) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
			}
		}
	}

	public static void printArray(int[] arr) {
		for (int num : arr) {
			System.out.print(num + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// Example array
		int[] arr = { 1, 0, 1, 0, 1, 0, 0, 1 };

		System.out.println("Original array:");
		printArray(arr);

		moveZeroesAndOnes(arr);

		System.out.println("Array after moving zeros to the left and ones to the right:");
		printArray(arr);
	}
}
