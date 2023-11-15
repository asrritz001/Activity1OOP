package programme90;

import java.util.Scanner;

public class Q17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.print(" enter num1  ");
		int num1 = kb.nextInt();
		System.out.print(" enter num2  ");
		int num2 = kb.nextInt();
		System.out.print(" enter num3 ");
		int num3 = kb.nextInt();

		if (num1 >= num2) {
			if (num1 >= num3) {
				System.out.print(num1 + " number is the largest number");
			} else {
				System.out.print(num3 + " number is the largest number");
			}
		} else {
			if (num2 >= num3) {
				System.out.print(num2 + " number is the largest number");
			} else {
				System.out.print(num3 + " number is the largest number");
			}
		}
		kb.close();
	}

}
