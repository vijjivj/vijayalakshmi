package EncapsulationExa;

public class PersonMain {

	public static void main(String[] args) {

		Person obj = new Person();
		obj.setAge(11);
		obj.setName("Anu");
		System.out.println( obj.getAge()+";"+ obj.getName());
	}
}