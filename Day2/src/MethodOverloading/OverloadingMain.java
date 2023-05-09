package MethodOverloading;

public class OverloadingMain {

	public static void main(String[] args) {

		OverloadingExample obj = new OverloadingExample();
		int r=obj.add(2, 4);
		System.out.println(r);
		
		double r1 = obj.add(2, 3, 0.2);
		System.out.println(r1);
	}

}
