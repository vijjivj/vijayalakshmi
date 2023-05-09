package Practice;

import java.util.Scanner;

public class ThirdQuestion {

	public static void main(String[] args) {
   Scanner sc = new Scanner (System.in);
   int num1,num2;
   System.out.println("first num1:");
   num1 = sc.nextInt();
   System.out.println("Second num2");
   num2 = sc.nextInt();
   if(num1>num2)
   {
	   System.out.println(num1+"is greater than"+num2);
   }
   else if(num1<num2)
   {
	   System.out.println(num1+"is lessthan"+num2);}
	   else
	   {
		   System.out.println(num1+"equals to"+num2);
	   }
   }
	}


