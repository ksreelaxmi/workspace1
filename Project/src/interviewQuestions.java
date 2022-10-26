
import java.util.HashMap;
import java.util.Map;

public class interviewQuestions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="Sreelaxmi";
	int count=	countChar(name,'e');
System.out.println(count);

StringBuffer a = new StringBuffer("Software Testing Material");
//use reverse() method to reverse string
System.out.println(a.reverse());

int temp, size;
int array[] = {10, 20, 25, 63, 96, 57};
size = array.length;

for(int i = 0; i<size; i++ ){
   for(int j = i+1; j<size; j++){
      if(array[i]>array[j]){
         temp = array[i];
         array[i] = array[j];
         array[j] = temp;
      }
   }
}
System.out.println(" largest element is:: "+array[size-1]);

String str1 = "Good ", str2 = "morning ";    
System.out.println("Strings before swapping: " + str1 + " " + str2);    

//Concatenate both the string str1 and str2 and store it in str1    
str1 = str1 + str2;    
//Extract str2 from updated str1    
str2 = str1.substring(0, (str1.length() - str2.length()));    
//Extract str1 from updated str1    
str1 = str1.substring(str2.length());    
   
System.out.println("Strings after swapping: " + str1 + " " + str2);

//reverse a string
System.out.println(reverseString("Hi All"));
System.out.println(reverseString("Welcome to Edureka Blog"));

//
String s="sreess";
Map<Character,Integer> map = new HashMap<Character,Integer>();
for (int i = 0; i < s.length(); i++) {
  char c = s.charAt(i);
  if (map.containsKey(c)) {
    int cnt = map.get(c);
    map.put(c, ++cnt);
  } else {
    map.put(c, 1);
  }
 
}
System.out.println(map);

	}
	public static int countChar(String str, char c)
	{
	    int count = 0;
        
	    for(int i=0; i < str.length(); i++)
	    {    if(str.charAt(i) == c)
	            count++;
	    }
	   String s=Integer.toString(count);
	 str=   str.replace("e", s);
	    System.out.println(str);
	    return count;
	}
	public static String reverseString(String s){
		//Converting the string into a character array
		char c[]=s.toCharArray();
		String reverse="";
		//For loop to reverse a string
		for(int i=c.length-1;i>=0;i--){
		reverse+=c[i];
		
		}
		return reverse;
		}
		 
	
		

}
