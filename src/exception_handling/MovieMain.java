package exception_handling;



public class MovieMain {



		public static void main(String[] args) {
			
			
	       Movie m1=new Movie("Spider-Man","Sam Raimi",2,4);
			
			System.out.println(m1);
			
			Movie m2=new Movie("shershaah","vishnuvardhan",4,3);
			
			System.out.println(m2);

		   Movie m3=new Movie("avengers ","Anthony Russo",5,3);
			
			System.out.println(m3);
			
			System.out.println("==================");
			
			 checkMovie(m1);
			
		}	
			
		/*	if	(m1.getRating()<4)
			{
			try
			{
			 throw new Exception("NotElgibleForAwardException");
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			}
			else if(m1.getDuration()<3.5)
			{
				try
				{
				 throw new Exception("LowDurationMovieException");
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
			}*/
			
			
		public static void checkMovie(Movie m) 
		{
			if(m.getDuration()<3.5 && m.getRating()<4.0)
			{
				try
				{
					
					try
					{
						throw new NotElgibleForAwardException("Noteligibleforaward");
					}
					catch(NotElgibleForAwardException e)
					{
						System.out.println(e);
					}
					throw new LowDurationMovieException("Low duration");
				}
				catch(LowDurationMovieException e)
				{
					System.out.println(e);
				}
			}
			else
			{
				System.out.println(m.getMovie_name());
			}
		}
			
			

	
		}
		
		


