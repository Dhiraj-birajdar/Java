public class A2_arr_rota {
    public static void main(String[] args) {
        
        int a[] = {1,2,3,4,5},t;
        t = a[0];
        for(int i=0;i<a.length-1;i++)
            a[i]=a[i+1];
        a[a.length-1]=t;
        for(int e:a)
            System.out.print(e+" ");

        System.out.println("");
        int b[] = new int[10];
        b[0]=1;
        b[1]=2;
        b[2]=3;
        b[3]=4;

        
        int insert = 7, pos = 3;
        if(pos>4 && pos<b.length)
            b[pos-1]=insert;
        else
            for(int i = 3;i>=pos-1;i--)
            {
                b[i+1]=b[i];
            }
        b[pos-1]=insert;
        for(int e:b)
            System.out.print(e+" ");
        
        System.out.println("");
        for(int i=pos;i<5;i++)
        {
            a[i-1]=a[i];
        }
        a[4]=0;
        for(int e:a)
            System.out.print(e+" ");


    }
    
}
