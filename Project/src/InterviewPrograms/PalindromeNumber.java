package InterviewPrograms;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int rem,sum=0;
		int temp=num;
		while(num>0) {
			rem=num%10;
			sum=(sum*10)+rem;
			num=num/10;
		}
		if(temp==sum) {
			System.out.println("Palindrome number");
		}
		else
			System.out.println(" Not a Palindrome number");

	}

}
