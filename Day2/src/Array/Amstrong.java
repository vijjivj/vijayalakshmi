package Array;

public class Amstrong {

	public static void main(String[] args) {
		
	           int number = 153;
	        boolean isArmstrong = isArmstrong(number);
	     if (isArmstrong) {
	            System.out.println(number + " is an Armstrong number");
	        } else {
	            System.out.println(number + " is not an Armstrong number");
	        }
	    }
	    
	    private static boolean isArmstrong(int n) {
	            int sum = 0;
	        int temp = n;
	           int digits = String.valueOf(n).length();
	        
	        while (temp > 0) {
	            int remainder = temp % 10;
	            sum += Math.pow(remainder, digits);
	            temp /= 10;
	        }
	        
	    return sum == n;
	    }
	

}
