public class StringAssignment {
    public static void main(String[] args) {
        String s = "programmer@gmail.com";

        System.out.println(s.matches(".*gmail.*"));
        String userName, domainName;
        userName = s.substring(0, s.indexOf('@'));
        domainName = s.substring(s.indexOf('@')+1);

        System.out.println(domainName.startsWith("gmail"));
        System.out.println(userName);
        System.out.println(domainName);
        
    }
}
