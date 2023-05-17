package containment;

public class Car1 {
	String b_name;
	String color;
	int price;
	
	void CarInformation()
	{
		System.out.println("printing car information");
	}
	
	
}

class Honda extends Car1
{
	String b_name="Honda";
	String color="red";
	int price=300000;
	void display()
	{
		System.out.println(b_name+" "+color+" "+price);
	}
	
}
class Audi extends Car1
{
	String b_name="Audi";
	String color="silver";
	int price=500000;
	void display()
	{
		System.out.println(b_name+" "+color+" "+price);
	}
	
}

