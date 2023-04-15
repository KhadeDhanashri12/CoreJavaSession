package classesandobject;

import java.util.Scanner;

public class Car {
	int id;
	int price;
	String company,name;
	
	 Car()
	{
		int id=1234;
		int price=1100000;
		String company="verna";
		String name="Dhanashri";
	}
	Car(int id,int price,String Company,String name)
	{
		this.id=id;
		this.price=price;
		this.company=company;
		this.name=name;
	}
	void display()
	{
		System.out.println(id+" "+price+" "+company+" "+name);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Car e1=new Car();
		System.out.println(e1);
		System.out.println("Enter id,price,company for the car:");
		int id=sc.nextInt();
		int price=sc.nextInt();
		String company=sc.next();
		String name=sc.next();
		Car e2=new Car(id,price,company,name);
		System.out.println(e1);
		
	}

}
