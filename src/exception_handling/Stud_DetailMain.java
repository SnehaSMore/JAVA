package exception_handling;


public class Stud_DetailMain {

	public static void main(String[] args) {
		
		Stud_Detail s1=new Stud_Detail(12345,"sneha",66,88,95,77,89);
			
			System.out.println(s1);
			System.out.println("==================================");
			
			Stud_Detail s2=new Stud_Detail(67894,"nisha",67,60,57,40,44);
			
			System.out.println(s2);
			System.out.println("======================================");
			
		/*if	(s2.percentage()<60)
			{
			try
			{
			 throw new Exception("NotEligibleForPlacementException");
			}
			catch(Exception e)
			{
				System.out.println(e);
			}*/
			
			checkPercentage(s2);
	}
			
			public static void checkPercentage(Stud_Detail s2)
			{
				if(s2.percentage()<60)
				{
					try
					{
					throw new NotEligibleForPlacementException("not eligible for placment");
					}
					catch(NotEligibleForPlacementException e)
					{
						System.out.println(e);
					}
				}
			}

		}

			
		
		
		
		
		
		
