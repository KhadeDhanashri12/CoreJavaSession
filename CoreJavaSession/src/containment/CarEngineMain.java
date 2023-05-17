package containment;

public class CarEngineMain {

	public static void main(String[] args) {

		/*Engine e1= new Engine(); //aggregation
		e1.setCompany("Tata");
		e1.setPower(1200);
		
		Engine e2= new Engine();
		e2.setCompany("Fiat");
		e2.setPower(1300);
		
		
		Car c1= new Car();
		c1.setId(7654);
		c1.setName("AudiQ7");
		c1.setCompany("Audi");
		c1.setPrice(8700000);
		c1.setEng(e1);
		
		Car c2= new Car();
		c2.setId(9988);
		c2.setName("MercedesEclass");
		c2.setCompany("Mercedes");
		c2.setPrice(9000000);
		c2.setEng(e2);*/
		
		
		//Engine e1= new Engine(1200,"Tata");
		Engine e2= new Engine(1300,"Fiat");
		
		Car c1= new Car(7654,"AudiQ7","Audi",8700000,new Engine(1200,"Tata"));
		Car c2= new Car(9876,"MarcedesEClass","Mercedes",9000000,e2);
		
		/*System.out.println(c1);
		System.out.println(c2);*/
		
		//name- engine power
		System.out.println(c1.getName()+" ==> "+c1.getEng().getPower()+" cc");
		System.out.println(c2.getName()+" ==> "+c2.getEng().getPower()+" cc");

	}


}
