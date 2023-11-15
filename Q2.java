package programme90;
import java.util.Scanner;
public class Q2 {
	

public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			Scanner kb = new Scanner(System.in);
			System.out.print("enter a number 1 ");
	        double num1=kb.nextDouble();
			System.out.print("enter a number 2 ");
			double num2=kb.nextDouble();
			System.out.print("enter a number 3 ");
			double num3=kb.nextDouble();
					double average= (num1+num2+num3)/3;
			System.out.println(" the average is : " + average);
			
			kb.close();
		}

	}


