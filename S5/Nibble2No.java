class Nibble2No
{
    public static void main(String[] args)
    {
        byte a = 9, b = 12, c;
        c = (byte)(a<<4);
        c = (byte)(c|b);
        System.out.println(c&0x0f);
        System.out.println((c&0xf0)>>4);
    }
}