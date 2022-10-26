package InterviewPrograms;

import java.util.Scanner;

public class ReplaceUppercaseToLoWerCaseViceVersa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
	String str=	sc.next();
	
	StringBuffer newStr=new StringBuffer(str);

	for(int i=0;i<str.length();i++)
	{
	  if(Character.isUpperCase(str.charAt(i)))
	   {
	     newStr.setCharAt(i,Character.toLowerCase(str.charAt(i)));
	   }
	   else if(Character.isLowerCase(str.charAt(i)))
	   {
	     newStr.setCharAt(i, Character.toUpperCase(str.charAt(i)));
	    		
	   }
	}
	System.out.println(newStr);
		
		

	}

}
