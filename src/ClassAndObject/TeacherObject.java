package ClassAndObject;

public class TeacherObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Teacher tchr1 = new Teacher();
    Teacher tchr2 = new Teacher();
    
    tchr1.name = "Khalid";
    tchr1.age = 41;
    tchr1.id = 1;
    tchr1.gender = 'F';
    
    tchr2.name = "Tariq";
    tchr2.age = 38;
    tchr2.id = 2;
    tchr2.gender = 'F';
    
    
    System.out.println("****************************");
    System.out.println("Object tchr1 " + tchr1.name );
    System.out.println("Object tchr1 " + tchr1.age );
    System.out.println("Object tchr1 " + tchr1.id );
    System.out.println("Object tchr1 " + tchr1.gender );
    System.out.println("*******************************");
    System.out.println("Object tchr2 " + tchr2.name );
    System.out.println("Object tchr2 " + tchr2.age );
    System.out.println("Object tchr2 " + tchr2.id );
    System.out.println("Object tchr2 " + tchr2.gender );
    
    System.out.println("*************************");
    Teacher tchr3 = new Teacher ("Qais", 27, 3, 'F');
    
    System.out.println("Object tchr3 " + tchr3.name );
    System.out.println("Object tchr3 " + tchr3.age );
    System.out.println("Object tchr3 " + tchr3.id );
    System.out.println("Object tchr3 " + tchr3.gender );
    
    
    
	}

}
