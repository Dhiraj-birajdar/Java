public class A5MatAdd {
    public static void main(String[] args) {
        
        int a[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int b[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int c[][] = new int[3][3];

        for(int i=0;i<a.length;i++)
            for(int j=0;j<a[i].length;j++)
                c[i][j] = a[i][j] + b[i][j];

        for(int r[]:b)
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
                System.out.printf("%02d ",e);
            System.out.println("");
        }
    }
    
}
