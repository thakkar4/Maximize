import java.util.Scanner;

public class Add2Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a, b, c;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the a value");
		a = sc.nextInt();
		System.out.println("Enter the b value");
		b = sc.nextInt();
		//a = 5;
	//	b = 6;
		
		c = a + b;
		
		System.out.println("total =  " + c);
		
		System.out.println(ValidateHeader());
				
	}
	
	public static int ValidateHeader() {
		
		System.out.println("calling method");
		
		return 2;
		
	}
	
	
	
	

}
