public class StringMethods2 {
    public static void main(String[] args) {
        String s = "www.google.com";

        System.out.println(s.startsWith("www"));
        System.out.println(s.endsWith("com1"));
        System.out.println(s.charAt(5));
        System.out.println(s.indexOf("g"));
        System.out.println(s.indexOf("w",2));
        System.out.println(s.lastIndexOf("g"));
        System.out.println(s.lastIndexOf("w",1));
    }
    
}
