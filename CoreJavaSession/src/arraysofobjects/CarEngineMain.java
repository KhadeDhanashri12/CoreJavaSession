package arraysofobjects;
import java.util.Arrays;
import java.util.Scanner;

public class CarEngineMain {
	Car c[]= new Car[5];
	Scanner sc= new Scanner(System.in);
	
	void addData()
	{
		for(int i=0;i<5;i++)
		{
			//System.out.println("Enter data for "+(i+1)+" car: ");
			System.out.println("Enter Company name and power of engine: ");
			String cp=sc.next();
			int pw=sc.nextInt();
			
			Engine e= new Engine(cp, pw);
			
			System.out.println("Enter the id,name,company,price of car: ");
			int id=sc.nextInt();
			String n= sc.next();
			String comp=sc.next();
			long p=sc.nextLong();
			
			Car c1=new Car(id, n,comp,p,e);
			
			c[i]=c1;
		}
		
		/*c[0]= new Car(1,"baleno","Maruti",700000,new Engine("Fiat",1200));
		c[1]= new Car(2,"Nexon","tata",1300000,new Engine("tata",1200));
		c[2]= new Car(3,"Swift","Maruti",750000,new Engine("Fiat",1300));
		c[3]= new Car(4,"Tigor","Tata",950000,new Engine("tata",1200));
		c[4]= new Car(5,"WagonR","Maruti",500000,new Engine("Fiat",1300));*/
	}
	
	void display()
	{
		System.out.println(Arrays.toString(c));
	}
	
	void specificData()
	{
		//display details of car which has Fiat engine
		for(Car cr:c)
		{
			if(cr.e.company.equalsIgnoreCase("Fiat") && cr.e.power==1200)
			{
				System.out.println(cr);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CarEngineMain obj= new CarEngineMain();
		
		obj.addData();
		obj.display();
		System.out.println("---------------------");
		obj.specificData();

	}


}
