package Practice;

import java.util.LinkedHashSet;

public class removeDuplicateChar {
	
	
	public static String removeDuplicate(String inputString) {
		String lowerString = inputString.toLowerCase();
		char[] characters = lowerString.toCharArray();
		LinkedHashSet<Character> uniqueCharacters = new LinkedHashSet<>();
		
		for(char character : characters) {
			if(!uniqueCharacters.contains(character)) {
				uniqueCharacters.add(character);
			}
		}
		StringBuilder resultBuilder = new StringBuilder();
		
		for(char character: uniqueCharacters) {
			resultBuilder.append(character);
		}
		return resultBuilder.toString();
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String inputString="My name is Pankaj Chauhan";
		String result = removeDuplicate(inputString);
		System.out.println(result);
		

	}

}
