public class RegexAssignment1 {
    public static void main(String[] args) {
        String s1 = "110100", s2 = "7CE";
        String d1 = "12/12/1992";
        String d2 = "2/1/1992";
        System.out.println(s1);

        // find if no is binary
        System.out.println(s1.matches("[01]*"));
        System.out.println(s2.matches("[01]+"));

        // find if no es hexadecimal
        System.out.println(s2.matches("[0-9a-fA-F]*"));
        System.out.println(s2.matches("[0-9a-fA-F]+"));
        System.out.println();

        // find if date format is (dd/mm/yyyy)
        System.out.println(d1.matches("(([0-3][0-9])||[1-9])/[01][0-9]/[0-9]{4}"));
        System.out.println(d2.matches("(([0-3][0-9])||[1-9])/[0-1][0-9]/[0-9]{4}"));

        String s = "java";
        System.out.println(s.replaceAll("a","f"));
    }
    
}
