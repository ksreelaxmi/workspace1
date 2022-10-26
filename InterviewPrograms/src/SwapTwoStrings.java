import java.util.Scanner;

public class SwapTwoStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first string");
		String str1 = scan.next();

		System.out.println("Enter second string");
		String str2 = scan.next();

		str1 = str1 + str2;// welcome
		str2 = str1.substring(0, str1.length() - str2.length());// 6-3//wel
		str1 = str1.substring(str2.length());
		System.out.println(str2.length());
		System.out.println("String1 is " + str1 + " string2 is " + str2);

	}

}
