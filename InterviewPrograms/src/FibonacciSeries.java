import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter number of terms for series");
		int num=scan.nextInt();
		int firstTerm=0,secondTerm=1,nextTerm;
		for(int i=0;i<num;i++) {//3 i=1,2,3
			System.out.println(firstTerm);//0 //1 //1
			nextTerm=firstTerm+secondTerm;//1 //2 //3
			firstTerm=secondTerm;//1 //1 //2
			secondTerm=nextTerm;//1 //2 //3
		}

	}

}
