package classesandobject;
import java.util.Scanner;
public class Employeee1 {
	int id;
	String name,dept;
	int salary;
	
	Employeee1()
	{
		id=-1;
		name="abc";
		dept="dept";
		salary=-1;
	}
	Employeee1(int id,String name, String dept,int salary)
	{
		this.id=id;
		this.name=name;
		this.dept=dept;
		this.salary=salary;
	}
	void display()
	{
		System.out.println(id+" "+name+" "+dept+" "+salary);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Employeee1 e1=new Employeee1();
		System.out.println(e1);
		System.out.println("Enter id,name,dept,salary,for the employeee:");
		int id=sc.nextInt();
		String name=sc.next();
		String dept=sc.next();
		int salary=sc.nextInt();
		Employeee1 e2=new Employeee1(id,name,dept,salary);
		System.out.println(e2);
		
	}

}
