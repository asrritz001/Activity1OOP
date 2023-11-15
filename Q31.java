package programme90;

import java.util.Scanner;

public class Q31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.print("enter a number ");
		int num = kb.nextInt();
		int factorial = 1;
		int i = 1;

		while (i <= num) {
			factorial = factorial * i;
			i++;
		}
		System.out.println(factorial);
		kb.close();
	}

}
