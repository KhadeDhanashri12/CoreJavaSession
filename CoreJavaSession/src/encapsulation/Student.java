package encapsulation;

public class Student {
	
	private int id;
	private String name;
	private double salary;
	private String dept;
	private double marks;
	private String email;
	// getter/setter
	public void setId(int id) 
	{
		this.id=id;
	}
	public int getId()
	{
		return id;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setEmail(String email)
	{
		this.email=email;
	}
	 public String getEmail()
	{
		return email;
	}
	public void setSalary(double salary)
	{
		this.salary=salary;
	}
	public double getSalary()
	{
		return salary;
	}
	public void setDept(String dept)
	{
		this.dept=dept;
	}
	public String getDept()
	{
		return dept;
	}
	public void setMarks(double marks)
	{
		this.marks=marks;
	}
	public double getMarks()
	{
		return marks;
	}
	
		
	}
	
