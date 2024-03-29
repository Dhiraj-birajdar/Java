public class A3_arr_resize {
    public static void main(String[] args) {
        
        int a[] = {1,2,3,4,5};
        int b[] = new int[10];

        for(int i=0;i<a.length;i++)
            b[i] = a[i];
        
        for(int e:b)
            System.out.print(e+" ");

        System.out.println("");
        for(int i=a.length-1,j=0;i>=0;i--,j++)
            b[j] = a[i];
        
        for(int e:b)
            System.out.print(e+" ");


        System.out.println("a length : "+a.length);
        a=b;
        b=null;

        System.out.println("a length : "+a.length);


    }
    
}
