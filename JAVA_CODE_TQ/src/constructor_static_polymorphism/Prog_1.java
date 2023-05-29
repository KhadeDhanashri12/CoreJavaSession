package constructor_static_polymorphism;

//Sample code for constructor

public class Prog_1 {
	int id;
	String name;

	// if you are handling constructor in your class than
	// JVM will not handle default constructor for you.

	public Prog_1() // default constructor
	{
		System.out.println("i m in default constructor");
	}

	public Prog_1(int i, String name) // Parameterized constructor
	{
		System.out.println("i m in Parameterized constructor");

		// assigning the value to instance variable

		this.id = i;
		this.name = name;
	}

	public static void main(String[] args) {

		// object creation it will call default constructor

		Prog_1 p = new Prog_1();

		// object creation it will call Parameterized constructor

		Prog_1 e = new Prog_1(10, "sonal");
}
}
