package files;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;



	public class Task {

		public static void main(String[] args) throws IOException {
			FileWriter fw=new FileWriter("newe.txt");
			fw.write("10,20");
			fw.close();
			System.out.println("write success");
			FileReader fr=new FileReader("newe.txt");
			BufferedReader br=new BufferedReader(fr);
			String row=br.readLine();
			int sum=0;
			while(row!=null)
			{
				String data[]=row.split(",");
				int x=Integer.parseInt(data[0]);
				int y=Integer.parseInt(data[1]);
				 sum=x+y;
				
				System.out.println(sum);
				FileWriter fw1=new FileWriter("newf.txt");
				fw1.append("The sum=:"+sum);
				fw1.close();
				row=br.readLine();
			}
			

	      br.close();
	      fr.close();
		}

	}
