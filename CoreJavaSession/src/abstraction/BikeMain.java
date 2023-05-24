package abstraction;

public class BikeMain {

	public static void main(String[] args) {
		Pulsor p=new Pulsor();
		p.color();
		p.engine();
		p.mirror();
		p.headlight();
		
		System.out.println(".............................");
		CBZ c1=new CBZ();
		c1.engine();
		c1.color();
		c1.mirror();
		c1.headlight();
		
	}

}
