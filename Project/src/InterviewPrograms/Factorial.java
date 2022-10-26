

package InterviewPrograms;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
	int number=	scan.nextInt();
	int fact=1;
	for(int i=1;i<=number;i++) {
		fact=fact*i;
	}
	System.out.println(fact);

	}

}
