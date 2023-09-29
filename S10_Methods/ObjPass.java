public class ObjPass {
    static void change(int a[], int i, int v)
    {
        a[i] = v;
    }
    public static void main(String[] args)
    {
        int a[] = {1,2,3,4,5};
        change(a,2,30);
        for(int x:a)
            System.out.print(x+" ");
    }
}
