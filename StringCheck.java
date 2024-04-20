
public class StringCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Payal ";
				String LastName ="Gadge";
		System.out.println("The Length of string is: " + name.length());
		System.out.println("To Upper \"Case: " + name.toUpperCase()); // Special cases
        System.out.println("To Lower \'case: "+ name.toLowerCase());
        System.out.println("index of \\surname: " + name.indexOf("p"));
        System.out.println("Full name: " + name.concat(LastName));
        System.out.println(" This\n text is\r only for\t spec\bial cas\fes");
        
        // Math Method
        
        System.out.println(Math.max(89,88));
        System.out.println(Math.min(89,88));
        System.out.println(Math.sqrt(36));
        System.out.println(Math.random());
	}

}
