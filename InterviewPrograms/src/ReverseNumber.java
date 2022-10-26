import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number");
		int num=scan.nextInt();
		int temp, sum=0,rem;
		temp=num;
		while(num>0) { //153 //15 //1
			rem=num%10; //3 //5 //1
			sum=(sum*10)+rem;//3 //35 //351
			num=num/10;//15 //1 //0
			
		}
		 
		System.out.println("reverse of a "+temp +" is " +sum);
          
	}

}
