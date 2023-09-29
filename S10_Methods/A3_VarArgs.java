public class A3_VarArgs {
    static int max(int...a)
    {
        int m = 0;
        for(int i:a)
            if(i>m) m = i;
        return m;
    }
    static int sum(int...a)
    {
        int sum=0;
        for(int s:a)
            sum+=s;
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(max(1,2,3,4));
        System.out.println(max(1));
        System.out.println(max());
        System.out.println(sum(1,2,3,4));
    }
    
}
