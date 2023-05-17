package containment;

public class Printer {
String b_name;
String ink;
int price;
public String getB_name() {
	return b_name;
}
public void setB_name(String b_name) {
	this.b_name = b_name;
}
public String getInk() {
	return ink;
}
public void setInk(String ink) {
	this.ink = ink;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
@Override
public String toString() {
	return "Printer [b_name=" + b_name + ", ink=" + ink + ", price=" + price + "]";
}


}
