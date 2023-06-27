package practice_program;

public class SwapTwoNum {

	public static void main(String[] args) {

		int x=12,y=10,temp;
		
		System.out.println("Before Swaping X & Y " +x +" " +y);

		 /*temp = x;  
	       x = y;  
	      y = temp; */
	      
	      x=x+y;
	      y=x-y;
	      x=x-y;
	      

	      System.out.println("After Swaping X & Y " +x +" " +y);
	      
	}

}
