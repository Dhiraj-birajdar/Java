public class A2_MethodOverloading {
    static float area(int l, int w)
    {
        return l*w;
    }
    static float area(float r)
    {
        return (float) Math.PI * r * r;
    }

    static int reverse(int n)
    {
        int r, result = 0;
        while(n!=0)
        {
            r = n%10;
            result = result*10 + r;
            n/=10;
        }
        return result;
    }
    static void reverse(int a[])
    {
        int t;
        for(int i = 0, j = a.length-1;i< a.length/2;i++, j--)
        {
            t = a[i];
            a[i] = a[j];
            a[j] = t;
        }
    }
    public static void main(String[] args) {
        
        int arr[] = {1,2,3,4,5};
        System.out.println(area(2,4));
        System.out.println(area(2));
        System.out.println(reverse(123));
        reverse(arr);

        for(int i:arr)
            System.out.print(i+"  ");

        String name = "dhiraj";
        System.out.println(name.matches("[a-zA-z\\s]+"));


    }
    
}
