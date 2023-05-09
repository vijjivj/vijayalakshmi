package ConstructorExa;

public class PersonCons {

	private int Age;
	private String Name;
	
	public PersonCons(int a , String n)
	{
		Age =a;
		Name = "n";
	}
	
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	
}
