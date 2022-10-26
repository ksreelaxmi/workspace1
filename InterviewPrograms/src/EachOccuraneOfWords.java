import java.util.HashMap;
import java.util.Scanner;

public class EachOccuraneOfWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a String");
		String str=scan.nextLine();
		String str1=str.toLowerCase();
		String[] s=str1.split(" ");
		HashMap<String,Integer> map=new HashMap<String,Integer>();
		for(int i=0;i<s.length;i++)
		{
			if(map.containsKey(s[i])) {
				int count=map.get(s[i]);
				map.put(s[i], count+1);
			}
			else
				map.put(s[i], 1);
		}
		System.out.println(map);
	}

}
