package operators;


	import java.util.Scanner;

	public class Arithmetic_Operators {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			Scanner s=new Scanner(System.in);
			
			System.out.println("Enter Two Numbers :");
			
			int a=s.nextInt();
			int b=s.nextInt();
			
			System.out.println("Sum Is:" +(a+b));
		
			System.out.println("Subtraction Is:" +(a+b));
			
			System.out.println("Multiplication Is :" +(a*b));
			
			System.out.println("Division Is :" +(a/b));
			
			System.out.println("Modulo Is" +(a%b));
			
			s.close();
			
			
			
			

		}

	}

			
