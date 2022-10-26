import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number");
		int num=scan.nextInt();
		
		int sum=0,temp,rem;
		temp=num;
		while(num>0) {
			rem=num%10;
			sum=(sum*10)+rem;
			num=num/10;
		}

		if(sum==temp) {
			System.out.println("Palindrome Number");
		}
		else
			System.out.println("Not a Palindrome Number");
	}

}
