package constructor_static_polymorphism;
//Sample code for method overloading

public class Prog_3 {
	int id;
	String name;
	long mobileNo;
	String address;

	// in method overloading same method parameters different

	// void func() { ... }
	// void func(int a) { ... }
	// float func(double a) { ... }
	// float func(int a, float b) { ... }

	public void setInfo(int id, String name) // same name two Parameterized method
	{
		System.out.println("id= " + id);
		System.out.println("name= " + name);
	}

	public void setInfo(long no) // same name one Parameterized method
	{
		System.out.println("mobile no= " + mobileNo);
	}

	public void setInfo(String add) // same name one Parameterized method
	{
		System.out.println("address= " + add);
	}

	public static void main(String[] args) {

		Prog_3 p = new Prog_3(); // object creation

		// method call

		p.setInfo(9589586558l);

		p.setInfo("Pune");

		p.setInfo(101, "Jay");

	}

}
