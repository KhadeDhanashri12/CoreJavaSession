package classesandobject;

public class StaticDemo {
	int a=100;
	static int b=1000;
	
	//non static => both static as well as non static members/variables directly
	void display()
	{
		System.out.println(a);
		System.out.println(b);
	}

	//static:  can access only static directly
	//         non-static we require object
	static void show()
	{
		StaticDemo sd= new StaticDemo();
		System.out.println(sd.a);
		System.out.println(b);
	}
	
	static//1.7
	{
		System.out.println("static block 1");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//System.out.println("inside main method");
		
		
		Student1Main.main(null);

}
}
