package exception_handling;

public class ArithmeticExp {

	public static void main(String[] args) {
		
		int i=42,j=0;
		
		try {
			int r=i/j;
			System.out.println(r);
			
		} catch (ArithmeticException e)
		{
			System.out.println(e);
		}

	}

}
