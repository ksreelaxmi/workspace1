package InterviewPrograms;

public class ex {
	public static void main(String[] args) {

	    String input = "Table is this Table";
	    String[] arr1 = input.split(" ");
	    int count = 0;

	    for (int i = 0; i < arr1.length; i++) {
	        count = 0;

	        for (int j = 0; j < arr1.length; j++) {
	            String temp = arr1[j]; //table
	            String temp1 = arr1[i]; //3 //table

	            if (j < i && temp.contentEquals(temp1)) {
	                break;

	            }
	            if (temp.contentEquals(temp1)) {
	                count = count + 1;

	            }

	            if (j == arr1.length - 1) {
	                System.out.println( arr1[i] + " is present " + count + " number of times");

	            }

	        }

	    }

	}

}
