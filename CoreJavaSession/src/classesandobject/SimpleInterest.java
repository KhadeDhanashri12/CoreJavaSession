package classesandobject;
import java.util.*;
public class SimpleInterest {
	float productCalculate(float p,float r,float t)
	{
		float product= p*r*t;
		return product;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float p,r,t;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter p,r,t: ");
		p=sc.nextFloat();
		r=sc.nextFloat();
		t=sc.nextFloat();
		
		SimpleInterest obj= new SimpleInterest();
		float product=obj.productCalculate(p, r, t);
		
		System.out.println("Simple interest is: "+(product/100));
}
}
