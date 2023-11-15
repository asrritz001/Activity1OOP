package programme90;

import java.util.Scanner;

public class Q21 {
	// multiple of both 3 and 5

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.println("enter a number");
		int number = kb.nextInt();

		if (number % 3 == 0 && number % 5 == 0) {
			System.out.println(" number is multiply by both 3 and 5.");
		} else if (number % 3 == 0) {
			System.out.println(" number is multiply by 3.");
		} else if (number % 5 == 0) {
			System.out.println(" number is multiply by 5.");
		}else {
			System.out.println(" number is not multiply by 3 and 5.");
		}
		kb.close();
	}

}
