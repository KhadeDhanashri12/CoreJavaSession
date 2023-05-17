package containment;
import java.util.*;
public class StudentCourseMain {

	public static void main(String[] args) {
		
		Student s=new Student();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter student name ");
		String name=sc.next();
		System.out.println("Enter marks");
		int marks=sc.nextInt();
		System.out.println("Enter subject");
		String subject=sc.next();
		
		s.setName(name);
		s.setMarks(marks);
		s.setSubject(subject);
		
		Course c=new Course();
	    System.out.println("Enter id ");
	    int id=sc.nextInt();
	    System.out.println("Enter name ");
	    String name1=sc.next();
	    
	    s.setC(new Course());
	    s.getC().setName(name1);
	    s.getC().setId(id);
	  
	    
	   System.out.println(s.getName());
	   System.out.println(s.getSubject()+" "+s.getMarks());
	    
	    
		

	}

}
