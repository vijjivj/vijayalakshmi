package Thread;

class ABC extends Thread{
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println("Jesu");
			try {
				Thread.sleep(2);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
class DEF extends Thread{
	public void run() {
		for(int i =1;i<=10;i++) {
			System.out.println("Anu");
			try {
				Thread.sleep(2);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class Sleep {

	public static void main(String[] args) {

		A obj1=new A();
		B obj2=new B();
		
		obj2.setPriority(Thread.MAX_PRIORITY);
		
		obj1.start();
		obj2.start();
		
	}

}
