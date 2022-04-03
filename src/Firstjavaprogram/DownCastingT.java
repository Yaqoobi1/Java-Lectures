package Firstjavaprogram;

class Parent{
	void show()
	{
		System.out.println("Parent");
	}
}
	class Child extends Parent{
		@Override
		void show()
		{
			System.out.println("Child");
		}
		void showChild()
		{
			System.out.println("Child unique method");
		}
	}

public class DownCastingT {

	public static void main(String[] args) {
		//Upcasting
		  Parent obj1 = new Child();
		  obj1.show();//Here we can not get methed from child class because the obj1 is the 
		               //object of Parent class
		  //DownCasting
//		  Child obj2 = (Child)obj1; //now like type casting, we converted to the down casting.
//		  obj2.showChild();//now can get method form Child class too.
		  
		  //Using instacneof operator for downcasting
		     if(obj1 instanceof Child)
	  {
			  Child obj2 = (Child )obj1;
		      obj2.showChild();
		  }
			  
		  

	}

}
