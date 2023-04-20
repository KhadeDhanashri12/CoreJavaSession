package classesandobject;

public class StudenPercent {
	float calculatePercent(float m1,float m2,float m3)
	{
		float percent=(m1+m2+m3)/3;
		System.out.println("Percentage is: "+percent);
		return percent;
	}
	
	void grade(float percent)
	{
		if(percent>=70)
		{
			System.out.println("Distinction");
		}
		else if(percent>=60)
		{
			System.out.println("Firsct class");
		}
		else if(percent>=50)
		{
			System.out.println("Second class");
		}
		else if(percent>=35)
		{
			System.out.println("pass class");
		}
		else
			System.out.println("fail");

	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Student 1: ");
		StudenPercent s1 = new StudenPercent();
		float p=s1.calculatePercent(75.5f, 50f, 55.5f); //A
		s1.grade(p);
		
		System.out.println("\nStudent 2: ");
		StudenPercent s2= new StudenPercent();
		p=s2.calculatePercent(55, 60, 53);
		s2.grade(p);

	}

}
