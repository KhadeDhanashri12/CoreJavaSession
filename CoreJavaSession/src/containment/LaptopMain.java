package containment;
import java.util.*;
public class LaptopMain {

	public static void main(String[] args) {
		Laptop l=new Laptop();
		Scanner sc=new Scanner(System.in);
				
		System.out.println("Enter Laptop Brand");
		String l_brand=sc.next();
		System.out.println("Enter Laptop Price");
		int price=sc.nextInt();
		System.out.println("Enter Laptop Features");
		String a_features=sc.next();
		l.setB_name(l_brand);
		l.setPrice(price);
		l.setFeatures(a_features);
		
		Printer p=new Printer();
		System.out.println("Enter Printer Brand");
		String p_brand=sc.next();
		System.out.println("Enter Printer ink");
		String p_ink=sc.next();
		System.out.println("Enter Printer Price");
		int p_price=sc.nextInt();
		
		l.setP(p);
		l.getP().setB_name(p_brand);
		l.getP().setInk(p_ink);
		l.getP().setPrice(p_price);
		
		System.out.println(l.getB_name());
		System.out.println(l.getPrice()+" "+l.getFeatures()+" "+l.getP().getB_name()+" "+l.getP().getInk()+" "+l.getP().getPrice());
		
		
		

	}

}
