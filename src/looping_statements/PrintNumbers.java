package looping_statements;

public class PrintNumbers {
	
		public static void printNumfun(int n) 
		{ 
		  if(n <= 10) 
		  {
		       System.out.println(n); 
		       printNumfun(n+1);   
	      }
		}
		 
		public static void main(String args[]) 
		{
		 
			printNumfun(1); 
		 
		 }

	}

