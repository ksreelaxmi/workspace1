import java.util.Scanner;

public class PrintAlternativeCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=scan.next();
		
		for(int i=0;i<s.length();i+=2) {
			
				System.out.println(s.charAt(i));
			
		}
		

	}

}
