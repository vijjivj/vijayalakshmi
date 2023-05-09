package Exception;

public class ZException {

	public static void main(String[] args) {

		int n1=12;int n2=0;
		try {
            int result = n1 / n2;
            System.out.println("Result " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
	}
	}
}


