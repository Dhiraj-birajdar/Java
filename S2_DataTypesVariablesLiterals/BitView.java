class BitView
{
    public static void main(String[] args)
    {
        byte a = -128; //-128 int literal
        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toOctalString(a));
        System.out.println(Integer.toHexString(a));

        float f = 1.1234567f;//accurate upto 8 digit
        double b = 1.012345678901234;//upto 16 digit
        System.out.println(b);

        char c = 0x30;
        System.out.println(c);
        System.out.println(0x30);
    }
}