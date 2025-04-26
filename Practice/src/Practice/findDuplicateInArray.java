package Practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class findDuplicateInArray {
	/*
	 * public static void main(String args[]) { int[] nums = { 1, 2, 3, 2, 1, 2, 3,
	 * 4, 5, 4, 5, 8, 9, 19 };
	 * 
	 * HashSet<Integer> seen = new HashSet<>(); HashSet<Integer> duplicates = new
	 * HashSet<>();
	 * 
	 * for (int num : nums) { if (!seen.add(num)) { duplicates.add(num); } }
	 * 
	 * System.out.println("Duplicates : " + duplicates);
	 * 
	 * }
	 */

	public static void main(String[] args) {
	       int[] arr={1, 2, 3, 2, 1, 2, 3,4, 5, 4, 5, 8, 9, 19 };
	       List<Integer> new_arr = new ArrayList<>();

	       
	      for (int i = 0; i < arr.length; i++) {
	            for (int j = i + 1; j < arr.length; j++) {
	                if (arr[i] == arr[j] && !new_arr.contains(arr[i])) {
	                    new_arr.add(arr[i]);
	                }
	                }
	            }
	       for(int num : new_arr)
	       {
	           System.out.print(" "+num);
	       }

}
}
