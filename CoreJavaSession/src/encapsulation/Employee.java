package encapsulation;

public class Employee {
	private int id;
	private String name,dept,email;
	private double salary;
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
	public void setDept(String dept)
	{
		this.dept=dept;
	}
	 public String getDept()
	{
		return dept;
	}
	public void setSalary(double salary)
	{
		this.salary=salary;
	}
	public double getSalary()
	{
		return salary;
	}
	
	public void setEmail(String email)
	{
		this.email=email;
	}
	public String getEmail()
	{
		return email;
	}

}
