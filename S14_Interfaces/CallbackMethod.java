class CallbackMethod
{
    public static void main(String[] args)
    {
        Store s = new Store();
        Customer c1 = new Customer("sam");
        Customer c2 = new Customer("sara");
        s.register(c1);
        s.register(c2);
        s.inviteSale();
    }

}

interface IMember
{
    void callback();
}

class Store
{
    IMember m[] = new IMember[100];
    int count = 0;

    void register(IMember m)
    {
        this.m[count++] = m;
    }
    void inviteSale()
    {
        for(int i = 0;i<count;i++)
            this.m[i].callback();
    }
}

class Customer implements IMember
{
    String name;
    Customer(String n){ name = n;}
    public void callback(){ System.out.println("ok, i will visit. "+name);}
}
