package programme90;

import java.util.Scanner;

public class Q37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.print("enter a number: ");
		int n = kb.nextInt();
		int i = 1;
		do {
			System.out.println(i);
			i++;
		} while (i <= n);
		kb.close();
	}
}

