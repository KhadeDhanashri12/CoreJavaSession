package classesandobject;
import java.util.Scanner;
public class Employee {

	
	int id;
	String name,dept;
	double salary;
	
	/*void setData()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter id,name,dept,salary");
		id=sc.nextInt(); //do not consider new line character
		sc.nextLine();//new line
		name=sc.nextLine();
		dept=sc.next();
		salary=sc.nextDouble();
	}*/
	
	//                     23, "Ajay Devgan", "HR", 70000
	void setEmployeeData(int i,String n,String d,double s) ///int,String,String,double
	{
		id=i;
		name=n;
		dept=d;
		salary=s;
	}
	
	/*void setEmployeeData(int id,String name,String dept,double salary) ///int,String,String,double
	{
		id=id;  //a=a
		name=name;
		dept=dept;
		salary=salary;
	}*/
	
	void display()
	{
		System.out.println(id+" "+name+" "+dept+" "+salary);
	}
			
		}

