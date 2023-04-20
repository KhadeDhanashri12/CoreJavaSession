package polymorphism;

public class Area {
	void area(int a,int r)
	{
	System.out.println("area of circle is:"+(a*3.14*r));	
	}
	void area(int l,int b,int h)
	{
		System.out.println("area of rectangle is:"+(l*b*h));	
	}
	void area(int a)
	{
		System.out.println("area of square "+(a*a));	
	}
	void area(int b,float h,int c)
	{
		System.out.println("area of triangle "+(b*h*c));	
	}

	public static void main(String[] args) {
		Area obj=new Area();
		obj.area(20,67);
		obj.area(20,60,50);
		obj.area(4);
		obj.area(5,10.7f,4);
		

	}

}
