package Practice;

public class revWordString {
	
	public static String reverseWord(String s) {
		String[] words = s.split(" ");
		StringBuilder result = new StringBuilder();
		
		for(String word : words)
		{
			StringBuilder reversed = new StringBuilder(word);
			result.append(reversed.reverse().append(" "));
		}
		return result.toString().trim();

	}
	
	public static void main(String args[])
	{
		String s = "Hello World";
		String news = reverseWord(s);
		
		System.out.print("Word reversed in String:"+ news);
		
		
	}

}
