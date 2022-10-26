import java.util.Scanner;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter a number");
	 int a=scan.nextInt();
	 System.out.println("Enter  number");
	 int b=scan.nextInt();
	 
	 a=a+b;//15
	 b=a-b;//10
	 a=a-b;//5
	 System.out.println("After swapping a value is "+a+ " and b value is "+b);
	 
	 

	}

}
