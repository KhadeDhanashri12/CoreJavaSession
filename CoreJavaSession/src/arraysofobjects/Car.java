package arraysofobjects;

public class Car {
	int id;
	String name,company;
	long price;
	Engine e;
	
	Car(int id,String name,String company,long price,Engine e)
	{
		this.id=id;
		this.name=name;
		this.company=company;
		this.price=price;
		this.e=e;
	}
	
	public String toString()
	{
		return id+" "+name+" "+company+" "+price+" "+e;
	}



}
