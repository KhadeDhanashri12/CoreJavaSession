package classesandobject;

public class Student1Main {
	//can access only static variable of a class
		static 
		{
			System.out.println("static block 1");
		}
		
		static 
		{
			System.out.println("static block 2");
		}
		
		static 
		{
			System.out.println("static block 3");
		}
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			Student1.universityInfo();
			
			Student1 s1= new Student1(101,"Raj","BE");
			Student1 s2= new Student1(102,"Ramesh","Hotel Management");
			Student1 s3= new Student1(103,"Riya","BSc");
			Student1 s4= new Student1(101,"Kajal","BCS");
			
			
			//System.out.println(Student1.university); ///class variables
			System.out.println(s1);
			System.out.println(s2);
			System.out.println(s3);
			System.out.println(s4);

}
}

