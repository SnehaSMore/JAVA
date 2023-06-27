package practice_program;

public class PalindromStr {

	 public static void main(String[] args)
	{
		
		String str="madam",rev="";
		
		int length=str.length();
		
		for(int i=length-1;i>=0; i--)
		{
			rev=rev+str.charAt(i);
		}
		
		if(rev.equals(str))
		{
			System.out.println("String Palindrom");
		}
		else
		{
			System.out.println("String not Palindrom");
		}
		
	}
	
}
