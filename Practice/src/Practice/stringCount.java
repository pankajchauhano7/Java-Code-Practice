package Practice;

public class stringCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="My Name is Pankaj Chauhan";
		int count=0;
		
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i) != ' ')
			{
				count++;
			}
		}
		System.out.println(count);
	

	}

}
