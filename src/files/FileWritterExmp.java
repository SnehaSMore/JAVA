package files;

import java.io.FileWriter;
import java.io.IOException;

public class FileWritterExmp {

	public static void main(String[] args) throws IOException {
		FileWriter fw=new FileWriter("test.txt");
		fw.write("hello");
		fw.close();
		

	}

}
