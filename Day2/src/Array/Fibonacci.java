package Array;

public class Fibonacci {

	public static void main(String[] args) {
int number = 10;
        System.out.println("The Fibonacci series up to " + number + " is:");
        for (int i = 0; i <= number; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
    
    private static int fibonacci(int n) {
      if (n == 0) {
            return 0;
              } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
	
