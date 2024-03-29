public class StringReverse {
    public static void main(String[] args) {
        String s = "dhiraj";
        StringBuilder sb = new StringBuilder(s);
        s = sb.reverse().toString();
        System.out.println(s);
    }
}
