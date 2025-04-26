package Practice;

public class missingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,4,5,6,7,8};
		int n = nums.length+1;
		int sum = n*(n+1)/2;
		int actualSum = 0;
		for(int num : nums)
		{
			actualSum += num; 
		}
		System.out.println("Missing num : "+(sum-actualSum));

	}

}
