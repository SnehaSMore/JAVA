package exception_handling;

public class NumExp {

	public static void main(String[] args) throws Exception {
		  
		int num=-2;
		
		if(num>0) {  
	            
	            throw new Exception("Number is negative");    
	        }  
	        else {  
	            System.out.println("Number is positive");  
	        }  
	    }  

}
