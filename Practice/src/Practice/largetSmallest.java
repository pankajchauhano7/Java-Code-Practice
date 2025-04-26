package Practice;

public class largetSmallest {
	public static void main(String args[]) {
		int[] nums = { 5, 2, 8, 3, 1 };

		int largest = nums[0];
		int smallest = nums[0];

		for (int num : nums) {
			if (num > largest) {
				largest = num;
				
			}
			if (num < smallest) {
				smallest = num;
			}
		}
		
		System.out.println("Largest Number : "+largest);
		System.out.println("Smallest Number : "+smallest);
		

	}

}
