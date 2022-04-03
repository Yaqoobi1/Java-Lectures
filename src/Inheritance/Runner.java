package Inheritance;

public class Runner {

	public static void main(String[] args) {
		
	B obj = new B();
		
		obj.setName("something");
		obj.setID(10);
		obj.setAge(25);
		System.out.println(obj.getName());
		System.out.println(obj.getID());
		System.out.println(obj.getAge());
		
		System.out.println(obj.getName().length());
		
		
	}
}
