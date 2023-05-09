package Thread;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Buffer {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
	System.out.println("Enter a num");
	
	InputStreamReader is = new InputStreamReader(System.in);
	BufferedReader bf = new BufferedReader(is);
	
	int num = Integer.parseInt(bf.readLine());
	System.out.println(num);
	
	bf.close();
	}
}
