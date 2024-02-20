package filehandling;

import java.io.*;

public class CopyFileData {
	public static void main(String[] args) throws IOException{
		
		// ------------try with resources------------
		System.out.println("try with resources: ");
		try (BufferedReader br = new BufferedReader(new FileReader("files/java1.txt"));
				BufferedWriter bw = new BufferedWriter(new FileWriter("files/java2.txt"))){			
			for(String l;(l = br.readLine()) != null;bw.write(l+"\n"));				
			System.out.println("File Data copy operation complete.");
		}catch(Exception e){
			System.out.println("File Data copy Operation cannot be performed : >"+e);
		}
		
		// ------------try with finally------------
		BufferedReader brc = null;
		BufferedWriter bwc = null;
		String s;
		System.out.println("\ntry with finally: ");
		try {
			brc = new BufferedReader(new FileReader("files/java1.txt"));
			bwc = new BufferedWriter(new FileWriter("files/java3.txt"));
			while((s = brc.readLine()) != null)
				bwc.write(s+"\n");
			System.out.println("File Data copy operation complete.");
		}catch(Exception e){
			System.out.println("File Data copy Operation cannot be performed : >"+e);
		}finally {
			brc.close();
			bwc.close();		
		}
		
		
		
	}
}
