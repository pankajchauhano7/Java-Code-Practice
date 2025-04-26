package Practice;

public class countOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Hello World, Welcome to Coding";
		char target = 'o';
		int count = 0;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == target) {
				count++;
			}

		}

		System.out.println("Occurrence of '" + target + "': " + count);

	}

}
