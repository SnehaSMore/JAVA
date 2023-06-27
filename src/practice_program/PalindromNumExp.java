package practice_program;

public class PalindromNumExp {

	public static void main(String[] args) {
	
		int num=152,rem,temp,sum=0;
		
		temp=num;
		
		while(num>0)
		{
			rem=num%10;
			sum=(sum*10)+rem;
			num=num/10;
		}
		
		if(temp==sum)
		{
			System.out.println("Number is palindrom");
		}
		else
		{
			System.out.println("Number is not palindrom");
		}

	}

}
