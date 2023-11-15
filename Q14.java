package programme90;

import java.util.Scanner;

public class Q14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		String a = kb.next();
		String b = kb.next();
		if (a.equals(b)) {
			System.out.print("both strings are equal ");
		} else {
			System.out.print("both strings are not equal ");
		}
		kb.close();
	}

}

