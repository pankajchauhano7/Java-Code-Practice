package Practice;

public class leapYear {

	public static boolean isLeap(int year) {
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					return true;
				} else {
					return false;
				}
			} else {
				return true;
			}

		} else {
			return false;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		if (isLeap(1997)) {
			System.out.println("Leap Year");
		} else {
			System.out.println("Not Leap Year");
		}

	}

}
