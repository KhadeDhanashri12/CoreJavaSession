package arraysofobjects;

public class Book {
	int id,price,copyno;
	String name;
	
	Book(int id,String name,int price,int copyno)
	{
		this.id=id;
		this.name=name;
		this.price=price;
		this.copyno=copyno;
	}
	
	
	public String toString()
	{
		return id+" "+name+" "+price+" "+copyno;
	}



}
