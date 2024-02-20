package filehandling;

import java.io.File;
import java.io.IOException;

public class FileCreateDelete {
	public static void main(String[] args) {
		
		File dir = new File("files");
		System.out.println("Directory will be created here => "+dir.getAbsolutePath());
		dir.mkdir();
		
		File file1 = new File(dir, "file1.txt");
		System.out.println("File will be created here => "+file1.getAbsolutePath());
		
		try {
			boolean b = false;
			if(!file1.exists())
				b = file1.createNewFile(); // checked exception			
			System.out.println("is file created? => "+ b);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("does \""+file1.getName()+"\"  file exists? => "+file1.exists());
		System.out.println("is \""+file1.getName()+"\"  file? => "+file1.isFile());
		System.out.println("is \""+file1.getName()+"\"  directory? => "+file1.isDirectory());
		System.out.println("is \""+dir.getName()+"\"  file? => "+dir.isFile());
		System.out.println("is \""+dir.getName()+"\"  directory? => "+dir.isDirectory());
		
		if(file1.delete())
			System.out.println("file deleted");
		System.out.println("does \""+file1.getName()+"\"  file exists? => "+file1.exists());
	}
}
