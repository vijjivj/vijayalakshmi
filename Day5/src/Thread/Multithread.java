package Thread;

class A extends Thread{
	public void run() {
		for(int i=1;i<=10;i++){
			System.out.println("Anu");
		}
	}
}

class B extends Thread{
	public void run() {
		for(int i=1;i<=10;i++){
			System.out.println("Jesu");
		}
	}
}
public class Multithread  {

	public static void main(String[] args) throws NumberFormatException {

		A obj1 = new A();
		B obj2 = new B();
		
		obj1.start();
		obj2.start();
		
	}

}
