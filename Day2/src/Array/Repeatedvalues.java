package Array;

public class Repeatedvalues {

	public static void main(String[] args) {
		 int[] numbers = { 5, 3, 7, 1, 8, 4, 2, 5, 8 };
	        
	        int count = 0;
	        
	        for (int i = 0; i < numbers.length; i++) {
	            for (int j = i + 1; j < numbers.length; j++) {
	                if (numbers[i] == numbers[j]) {
	                    count++;
	                    break;
	                }
	            }
	        }
	        
	        System.out.println("The number of repeated values in the array is: " + count);
	    
	
	}

}
