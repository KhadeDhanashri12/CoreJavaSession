package abstraction;

public class CarMain {

	public static void main(String[] args) {
		
		Baleno b1=new Baleno();
		b1.setColor("Red");
		b1.setPrice(70000);
		b1.wheelNo();
		b1.dashboard();
		b1.engine();
		
		System.out.println(b1.getColor()+" "+b1.getPrice());
		

	}

}
