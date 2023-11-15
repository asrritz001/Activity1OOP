package programme90;

import java.util.Scanner;

public class Q12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kb = new Scanner(System.in);
		System.out.print(" enter any alphabet ");

		char cc = kb.next().charAt(0);
		if (cc == 'a' || cc == 'e' || cc == 'i' || cc == 'o' || cc == 'u') {
			System.out.print(cc + " is a Vowel");
		} else {
			System.out.print(cc + " is consonant");
		}
		kb.close();
	}

}
