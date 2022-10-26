package InterviewPrograms;

import java.util.Scanner;

public class fibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
	    int num=sc.nextInt();
	    int nextTerm,firstTerm=0,secondTerm=1;
	    System.out.println("Fibonacci series");
	    for(int i=1;i<=num;i++) {
	    	System.out.print(firstTerm+ " ");
	    	nextTerm=secondTerm+firstTerm;
	    	firstTerm=secondTerm;
	    	secondTerm=nextTerm;
	    }

	}

}
