package introduction_variables_datatype;

public class Operators_Demo {

	public static void main(String[] args) {
		int a=10,b=5,c=2;
		int ans = (c+a)%b ;
		
		System.out.println(ans);
		
		//a = a+5;
		a += 5;
		System.out.println(" Modified value of a : " + a);
		
		//Relational op 
		int age =74;
		char ctz = 'N';
		boolean ans1 = (age>18)||(ctz=='p') ;
		System.out.println(" Decision to open account : " + ans1);
		
		
		//Unary Operators 
		// ++a  pre increment Unary Operator
		// a++  post increment Unary Operator
		
		int x=10; 
		int y = ++x;   
		
		/*System.out.println(" y : "+ y);
		System.out.println(" x : "+ x);
		*/
		System.out.println(" y = "+ y);
		System.out.println(" x = "+ x++);
		System.out.println(" x = "+ x);
		
		
		
		
		
		

	}

}
