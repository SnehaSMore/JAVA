package files;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

	public static void main(String[] args) throws IOException {
		
		FileReader fileread=new FileReader("text.txt");
		
		int i;
		while((i=fileread.read())!=-1)
		{
			System.out.println((int)i);
		}
		
		
	}
}

