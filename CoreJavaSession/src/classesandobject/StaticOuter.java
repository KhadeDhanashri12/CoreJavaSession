package classesandobject;

public class StaticOuter {
	static int a=100;
	static int b=2000;
	
	static class Inner //can access only static members of outer class
	{
		 String city="Pune";
		 
		 void display()
		 {
			 System.out.println(a);
			 System.out.println(b);
			 System.out.println(city);
		 }
	}
}
