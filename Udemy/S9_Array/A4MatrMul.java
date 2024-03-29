public class A4MatrMul {
    public static void main(String[] args) {
        
        int a[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int b[][] = {{1,0,0},{0,1,0},{0,0,1}};
        int c[][] = new int[3][3];

        // for(int i=0;i<a.length;i++)
            for(int i=0;i<a.length;i++)
            {
                for(int j=0;j<a[i].length;j++)
                {   
                    c[i][j] = 0;
                    for(int k=0;k<a[i].length;k++)
                        c[i][j] = c[i][j] + a[i][k] * b[k][j];
                }    
            }




        for(int r[]:a)
        {
            for(int e:r)
                System.out.print(e+" ");
            System.out.println("");
        }

        System.out.println("");
        for(int r[]:b)
        {
            for(int e:r)
            System.out.print(e+" ");
            System.out.println("");
        }

        System.out.println("");
        for(int r[]:c)
        {
            for(int e:r)
                System.out.printf("%d ",e);
            System.out.println("");
        }
    }
    
}
