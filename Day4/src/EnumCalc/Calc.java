package EnumCalc;

import java.util.Scanner;

enum Cal{
	Addition,Subtraction,Multiplication,Division;
}
public class Calc {

	public static void main(String[] args) {
			
			int n1, n2;
			Scanner scanner = new Scanner(System.in);
			 System.out.println("Enter first number:");
	           Cal c = Cal.Subtraction;
	           n1= scanner.nextInt();
	           System.out.println("Enter Second number");
	           n2= scanner.nextInt();
	           scanner.close();
	           int output;
	           
	           switch(c)
	           {
	           case Addition:
	        	   output=n1+n2;
	        	   break;
	           case Subtraction:
	        	   output = n1 - n2;
	                break;

	            case Multiplication:
	            	output = n1 * n2;
	                break;

	            case Division:
	            	output = n1 / n2;
	                break;

	           
	            default:
	                System.out.printf("Error");
	                return;
	        }

	        System.out.println(n1+" "+c+" "+n2+": "+output);
	    }
	
	           }


