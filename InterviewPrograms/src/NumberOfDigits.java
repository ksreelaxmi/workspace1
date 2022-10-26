import java.util.Scanner;

public class NumberOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number");
		int num=scan.nextInt();
		int a=0;
		if(num==0) {
			num=1;
		}
		
		while(num>0) {
			num=num/10;
			a++;
		}
System.out.println(a);
	}

}
