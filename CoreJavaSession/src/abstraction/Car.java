package abstraction;

public abstract class Car {
	int price;
	String color;
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	void wheelNo()
	{
		System.out.println(" Car has a 4 Wheels");
	}
	void mirrorNo()
	{
		System.out.println("Car has a 3 Mirrors");
	}
	abstract void dashboard();
	abstract void seatingCapacity();
	abstract void engine();

}
