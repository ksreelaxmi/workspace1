import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter number of terms for series");
		int num=scan.nextInt();
		int firstTerm=0,secondTerm=1,nextTerm,k=0,fct_count,i;
		for( i=2;i<num;i++) {//3 i=1,2,3
			fct_count=0;
				
				//0 1 1 2 3 5 8 13 21
					//System.out.print(firstTerm+ " ");//0 //1 //1
					nextTerm=firstTerm+secondTerm;
					firstTerm=secondTerm;//1
					secondTerm=nextTerm;//1 //2 //3k
					
				
				for(int j=i;j>=1;j--) {
					
					if(nextTerm>=2 && nextTerm%j ==0) {
					//	System.out.println(firstTerm);
						fct_count=fct_count+1;
					}
				}
				if(fct_count==2) {
					
					System.out.print(nextTerm+ " ");
				}
				
				
					
					
			
	            

		}
		
				// 2 3 5 8 13 21
		
				

	}
		
}



