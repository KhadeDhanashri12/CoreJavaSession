package arraysofobjects;
import java.util.Arrays;
import java.util.Scanner;


public class BookMain {
Scanner sc= new Scanner(System.in);
	
	//CRUD Operations
	//create(add data),Retrieve,update,delete
	
	void addData(Book b[]) //b=bk
	{
		/*Book b1= new Book(123,"Harry Potter I",650,10); //a=b     c=b
		b[0]=b1;*/
		
		/*b[0]=new Book(123,"Harry Potter I",650,10);
		b[1]=new Book(768,"Harry Potter II",600,7);
		b[2]=new Book(5567,"Harry Potter III",750,15);
		b[3]=new Book(13,"Harry Potter IV",890,10);
		b[4]=new Book(1230,"Harry Potter V",650,20);
		b[5]=new Book(789,"Harry Potter VI",800,12);
		b[6]=new Book(10,"Harry Potter VII",700,10);
		b[7]=new Book(101,"The Jungle Book",650,30);
		b[8]=new Book(783,"Let Us C",650,5);
		b[9]=new Book(456,"The complete Reference Java",900,40);*/
		
		for(int i=0;i<3;i++)
		{
			System.out.println("Enter the id,name,price,no of copies of the book: ");
			int id=sc.nextInt();
			sc.nextLine();
			String name=sc.nextLine();
			int price=sc.nextInt();
			int cn=sc.nextInt();
			
			Book b1= new Book(id,name,price,cn);
			
			b[i]=b1;
		}
		
		
	}
	
	void addNewData(Book b[])
	{
		System.out.println("Enter the id,name,price,no of copies of the book: ");
		int id=sc.nextInt();
		sc.nextLine();
		String name=sc.nextLine();
		int price=sc.nextInt();
		int cn=sc.nextInt();
		
		Book b1= new Book(id,name,price,cn);
		
		for(int i=0;i<b.length;i++)
		{
			if(b[i]==null)
			{
				b[i]=b1;
				break;
			}
		}
		System.out.println(Arrays.toString(b));
	}
	
	void display(Book b[])
	{
		/*for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}*/
		
		/*for(Book b1:b)
		{
			System.out.println(b1);
		}*/
		
		System.out.println(Arrays.toString(b));
	}
	
	void searchData(Book b[])
	{
		System.out.println("Enter the id of the book:");
		int id=sc.nextInt();
		
		for(Book bk: b)
		{
			if(bk!=null)
			{
				if(bk.id==id)
				{
					System.out.println(bk);
				}
			}
		}
			
	}
	
	void updateData(Book b[])
	{
		System.out.println("1. Price // 2.Copy no");
		int ch=sc.nextInt();
		
		if(ch==1)
		{
			System.out.println(" enter the id :");
			int id= sc.nextInt();
			System.out.println("enter the new price: ");
			int pr=sc.nextInt();
			
			for(Book bk:b)
			{
				if(bk!=null)
				{
					if(bk.id==id)
					{
						bk.price=pr;
					}
				}
			}
		}
		else if(ch==2)
		{
			System.out.println("Code  to update copy numnber");
		}
	}
	
	void delete(Book b[])
	{
		System.out.println(" enter the id :");
		int id= sc.nextInt();
		
		for(int i=0;i<b.length;i++)
		{
			if(b[i]!=null)
			{
				if(b[i].id==id)
				{
					b[i]=null;
					break;
				}
				
			}
		}
		System.out.println(Arrays.toString(b));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book bk[]=new Book[5];
		
		BookMain obj= new BookMain();
		
		obj.addData(bk);
		obj.display(bk);
		System.out.println("------------------------------\n");
		//obj.addNewData(bk);
		
		//obj.searchData(bk);
		//obj.updateData(bk);
		
		obj.delete(bk);
		//obj.display(bk);

	}


}
