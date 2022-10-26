import java.util.Scanner;

public class NumberOfWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = scan.nextLine();
		int count = 1;
		for (int i = 0; i < str.length()-1; i++) {
			//System.out.println("hello");
			if ((str.charAt(i)== ' ')) {
				count++;
			}
		}
		System.out.println(count);
	}

}
