package InterviewPrograms;

import java.util.Scanner;

public class DuplicateCharactersInaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//sreelaxai
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a string");
	String	s=scan.next();
		
	//	String s="sreeelaxaie";
	int count=0;
		char[] str=s.toCharArray();
		for(int i=0;i<str.length;i++) {
			count=1;
			for(int j=i+1;j<str.length;j++) {
				if(str[i]==str[j]) {
					count++;
					str[j]='0';
				}
				
			}
			if(count>1 && str[i]!='0') {
				System.out.println(str[i]);
			}
		}
	}

}
