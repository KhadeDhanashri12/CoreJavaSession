package polymorphism;

public class Addition {

	void add(int a, int b)
	{
		System.out.println("Addition is:"+(a+b));
	}
	void add(int a,int b,int c)
	{
		System.out.println("Addition is:"+(a+b+c));
	}
	void add(String a,String b)
	{
		System.out.println("Addition is:"+(a+b));
	}
	void add(String a,float b)
	{
		System.out.println("Addition is:"+a+" "+b);
	}
	void add(float a,String b)
	{
		System.out.println("Addition is:"+a+" "+b);
	}
	public static void main(String[] args) {
		Addition obj=new Addition();
		obj.add(10,70);
		obj.add(10,20,70);
		obj.add("d","k");
		obj.add("dhanu",89.79f);
		obj.add(78.9f,"khade");
		
		

	}

}
