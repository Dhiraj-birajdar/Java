package filehandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;

//serialization deserialization
public class ObjectReadWrite {
public static void main(String[] args) throws IOException, ClassNotFoundException {
	
	Student s1 = new Student("akash", 89, "pune", "888-545-444");
//	File f = new File("files/StudentObject.txt");
//	System.out.println(f.createNewFile());
//	System.out.println(f.exists());
	
	// Serialization
	FileOutputStream fw = new FileOutputStream("files/StudentObject.txt");
	ObjectOutputStream ow = new ObjectOutputStream(fw);
	ow.writeObject(s1);
	ow.close();
	
	// Deserialization
	FileInputStream fr = new FileInputStream("files/StudentObject.txt");
	ObjectInputStream or = new ObjectInputStream(fr);
	Student sr = (Student)or.readObject(); // checked exception classnotfound
	or.close();
	System.out.println(sr.getName());
	System.out.println(sr.getMarks());
	System.out.println(sr.getAdd());
	System.out.println(sr.getPhno());
}
}
