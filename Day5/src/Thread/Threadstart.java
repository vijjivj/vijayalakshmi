package Thread;

public class Threadstart {

	public static void main(String[] args) {

		Thread obj = new Thread() {
            public void run() {
             
                System.out.println("Hello");
            }
        };

     
        obj.start();

        
        

    
	}

}
