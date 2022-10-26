package InterviewPrograms;

import java.util.Scanner;

public class NumberOfWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enet the string");
	String str=sc.nextLine();
	String[] arr=str.split(" ");
	for(int i=0;i<arr.length;i++) {
		int count=0;
		for(int j=0;j<arr.length;j++) {
			String temp=arr[j];
			String temp1=arr[i];
			if(j<i && temp.equalsIgnoreCase(temp1)) {
				break;
			}
			if(temp.equalsIgnoreCase(temp1))
			
			{
				count++;
			}
			
		}
		if(count>0) {
			System.out.println(arr[i]+" is present "+count+" in a string");
		}
	}

	}

}
