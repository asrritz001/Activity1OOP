package programme90;

import java.util.Scanner;

public class Q15 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("enter the 1st num");
		double num1 = input.nextDouble();

		System.out.println("enter the 2nd num");
		double num2 = input.nextDouble();

		System.out.println("enter the 3rd num");
		double num3 = input.nextDouble();

		System.out.println("enter the 4th num");
		double num4 = input.nextDouble();

		if (num1 > num2 && num1 > num3 && num1 > num4) {

			System.out.println(" 1st num is largest");

		}
		else if (num2 > num1 && num2 > num3 && num2 > num4) {

			System.out.println(" 2nd num is largest");

		}
		else if (num3 > num1 && num3 > num2 && num3 > num4) {

			System.out.println(" 3rd num is largest");

		} else {

			System.out.println(" 4th num is largest");

		}
		input.close();
		
	}
}
 