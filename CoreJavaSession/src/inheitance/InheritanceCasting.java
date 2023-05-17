package inheitance;

class Car12
{
	String b_name;
	int price;
		
}

class Audi12 extends Car12 
{
	String b_name="Audi";
	int price=3000000;
	
	void show()
	{
		System.out.println(b_name+""+price);
	}
	
}

public class InheritanceCasting {
	public static void main(String[] args) 
	{
		Audi12 c=new Audi12();
		c.show();	

	}

}
