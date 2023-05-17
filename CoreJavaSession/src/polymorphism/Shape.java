package polymorphism;

public class Shape {
	
	void area(int a,int r) 
	{
		System.out.println("area of circle is:"+(a*3.14*r));
	}
	void area (int l,int b,int h)
	{
		System.out.println("area of rectangle is:"+(l*b*h));
	}
	static void area(int a)
	{
		System.out.println("area of square:"+(a*a));
	}
	static void area(int b,float h,int c)
	{
		System.out.println("area of triangle:"+(b*h*c));
	}

	public static void main(String[] args) {
		Shape s=new Shape();
		s.area(20, 67);
		s.area(20, 60, 50);
		area(20);
	    area(5, 10.6f, 4);
	}

}
