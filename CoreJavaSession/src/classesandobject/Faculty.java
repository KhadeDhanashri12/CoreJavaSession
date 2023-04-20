package classesandobject;

public class Faculty {

	int id;
	String name,subject;
	double salary;
	
	//f1.setData(2, "Ramesh", "Java", 60000);
	
	//f2.setData(3, "Ramesh", "Java", 60000);
	
	void setData(int id,String name,String subject,double salary)
	{
		this.id=id; ///represent current object in use    f2.id=id ;
		this.name=name; //f2.name=name;
		this.subject=subject; //f2.subject=subject
		this.salary=salary; //f3.salary=salary
	}
	
	
	/*void display()
	{
		System.out.println(id+" "+name+" "+subject+" "+salary);
	}*/
	
	
	public String toString() //used to print object in string format
	{
		return id+" "+name+" "+subject+" "+salary;
	}



	}


