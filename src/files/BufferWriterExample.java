package files;

	import java.io.BufferedWriter;
	import java.io.FileWriter;
	import java.io.IOException;

	public class BufferWriterExample {

		public static void main(String[] args) throws IOException {
			FileWriter fw=new FileWriter("newD.csv");
			BufferedWriter bw=new BufferedWriter(fw);
			bw.write("id,name,address");
			bw.write("\n12,gayathri,pune");
			bw.close();
			fw.close();
			System.out.println("created");

		}

	}

