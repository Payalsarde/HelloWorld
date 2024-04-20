
public class DataType {
	public static void main(String[] argu) {
		
		// syntax 
		int a = 5; // a = identifier 
		double b=5.55;
		System.out.println(a );
		System.out.println(b);
		System.out.println(a +b ); // Addition of two Numbers
		/* these sign for multiple comment line
		 test
		 test
		 */
		
		// Variables  Type VariableName (Identifier)  = Value
		
		String p = "Payal";
		int i = 123;
		float f = 12.34f;
		char t = 't';
		boolean e;
		e= true; // this way u can also assigne the value
		
		final int y = 45; // In final or constant  Variable this is only way to assigne the value  
		// y = 78; can't modify
		
		System.out.println("Hello " + p );
		System.out.println(i);
		System.out.println(f );
		System.out.println(t );
		System.out.println(e );
		System.out.println(y );
		
		// Operators 
		
		int num1 = 4, num2 = 89;
		
		int addition = num1 + num2;
		int sub = num1 - num2;
		int multi = num1*num2;
		int div = num2/num1;
		int remainder = num2%num1;
		int Postincrement = ++num1; 

		int decrement = --num2;
		System.out.println( "Decrement: "+decrement);
		System.out.println("Increment: "+Postincrement);
		System.out.println("Addition: "+addition);
		System.out.println("Substration: "+sub);
		System.out.println("Multiplication: "+multi);
		System.out.println("Division: "+  div);
		System.out.println("Remainder: " +remainder);
		
	}
	
	
	

}
