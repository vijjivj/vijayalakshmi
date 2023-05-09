package TypeCast;

public class Main {

	public static void main(String[] args) {	
	//UpCasting
    Car obj = new Drive();   //( sub class obj to the  super class reference )
    obj.driving();
//downCasting
	Drive obj1 =(Drive) obj;   
	obj1.PlayingMusic();
	obj1.Sleep();	
}
}