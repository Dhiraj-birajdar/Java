import java.io.*;

class Io {
    public static void main(String[] args) throws IOException {
        File f = new File("file.txt");
        System.out.println("is file: " + f.isFile());
        System.out.println("file name: " + f.getName());
        System.out.println("file size: " + f.length());
        System.out.println("file path: " + f.getPath());
        System.out.println("file parent: " + f.getParent());
        System.out.println("file Hidden: " + f.isHidden());

        FileReader fr = new FileReader(f);
        int data = fr.read();
        System.out.println(data);
        while (data != -1) {
            System.out.print((char) data);
            data = fr.read();
        }
        fr.close();
        System.out.println("--------------------------- ");
        RandomAccessFile ra = new RandomAccessFile("file.txt", "rw");
        ra.seek(0); // Move the file pointer to the beginning
        System.out.println("\n" + ra.read()); // Read a byte from the file
        ra.close();
    }
}
