package classesandobject;
import java.util.Scanner;
public class Employee {

	
		int id;
		String name,dept;
		double salary;
		
		void setData()
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter id,name,dept,salary");
			id=sc.nextInt();
			sc.next();
			dept=sc.next();
			salary=sc.nextDouble();			
		}
		
		void display()
		{
			System.out.println(id+" "+name+" "+dept+" "+salary);
        }

		public void setEmployee1Data(int i, String string, String string2, int j) {
			// TODO Auto-generated method stub
			
		}

}
