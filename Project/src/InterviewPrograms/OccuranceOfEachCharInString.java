package InterviewPrograms;

import java.util.HashMap;
import java.util.Scanner;

public class OccuranceOfEachCharInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the string");
    String str=sc.next();
    HashMap<Character,Integer> map=new HashMap<>();

    for(int i=0;i<str.length();i++)
    {
     if(map.containsKey(str.charAt(i)))
    		 
      {
        int count=map.get(str.charAt(i));
        map.put(str.charAt(i),++count);
    }
    else{
    map.put(str.charAt(i),1);
    }
    }
      
System.out.println(map);
	}

}
