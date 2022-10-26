import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

public class SortingInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String string1="Interview";
		System.out.println(" String1 is "+string1);
		String string2="discussion";
		System.out.println(" String2 is "+string2);
		string1=string2;
		System.out.println("Remodifing String1 is "+string1);
		
		Integer[] arr= {13,7,98,23,13,13,10};
		//Ascending order
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		//Descending Order
		Arrays.sort(arr,Collections.reverseOrder());
		System.out.println(Arrays.toString(arr));
		//Printing Unique values
		HashMap<Integer,Integer> map=new HashMap<>();
		//putting values from array to map
		for(int i=0;i<arr.length;i++) {
			map.put(arr[i], i);
		}
		System.out.println(map.keySet());
	String str="lakksklmi";
	HashMap<Character,Integer> hashmap=new HashMap<>();
	for(int i=0;i<str.length();i++) {
		char ch=str.charAt(i);
		if(hashmap.containsKey(ch)) {
			int count=hashmap.get(ch);
			hashmap.put(ch, ++count);
		}
		else {
			hashmap.put(ch, 1);
		}
	}
	System.out.println(hashmap.toString());
	String s="sree";
	char c='e';
	int count=0;
	for(int i=0;i<s.length();i++) {
		if(s.charAt(i)==c) {
			count++;
		}
	}
String cs=	Integer.toString(count);
String cc=Character.toString(c);
s=s.replace(cc, cs);
System.out.println(s);

String name="lols",rev="";
for(int i=name.length()-1;i>=0;i--) {
	rev=rev+name.charAt(i);
}
System.out.println("Reverse string is "+rev);
	}
	
}
