package abstraction;

public interface Bike {
	void engine();
	void wheels();
	void color();
	void mirror();
	
	default void headlight()
	{
		System.out.println("bike has only one headlight");
	}

}
