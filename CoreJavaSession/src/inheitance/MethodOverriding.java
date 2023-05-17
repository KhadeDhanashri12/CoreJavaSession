package inheitance;
class Parent11
{
	
	
	void giftPhone()
	{
		System.out.println("phone");
	}
}

class Child11 extends Parent11
{

	@Override//Annotation
	void giftPhone() {
		super.giftPhone();
		System.out.println("vivo phone");
		
	}
	
	
}
class Child12 extends Parent11
{

	@Override//Annotation
	void giftPhone() {
		super.giftPhone();
		System.out.println(" samsung phone");
		
	}
	
	
}

public class MethodOverriding {
	public static void main(String[] args) {
//		Parent11 p=new Parent11();
//		p.giftPhone();
		Child11 c=new Child11();
		c.giftPhone();
		
		Parent11 p;
		p=new Child11();//upcasting,Specialization(0x200)
		p.giftPhone();
		p=new Child12();
		p.getClass();
		

	}

}
