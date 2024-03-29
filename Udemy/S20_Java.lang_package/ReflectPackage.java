import java.lang.reflect.*;

class ReflectPackage{
    public static void main(String[] args){
        Class ob = Object.class; //Class ob = 

        Field fld[] = ob.getDeclaredFields();
        for(Field f:fld)
            System.out.println(f);

        Constructor con[] = ob.getConstructors();
        for(Constructor c:con)
            System.out.println(c);

        Method method[] = ob.getMethods();
        for(Method m:method)
            System.out.println(m);

// user defined class
        Class c=My.class;
        
        Field field[]=c.getDeclaredFields();
        
        Method meth[]=c.getMethods();
        
        for(Method m:meth)
            System.out.println(m);
        
        Parameter param[]=meth[0].getParameters();
        
        for(Parameter p:param)
        {
            System.out.println(p);
        }
    }
}

class My
{
    private int a;
    protected int b;
    public int c;
    int d;
    
    public My() {}
    
    public My(int x,int y) {}
    
    public void display(String s1,String s2) {}
    public int show(int x,int y) {return 0;}
    
}
