package exception_handling;

public class Movie {

	
		private String movie_name;
		private int movieno;
		private String director;
		private int rating;
		private double duration;
		private static int idgen=8001;
		
		
		
		

		public Movie() {
			movieno=idgen++;
		}


		public Movie(String movie_name, String director, int rating, int duration) 
		{
			this();
			this.movie_name = movie_name;
			this.director = director;
			this.rating = rating;
			this.duration = duration;
			
		}


		public String getMovie_name() {
			return movie_name;
		}


		public void setMovie_name(String movie_name) {
			this.movie_name = movie_name;
		}

		public String getDirector() {
			return director;
		}


		public void setDirector(String director) {
			this.director = director;
		}


		public int getRating() {
			return rating;
		}


		public void setRating(int rating) {
			this.rating = rating;
		}


		public double getDuration() {
			return duration;
		}


		public void setDuration(int duration) {
			this.duration = duration;
		}


		@Override
		public String toString() {
			return "Movie [movie_name=" + movie_name + ", movieno=" + movieno + ", director=" + director + ", rating="
					+ rating + ", duration=" + duration + "]";
		}
		
		
		
		
		
	}
