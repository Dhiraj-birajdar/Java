public class methodOverloading {
    static int sum(int a, int b)
    {
        return a + b;
    }
    static float sum(float a, float b)
    {
        return a + b;
    }
    static int sum(int a, int b, int c)
    {
        return a + b + c;
    }

    public static void main(String[] args) {
        System.out.println("sum(int 2) : "+ sum(1,3));
        System.out.println("sum(int 3) : "+ sum(1, 2, 3));
        System.out.println("sum(float 2) : "+ sum(1.3f,3.9f));
    }
    
}
