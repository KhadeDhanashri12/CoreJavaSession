package containment;

public class Laptop {
	String b_name;
	int price;
	String features;
	Printer p;
	public String getB_name() {
		return b_name;
	}
	public void setB_name(String b_name) {
		this.b_name = b_name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getFeatures() {
		return features;
	}
	public void setFeatures(String features) {
		this.features = features;
	}
	public Printer getP() {
		return p;
	}
	public void setP(Printer p) {
		this.p = p;
	}
	@Override
	public String toString() {
		return "Laptop [b_name=" + b_name + ", price=" + price + ", features=" + features + ", p=" + p + "]";
	}
	
	

}
