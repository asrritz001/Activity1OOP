package programme90;
import java.util.Scanner;

public class Q35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner kb= new Scanner(System.in);
    	System.out.print("enter a number: ");
		int num= kb.nextInt();
    	System.out.print("enter a power: ");  
    	int pwr=kb.nextInt();     // this variable is defined to know the power for a number//
    	int i=1;
    	int result=1;
    	
    	while(i<=pwr) {
    		i++;
    	 result= num*result;
    	}
    	System.out.print("The Power of "+num + " is "+ result);
    	kb.close();
	}

}

