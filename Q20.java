package programme90;

public class Q20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 42;
		int num2 = 85;
		int num3 = 78;

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
	}

}

