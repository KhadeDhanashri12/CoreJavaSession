package containment;
import java.util.*;
public class Bank {
	String b_name;
	String city;
	String branch;
	float rate;
	
	void BankInformation()
	{
		System.out.println(" print Bank Information");
	}

}
class Axis extends Bank
{
	String b_name="Axis";
	String city="pune";
	String branch="Hadapsar";
	float rate=0.0f;
	int age;
	
	
	
void rateOfIntrest()
{
	System.out.println("Enter Your Age:");
	Scanner sc=new Scanner(System.in);
	age=sc.nextInt();

	if(age>60)
	{
		System.out.println("Rate of interest is 7.8");
		
	}
	else if(age>40)
	{
		System.out.println("Rate of interest is 6.4");
	}
	else if(age>18)
	{
		System.out.println("Rate of interest is 5.5");
	}
}
void display()
{
	System.out.println(b_name+" "+city+" "+branch+" "+age+" "+rate);
}
     
		 
		
 }
