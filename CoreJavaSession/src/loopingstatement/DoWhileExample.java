package loopingstatement;

public class DoWhileExample {
	void whileExample()
	{
		int s=1;
		while(s<=5)
		{
			System.out.print(s+" ");
			s++;
			
		}
		System.out.println("Done");
	}

	void doWhileExample()
	{
		int s=7;
		do
		{
			System.out.print(s+" ");
			s++;
			
		}while(s<=5);
		System.out.println("Done");
	}
	public static void main(String[] args) {
		DoWhileExample obj=new DoWhileExample();
		obj.whileExample();
		System.out.println();
	    obj.doWhileExample();

	}

}
 