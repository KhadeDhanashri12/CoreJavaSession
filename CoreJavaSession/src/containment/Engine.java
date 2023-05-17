package containment;

public class Engine {
	int power;
	String company;
	
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
	public String toString()
	{
		return power+" "+company;
	}
	
	public Engine(int power, String company) {
		
		this.power = power;
		this.company = company;
	}


}
