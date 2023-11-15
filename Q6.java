package programme90;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.print("enter a number 1 ");
		int num1 = kb.nextInt();
		System.out.print("enter a number 2 ");
		int num2 = kb.nextInt();
		int num3 = num1;
		num1 = num2;
		num2 = num3;
		System.out.println("After swapping the numbers ");
		System.out.println("now num1 is  " + num1);
		System.out.println("now num2 is  " + num2);
		kb.close();

	}

}
