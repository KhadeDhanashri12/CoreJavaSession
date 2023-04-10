package loopingstatement;

public class StarPattern {
	void starPattern1() {
		int r=4;
		for(int i=1;i<=r;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
	void pattern1() {
		int r=4;
		for(int i=1;i<=r;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
	}
	
	
	void pattern2() {
		int r=4;
		for(int i=1;i<=r;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
				
			}
			System.out.println();
		}
		
	}
	
	void charPattern3(){
		
		for(char i='a';i<='d';i++)
		{
			for(char j='a';j<=i;j++)
			{
				System.out.print(i);
				
			}
			System.out.println();
		}
		
				
		
	}
	void charPattern4(){
		for(char i='a';i<='d';i++)
		{
			for(char j='a';j<=i;j++)
			{
				System.out.print(j);	
				
			}
			System.out.println();
		}
		
				
		
	}


	public static void main(String[] args) {
		StarPattern obj=new StarPattern();
		obj.starPattern1();
		obj.pattern1();
         obj.pattern2();
         obj.charPattern3();
         obj.charPattern4();
	}

}
