package filehandling;

import java.io.*;

public class FileWriteRead {

	public static void main(String[] args) throws IOException {

		// writing to file
		File file1 = new File("files/file1.txt");
		FileWriter fw = null;
		BufferedWriter bw= null;

		try {
			// creates file if does not exists
//			fw = new FileWriter(file1); // overrides existing file data
			fw = new FileWriter("files/file1.txt", true); // appends at the end of file (second arg is append boolean)
			bw = new BufferedWriter(fw);		
			
//			bw.write("Java is high level programming language.\njava is hybrid language.");
			bw.write("\njava is platform independent\njava is object orianted programming language");
			
		} catch (FileNotFoundException e) {
			System.out.println(e);
			e.printStackTrace();
		}finally {
			bw.close();
		}
		
		
		// reading a file
		FileReader fr = null;
		BufferedReader br = null;
		String s = "";
		int c;
		try {
			// can pass file path directly
			fr = new FileReader(file1);
			br = new BufferedReader(fr);
			
			System.out.println("Reading with bufferedreader has readLine() method reads entire line return string (null at end):");
			while((s = br.readLine()) != null)
				System.out.println(s);
			
			System.out.println("\nReading with filereader reads single char and returns int ascii value (-1 at end): ");
			fr.close();
			fr = new FileReader(file1);
			while((c = fr.read()) != -1)
				System.out.print(c+":"+(char)c+" ");
		} catch (Exception e) {
			System.out.println(e);
		}finally {
			br.close();
		}
	}

}
