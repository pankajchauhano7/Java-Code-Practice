package Practice;

public class swapStringUsingTempVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 ="String One";
		String s2 = "String Two";
		
		System.out.println("String 1: "+s1);
		System.out.println("String 2: "+s2);
		
		String temp;
		
		temp =s1;
		s1=s2;
		s2=temp;
		
		System.out.println("String 1: "+s1);
		System.out.println("String 2: "+s2);
		
				
				

	}

}
