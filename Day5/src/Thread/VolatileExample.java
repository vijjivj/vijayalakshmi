package Thread;

import java.util.Scanner;

public class VolatileExample {

	private volatile String userInput;

	public static void main(String[] args) {
		VolatileExample obj = new VolatileExample();
		obj.start();
	}

	public void start() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter some text: ");
		userInput = sc.nextLine();
		System.out.println("You entered: " + userInput);
		sc.close();
	}
}
