package encapsulationExample;

public class Runner {

	public static void main(String[] args) {
        Student obj1 = new Student();
		
		System.out.println(obj1.getFirstName());
		
		obj1.setFirstName("Jack");
		obj1.setLastName("Something");
		
		
		System.out.println(obj1.getFirstName());
		System.out.println(obj1.getLastName());
		
		
		Student obj2 = new Student();
		obj2.setFirstName("Tariq");// we can create as many object as we want
		obj2.setLastName("Yaqoobi");
		
		System.out.println(obj2.getFirstName());
		System.out.println(obj2.getLastName());
	}
}
