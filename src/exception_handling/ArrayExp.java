package exception_handling;

public class ArrayExp {

	public static void main(String[] args) {
	
		try {
			int a[]= {2,3,4};
			System.out.println(a[4]);
			
		} catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		

	}

}
