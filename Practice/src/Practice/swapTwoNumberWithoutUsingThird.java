package Practice;

public class swapTwoNumberWithoutUsingThird {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1=5;
		int n2=6;
		
		System.out.println("Number 1 Before Swapping : "+n1);
		System.out.println("Number 2 Before Swapping : "+n2);
		
		n1=n1+n2;
		n2=n1-n2;
		n1=n1-n2;
		
		System.out.println("Number 1 After Swapping : "+n1);
		System.out.println("Number 2 After Swapping : "+n2);

	}

}
