import java.util.Arrays;

public class StringSplit {
    public static void main(String[] args) {
        String s = "my name is java";
        String s1[] = s.split("\\s");
        System.out.println(Arrays.toString(s1));
    }
}
