package programme90;
import java.util.Scanner;

public class Q90h {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kk= new Scanner(System.in);
		System.out.print("Enter a number:  ");
		int n= kk.nextInt();
		
		 for (int i = 1; i <= n; i++)
	        {
	            for (int j = 5 - i; j >= 1; j--)
	            {
	                System.out.print(" ");
	            }
	            for (int j = 1; j <= 2 * i - 1; j++)
	            {
	                System.out.print("*");
	            }
	            System.out.println();
	        }
	        for (int i = 4; i >= 1; i--)
	        {
	            for (int j = 5 - i; j >= 1; j--)
	            {
	                System.out.print(" ");
	            }
	            for (int j = 1; j <= 2 * i - 1; j++)
	            {
	                System.out.print("*");
	            }
	            System.out.println();
	        }
		kk.close();
	}

}


