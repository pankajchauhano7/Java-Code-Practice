package Practice;

public class reverseString {
	public static void main(String args[]) {

		String a = "Pankaj is Boy";
		int al = a.length();
		String nstr = "";
		
		
		

		char ch;
		System.out.println("Orginal :" + a);

		for (int i = 0; i < al; i++) {
			ch = a.charAt(i);
			nstr = ch+nstr;
		}
		System.out.println("Reversed String :" + nstr);

		/*
		 * nstr = new StringBuilder(a).reverse().toString();
		 * System.out.println("Reversed String : "+nstr);
		 */

	}

}
