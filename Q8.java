package programme90;

import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter a number: ");
		double db = kb.nextDouble();

		if (db < 0) {
			System.out.print("can't do the square root because the number is negative ");
		} else {
			double squareRoot = Math.sqrt(db);
			System.out.println("Square root of " + db + " is " + squareRoot);
		}

		kb.close();

	}

}
