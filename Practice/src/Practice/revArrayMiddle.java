package Practice;

public class revArrayMiddle {

	
	
	public static void main(String[] args) {
		
		int [] arr = {1,2,3,4,5,6,7};
		int middle = arr.length/2;
		
		int left = middle;
		int right = arr.length-1;
		
		while(left<right)
		{
			int temp = arr[left];
			arr[left] =arr[right];
			arr[right] = temp;
			left++;
			right--;
		}
		for(int num : arr)
		{
			System.out.print(num+" ");
		}
		

	}

}
