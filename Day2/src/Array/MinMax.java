package Array;

public class MinMax {

	public static void main(String[] args) {
 
int[] numbers = { 5, 3, 7, 1, 8, 4, 2 };
        
        int min = numbers[0];
        int max = numbers[0];
        
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        
        System.out.println("The minimum value in the array is: " + min);
        System.out.println("The maximum value in the array is: " + max);
    }
}