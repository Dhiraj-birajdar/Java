class BitwiseOpr
{
    public static void main(String[] args)
    {
        int b = 0x40000000;
        int c = 0xffffffff;
        int a = b>>1;
        System.out.println(String.format("a= %d    %d ",a,b));
        System.out.println(String.format("b= %s\na= %s ",Integer.toBinaryString(b),Integer.toBinaryString(a)));

    }
}