package Practice;

public class numPalindrome {
	
	public static void main(String args[])
	{
		int num = 121;
		int orginalnum = num;
		int rev=0;
		
		 while (num > 0) {
	            int digit = num % 10;
	            rev = rev * 10 + digit;
	            num /= 10;
	        }
		
		if(orginalnum == rev)
		{
			System.out.print("Palindrome");
		}else{
			System.out.print("Not Palindrome");
		}
	}
	

}
