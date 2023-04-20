package encapsulation;
import java.util.Scanner;
public class StudentMain {

	public static void main(String[] args) {
		Student e1=new Student();
		e1.setId(1);
		e1.setName("dhanu");
		e1.setMarks(88);
		e1.setEmail("d@gmail.com");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id,name,marks,email");
		int id=sc.nextInt();
		String name=sc.next();
		double marks=sc.nextDouble();
		String email=sc.next();
		Student e2=new Student();
		e2.setId(id);
		e2.setName(name);
		e2.setMarks(marks);
		e2.setEmail(email);
		Scanner sc2=new Scanner(System.in);
		System.out.println("Enter id,name,marks,email");
		int id2=sc.nextInt();
		String name2=sc.next();
		double marks2=sc.nextDouble();
		String email2=sc.next();
		Student e3=new Student();
		e3.setId(id2);
		e3.setName(name2);
		e3.setMarks(marks2);
		e3.setEmail(email2);
		
		
		System.out.println(e1.getId()+" "+e1.getName()+" "+e1.getMarks()+" "+e1.getEmail());
		System.out.println(e2.getId()+" "+e2.getName()+" "+e2.getMarks()+" "+e2.getEmail());
		System.out.println(e3.getId()+" "+e3.getName()+" "+e3.getMarks()+" "+e3.getEmail());	
	}

}
