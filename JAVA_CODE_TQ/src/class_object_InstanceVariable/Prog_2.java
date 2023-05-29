package class_object_InstanceVariable;


//Sample code for methods
public class Prog_2 {

	// Access modifier returnType nameOfMethod (Parameter List optional depend on you) {
	// // method body
	// }

	// non-parameterized method, return type - void
	public void display() {
		System.out.println("in display method");
	}

	// 2 parameterized method - you can create 1,2,3 etc parameterized method,
	// return type - void
	public void add(int a, int b) {
		System.out.println("in add method " + (a + b));
	}

	// 2 parameterized method,
	// return type - int (you can change return type depend on which type of
	// variable you have to return)
	public int sub(int a, int b) {
		System.out.println("in sub method " + (a - b));
		return b; // return value
	}

	public static void main(String[] args) {

		Prog_2 p = new Prog_2();

		// below method call - non static method should have to call on object

		p.display();

		p.add(10, 20);

		p.sub(8, 5);

		System.out.println(p.sub(6, 7)); // here return value of method will print

	}

}
