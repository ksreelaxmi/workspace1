import java.util.Scanner;

public class PrimeAndFibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  fct_count,prm_count = 0;

        System.out.println("First 100 prime numbers are :");

        for(int i=2;i<=100;i++) {
        	fct_count=0;
        	
        	
        	for(int j=i;j>=1;j--) {
        		if (i % j == 0) { //2%2=0 2%1=0
               fct_count = fct_count + 1; // a factor found, increment the factor count
               
        	}
        }
        	if (fct_count == 2){ // only 2 factors, it's prime so print i and increment the prime number count
             System.out.print("" + i + " ");//2

        	

	}
        }
	}
}
