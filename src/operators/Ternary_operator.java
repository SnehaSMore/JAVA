package operators;

public class Ternary_operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=5;
		
		if (num>0)
		{
			System.out.println("Number is positive");
		}
		else		{
		System.out.println("Number is Negative");
		}
		
		
		System.out.println(num>0? "number is positive" : "number is negative");
	}

}
