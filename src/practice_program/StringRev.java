package practice_program;

//String reverse and palindrom String reverse
public class StringRev {

	public static void main(String[] args) {
		
		String originalStr="Sneha",reversedStr="";;
		
	  System.out.println("Original String :" +originalStr);
	  
	  for(int i=0; i<originalStr.length();i++)
	  {
		 
		  reversedStr=originalStr.charAt(i)+reversedStr;
		  
		  
	  }
	  
	 System.out.println("Reversed String :" +reversedStr);
	 
	}

}
