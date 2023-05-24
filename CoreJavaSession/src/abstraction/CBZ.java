package abstraction;

public class CBZ implements Bike {
	
	public void wheels() {
		System.out.println(" CBZ has 2 Wheels ");
		
	}
	public void color() {
		System.out.println("CBZ : Red");
		
	}
	public void mirror() {
		System.out.println("CBZ has 2 mirror");
	}
	@Override
	public void engine() {
		System.out.println("CBZ: 150cc ");
		
	}
	
}

