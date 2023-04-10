package loopingstatement;

public class Table {
	void tableThree() 
	{
		int num=3;
		for(int i=1;i<=10;++i)
		{
			System.out.println("table is:"+num*i);
		}
	}
	

	public static void main(String[] args) {
		Table obj=new Table();
		obj.tableThree();
		
		
	}

}
