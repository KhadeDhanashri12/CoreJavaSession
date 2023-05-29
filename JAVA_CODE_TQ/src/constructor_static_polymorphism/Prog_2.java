package constructor_static_polymorphism;
//Sample code for constructor chaining

public class Prog_2 {
	int id;
	String name;
	long mobileNo;

	public Prog_2() // default constructor
	{
		this(9787756480l); // it will call the One Parameterized constructor
		System.out.println("i m in default constructor");
	}

	public Prog_2(long no) // One Parameterized constructor
	{

		System.out.println("i m in One Parameterized constructor");

		// assigning the value to instance variable

		this.mobileNo = no; // this keyword hold current object reference

	}

	public Prog_2(int id, String name) // Two Parameterized constructor
	{
		this(); // it will call the default constructor
		System.out.println("i m in Two Parameterized constructor");

		// assigning the value to instance variable

		this.id = id;
		this.name = name;
		
		System.out.println(this.id);
		System.out.println(this.name);

		// please uncomment the below code and see output

		// id = id;
		// name = name;
		// System.out.println(this.id);
		// System.out.println(this.name);
	}

	public static void main(String[] args) {

		// object creation it will call Two Parameterized constructor

		Prog_2 e = new Prog_2(10, "sonal");

	}

}

