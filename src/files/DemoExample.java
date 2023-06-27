package files;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DemoExample {

	public static void main(String[] args) throws IOException 
	{
		FileOutputStream fout=new FileOutputStream("e:/new.txt");
		String s="Hello";
		byte  b[]=s.getBytes();
		fout.write(b);
		fout.close();
		System.out.println("files created");
		

	}

}
