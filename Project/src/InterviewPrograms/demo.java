package InterviewPrograms;

import java.util.HashMap;

public class demo {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int[] arr = { 13579, 2468, 111315, 1012, 17 };
//		HashMap<Integer, Integer> map = new HashMap<>();
//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i] %2 != 0 && i % 2 != 0) {
//				map.put(arr[i], i);
//			} else if (arr[i] %2 == 0 && i % 2 == 0) {
//				map.put(arr[i], i);
//			}
//		}
//
//		System.out.println(map);
//	}
	
	public static void arrangeOddAndEven(int arr[], int n)
	{
	    int oddInd = 1;
	    int evenInd = 0;
	    while (true)
	    {
	        while (evenInd < n && arr[evenInd] % 2 == 0)
	        	//0<5     //2
	            evenInd += 2;
	        //2
	              
	        while (oddInd < n && arr[oddInd] % 2 == 1)
	        	//1<5 //3
	            oddInd += 2;
	              //3
	        if (evenInd < n && oddInd < n)
	        	//2<5   3<5
	        	
	            {
	                int temp = arr[evenInd];
	                //3 //12
	                //12
	                arr[evenInd] = arr[oddInd];
	                //6 //1 //1
	                arr[oddInd] = temp;
	                //3 //12
	            }
	              
	        else
	            break;
	    }
	}
	  
	// function to print the array
	public static void printArray(int arr[], int n)
	{
	    for (int i = 0; i < n; i++)
	        System.out.print(arr[i] + " ");
	}
	      
	// Driver function 
	public static void main(String argc[]){
	    int arr[] = { 3, 6, 12, 1, 5, 8 };
	    int n = 6;
	  
	    System.out.print("Original Array: ");
	    printArray(arr, n);
	  
	    arrangeOddAndEven(arr, n);
	  
	    System.out.print("\nModified Array: ");
	    printArray(arr, n);
	}

}
