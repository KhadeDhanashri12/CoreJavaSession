package class_object_InstanceVariable;

public class Prog_1 {

	// instance variable - which variables define at class level.
		int id;
		String name;

		public static void main(String[] args) {

			Prog_1 a = new Prog_1(); // object creation of Prog_1 class using new keyword

			// printing instance variable

			System.out.println(a.id); // output - 0 default value

			System.out.println(a.name); // output - null default value

			// you can create multiple objects
			
			Prog_1 b = new Prog_1();

			Prog_1 c = new Prog_1();

		}
}
