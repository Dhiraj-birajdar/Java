class StringClass
{
    public static void main(String[] args)
    {
        String s1 = "java";
        String s5 = "java";

        String s2 = new String("java");

        char c[] = {'j','a','v','a'};
        String s3 = new String(c);

        byte b[] = {65,66,67,68};
        String s4 = new String(b);

        System.out.printf("%s\n%s\n%s\n%s",s1,s2,s3,s4);

        final int a = 10;





    }
}