
public class Conditions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int x = 1020;
		 int y = 100;
		 // If condition
		 if (x>y) {
			 System.out.println(" If condition : X is greater than y");
		 }
		 
		 
		 // If .. Else Condition
		 if (x>y) {
			 System.out.println("X is greater than y");
		 }
		 else {
			 System.out.println("Y is greater than X");
		 }
		 
		 // If.... Else if....Else Condition
		 
		 if (x>y) {
			 System.out.println("X is greater than y");
		 }
		 else if(y>x) {
			 System.out.println("Y is greater than X");
		 }
		 else {
			 System.out.println("X and Y values are same");
		 }
		 
		 // Short Hand Ternary Operation
		 System.out.println( (x>y)? "X is greater than Y" : "Y is grater than X");
		 
		 
		 
		 // Switch
		 
		 int day = 90;
		 switch (day) {
		 case 1 : System.out.println("Day 1");
		 break;
		 
		 case 2 : System.out.println("Day 2");
		 break;
		 case 3 : System.out.println("Day 3");	 
		 break;
		 case 4 : System.out.println("Day 4");
		 break;
		 case 5: System.out.println("Day 5");
		 break;
		 case 6 : System.out.println("Day 6");
		 break;
		 default : System.out.println("Need check Day");
		 }
		 
		 // While 
		 
		 int whilecase = 5;
		  while (whilecase <12) {
			  System.out.println("While Case");
			  whilecase++;
		  }
		  //Do   While
		  int i = 0;
		  do {
			  System.out.println("Do While Case");
			  i++;
		  }
		  while(i<5);
		  
		  // For Loop
		  
		  for(int j= 0;j<10;j++)
		  {
			  System.out.println("Table of 2:2*"+j+"="+j*2);
		  }

		  
		  
	}

}
