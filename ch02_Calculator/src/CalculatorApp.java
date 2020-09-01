
public class CalculatorApp {

	public static void main(String[] args) {
		System.out.println("welcome to my calculator");
		
		int n1 = 5; 
		int n2 = 7;
		double d1 = 14.3;
		double d2 = 55.5;
		double d3 = .5;
		//performing an expression inside a string 
		System.out.println("n1 + n2 = " +(n1+n2));
		//declaring a variable to hold the results of a calculation
		int diff = n2 - n1; 
		System.out.println("dif = "+ diff);
		
		//a double can handle this more precise type, where if diff 
		double diff2;
		diff2 = d2 - n2;
		System.out.println("diff2 = + " + diff2);
		
		double product = n2 * d2;
		System.out.println("product = " + product);
		
		//example of casting 
		int castingProduct = (int) (n2 * d2);
		System.out.println("product = " + castingProduct);
		
		n2 = n2 + 5; //adding five to a variable
		System.out.println("n2 = " + n2);
		
		
	
		
		
	}

}
