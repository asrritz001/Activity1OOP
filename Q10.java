package programme90;
import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb= new Scanner(System.in);
		System.out.print("enter a number  ");
	      int num= kb.nextInt();
	      
	      if(num<0) {
	    	  System.out.print( num+ " number is a negative number");
	      }else if(num>0) {
	    	  System.out.print( num+ " number is a positive number");
	      }else{
	    	  System.out.print( num+ " number is equals to 0");
	      }
        kb.close();
	}

}
