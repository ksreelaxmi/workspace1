import java.util.Scanner;

public class EvenOrOddNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter a number");
	int number=	scan.nextInt();
	if(number%2==0) {
		System.out.println(number+" is even number");
	}
	else
		System.out.println(number+ " is odd number");

	}

}
