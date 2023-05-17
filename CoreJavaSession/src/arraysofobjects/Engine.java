package arraysofobjects;

public class Engine {
	String company;
	int power;
	
	Engine(String company,int power)
	{
		this.company=company;
		this.power=power;
	}
	
	public String toString()
	{
		return company+" "+power;
	}


}
