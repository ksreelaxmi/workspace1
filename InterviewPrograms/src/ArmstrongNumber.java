import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number");
		int num=scan.nextInt();
		int sum=0,rem,temp;
		temp=num;
		while(num>0) {
			rem=num%10;
			
			num=num/10;
			sum=sum+(rem*rem*rem);
		}
		if(temp==sum) {
			System.out.println("Armstrong Number");
		}
		else
			System.out.println("Not Armstrong Number ");

	}

}
