public class StringMethods3 {
    public static void main(String[] args) {
        String s1 = "python";
        String s2 = "Java";
        String s3 = "java";
        String s4 = new String("Java");
        String s5 = "Java";

        System.out.println(s1.equals(s2));
        System.out.println(s3.equalsIgnoreCase(s2));
        System.out.println(s3.compareTo(s2));
        System.out.println(s3.compareToIgnoreCase(s2));
        System.out.println(s1.contains("y"));
        System.out.println(s1.concat(s2));
        System.out.println(s2==s4);
        System.out.println(s2==s5);


        System.out.println(String.valueOf(true));


    }
    
}
