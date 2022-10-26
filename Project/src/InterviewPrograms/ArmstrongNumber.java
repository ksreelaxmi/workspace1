package InterviewPrograms;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int num=sc.nextInt();
		int rem,res=0;
		int temp=num;
		while(num>0) {
			rem=num%10;
			res+=Math.pow(rem, 3);
			num=num/10;
		}
		if(temp==res) {
			System.out.println("Armstrong number");
		}
		else
			System.out.println("Not a Armstrong number");
	}

}
