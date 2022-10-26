import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number");
		int num=scan.nextInt();
		int i;
		for(i=2;i<num;i++) {
			if(num%i==0) {
				System.out.println(num+" is a non prime Number");
				break;
			}
			
		}
		if(i==num) {
			System.out.println("prime Number");
		}

	}

}
