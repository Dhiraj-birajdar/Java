public class RegexAssignment2 {
    public static void main(String[] args) {
        // remove special char from string
        String s1 = "a$b^C1@";
        System.out.println(s1.replaceAll("[^a-zA-Z0-9]",""));
        
        // remove extra  space from string
        String s2 = "     a       b                b       s      c  ";
        System.out.println(s2.replaceAll("\\s+"," ").trim());
        
        // find number of words in a string
        s2 = s2.replaceAll("\\s+"," ").trim();
        String words[] = s2.split("\\s");
        System.out.println(words.length);
    }
    
}
