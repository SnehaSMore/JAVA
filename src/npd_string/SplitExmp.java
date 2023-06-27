package npd_string;

public class SplitExmp {

	public static void main(String[] args) {
		
		
		String str="Java is object oriented";
		
		 String words[] = str.split(" ");
		 
	      for(String singleword : words) {
	         System.out.println(singleword);
	      }
		
			/*Scanner sc=new Scanner(System.in);
			System.out.println("enter the sentence");
			String sentence=sc.nextLine();
			String[] word=sentence.split(",");
			for(String j:word)
			{
				System.out.println(j);
			}

	      */
	      

	}

}
