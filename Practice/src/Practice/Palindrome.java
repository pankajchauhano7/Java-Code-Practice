package Practice;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input = "CAT";
		String reverseString = new StringBuilder(input).reverse().toString();
		
		boolean isPalindrome = input.equals(reverseString);
		System.out.println(isPalindrome);

	}

}
