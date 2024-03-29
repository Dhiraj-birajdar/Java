public class A1_array {
    public static void main(String[] args) {
        
        int a[]={9,3,6,2,4,7},sum=0,max1=0,find=7,max2=0;
        // Sum of
        for(int e:a)
        {
            sum+=e;
            System.out.print(e+", ");
        }
        System.out.println("");
        System.out.println("\nSum of array of elements is : "+sum);

        for(int e:a)
            if(e>max1)
            {
                max2=max1;
                max1=e;
            }
            else if(e>max2)
                max2 = e;
        System.out.println("lagest : "+max1+"\tsecond largest : "+max2);

        for(int e:a)
            if(max1<=e)
                max1=e;
        System.out.println("\nLargest element in array is : "+max1);
        
        for(int e:a)
            if(max2<e && e < max1)
                max2=e;
        System.out.println("\nsecond Largest element in array is : "+max2);

        for(int i=0;i<a.length;i++)
            if(a[i]==find)
            {
                System.out.println("\n"+find+" found at index "+i+" and position "+(i+1));
                // System.exit(0);
                break;
            }
            else if(i==a.length-1)
                System.out.println("\n"+find+" not found");
        
    }
    
}
