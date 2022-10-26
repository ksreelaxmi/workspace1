import java.util.Scanner;

public class SeparatingCharNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String number="";
		String letter="";
		String symbol="";
		String rev="";
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=scan.next();
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(Character.isDigit(ch))
			{
				number=number+ch;
			}
			else if(Character.isAlphabetic(ch))
			{
				letter+=ch;
			}
			else {
				symbol+=ch;
			}
		}
		 System.out.println("Alphabets in string:"+letter);
	     System.out.println("Numbers in String:"+number);
	     System.out.println("Symbols in String:"+symbol); 

	     for(int i=str.length()-1;i>=0;i--) {
	    	 rev=rev+str.charAt(i);
	     }
	     System.out.println("Reverse in String:"+rev); 

	}
	

}
