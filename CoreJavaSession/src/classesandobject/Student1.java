package classesandobject;

public class Student1 {
	int id;
	String name,branch;
	static String university;
	
	
	Student1(int id,String name,String branch)
	{
		this.id=id;
		this.name=name;
		this.branch=branch;
	}
	
	
	static void universityInfo()  //static variables
	{
		university="Pune University";
		System.out.println("Full name: SavitriBai Phule Pune University");
		System.out.println(university);
		//System.out.println(id);
	}
	
	public String toString()
	{
		return id+" "+name+" "+branch;
	}

}
