package classesandobject;

public class Student {
	int id;
	String name;
	String email;
    double marks;

	public Student(int id,String name, String email,double marks) 
	{
		this.id=id;
		this.name=name;
		this.email=email;
		this.marks=marks;
	}
	
	public static void main(String[]args) {
		Student s1=new Student(12,"Dhanashri","d@gmail.com",99);
		Student s2=s1;
		int a=s1.hashCode();
		int b=s2.hashCode();
		System.out.println("hashcode of student="+a);
		System.out.println("hashcode of student="+b);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println("Comparing object s1 and s2="+s1.equals(s2));
		
		Student s3=new Student(12,"Dhanashri","d@gmail.com",99);
		Student s4=new Student(12,"Dhanashri","d@gmail.com",99);
		int c=s3.hashCode();
		int d=s4.hashCode();
		System.out.println("hashcode of student="+c);
		System.out.println("hashcode of student="+d);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println("Comparing object s3 and s4="+s3.equals(s4));
	}
	

}
