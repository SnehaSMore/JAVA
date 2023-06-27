package files;

import java.io.File;
import java.io.IOException;

public class NewFileExmp {

	public static void main(String[] args) throws IOException {
	
		File f=new File("Demo.txt");
		if(f.createNewFile())
		{
			System.out.println("created successfully");
		}
		else
		{
			System.out.println("files already exists");
		}
		
	}

}
