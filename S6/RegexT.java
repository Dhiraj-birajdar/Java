import java.util.regex.*;  
class RegexT{  
public static void main(String args[]){  
System.out.println(Pattern.matches("[Abc][ag]", "A"));
//false (not a or m or n)  

System.out.println(Pattern.matches("\\d", "9"));
//true (among a or m or n)  

System.out.println(Pattern.matches("\\b.*\\b", "ammmna"));
//false (m and a comes more than once)  

System.out.println(Pattern.matches("[amn]{6}", "ammmna"));

}
}