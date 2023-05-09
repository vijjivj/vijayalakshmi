package Exception;


class AnuException extends Exception {
	
	public AnuException(String Message) {
		super("Error 404");
	}
}
public class Custom {

	public static void main(String[] args) {
 
		    {  
		        try  
		        {  
		             
		            throw new AnuException("Error 404");  
		        }  
		        catch (AnuException obj)  
		        {  
		            System.out.println("Caught the exception" + obj.getMessage());  
		             
		        }  
		  
		        System.out.println("rest of the code...");    
		    }  
		}  
	}


