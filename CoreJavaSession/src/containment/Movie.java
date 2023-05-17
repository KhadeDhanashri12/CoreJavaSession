package containment;

public class Movie {
private String m_name;
private int price;
private float rating;

public String getM_name() {
	return m_name;
}
public void setM_name(String m_name) {
	this.m_name = m_name;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public float getRating() {
	return rating;
}
public void setRating(float rating) {
	this.rating = rating;
}

@Override
public String toString() {
	return "Movie [m_name=" + m_name + ", price=" + price + ", rating=" + rating + "]";
}


}
