package classesandobject;

import java.util.Scanner;

public class Car {
	int id;
	static int price;
	String company,name;
	
	public Car(int id,int price,String Company,String name)
	{
		this.id=id;
		this.price=price;
		this.company=company;
		this.name=name;
	}
	public String toString()
	{
		return id+" "+price+" "+company+" "+name+" ";
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id,price,company,name for the car:");
		int id=sc.nextInt();
		int price=sc.nextInt();
		String company=sc.next();
		String name=sc.next();
		Car e1=new Car(id,price,company,name);
		System.out.println(e1);
		
	}

}
