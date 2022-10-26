import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number");
		int num=s.nextInt();
		int fact=1;
		for(int i=1;i<=num;i++) {
			fact=fact*i;//2 6 
		}
		System.out.println(fact);
		

	}

}
