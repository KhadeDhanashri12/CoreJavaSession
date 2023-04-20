package classesandobject;

public class FacultyMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//reference variable
		//method
		//constructor
		
		Faculty f1= new Faculty();
		
		/*f1.id=23;
		f1.name="Ramesh";
		f1.subject="Java";
		f1.salary=60000;*/
		
		f1.setData(23, "Ramesh", "Java", 60000);
		
	//	f1.display();
		
		System.out.println(f1); //f1.toString()

	}
	}
