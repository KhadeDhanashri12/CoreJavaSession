package Wrapper;

public class Demo {
	void display(int a)
	{
		System.out.println("data type int");
	}
	
	void display(float a)
	{
		System.out.println("data type float");
	}
	
	void display(Integer a)
	{
		System.out.println("Integer class");
	}
	
	void display(Float a)
	{
		System.out.println("Float class");
	}
	
	void display(Number a)
	{
		System.out.println("Number class");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d= new Demo();
		d.display(10.5f);
		
		System.out.println(Character.isUpperCase('A'));
		System.out.println(Character.isLowerCase('a'));
		
		System.out.println("Is Digit: "+Character.isDigit('9'));
		
		System.out.println("is letter: "+Character.isLetter('f'));
		
		System.out.println("White space: "+Character.isWhitespace('9'));
		
		System.out.println(Character.getNumericValue('2'));  //'2'
		
		
		System.out.println(Integer.compare(270, 30));  //-ve,0,+ve
		
		System.out.println(Integer.max(90,45));
		
		
		System.out.println(Integer.min(76, 90));
		
		System.out.println(Integer.toHexString(198));
		
		System.out.println(Integer.toBinaryString(10));
		
		System.out.println(Integer.toOctalString(45));
		
		System.out.println(Integer.sum(10, 30));
		
		
		//Float.
		

	}
}
