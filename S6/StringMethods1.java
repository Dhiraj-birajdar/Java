public class StringMethods1 {
    public static void main(String[] args) {
        String s = "    Dhiraj  Birajdar";

        int l = s.length();
        System.out.println(s+"\nLength = "+l);

        s = s.toLowerCase();
        System.out.println("Lower case = "+s);

        s = s.toUpperCase();
        System.out.println("Upper case = "+s);
        
        s = s.trim();
        System.out.println("Trimmed = "+s);
        
        s = s.substring(3);
        System.out.println("Substring = "+s);

        s = s.substring(5,13);
        System.out.println("Substring = "+s);

        s = s.replace('A','O');
        System.out.println("Substring = "+s);
    }
    
}
