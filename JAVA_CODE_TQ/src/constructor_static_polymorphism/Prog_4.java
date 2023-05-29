package constructor_static_polymorphism;

//Sample code for method overloading

public class Prog_4 {
	public int add(int a, int b) // same name two Parameterized , int return type method
	{
		return a + b;
	}

	public int add(int a, int b, int c) // same name three Parameterized , int return type method
	{
		return a + b + c;
	}

	public static void main(String[] args) {
		Prog_4 p = new Prog_4(); // object creation

		// method call
		System.out.println(p.add(11, 11));
		
		System.out.println(p.add(11, 11, 11));
	}
}

