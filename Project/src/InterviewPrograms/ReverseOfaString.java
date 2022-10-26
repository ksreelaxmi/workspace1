package InterviewPrograms;

import java.util.Scanner;

public class ReverseOfaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.next();
		String st="hh we";
		String[] arr1 = st.split(" ");
		System.out.println(arr1[0]);
		System.out.println(" array 1"+arr1[1]);
		String rev="";
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		if(str.equals(rev)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
		System.out.println(rev);
	//Palindrome	
		StringBuilder sb=new StringBuilder(str);
		String str1=sb.reverse().toString();
		if(str.equals(str1)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}

	}

}
