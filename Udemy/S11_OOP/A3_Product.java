public class A3_Product {
    public static void main(String[] args) {
        Product p1 = new Product(1, "soap", 20, 100);
        Product p2 = new Product(2, "parle", 5, 50);
        System.out.println(p1.getId());
        System.out.println(p2.getId());

    }
}

class Product
{
    private int id;
    private String name;
    private double price;
    private int quantity;

    public Product(int i)
    {
        id = i;
    }
    public Product(int i, String n, double p, int q)
    {
        id = i;
        name = n;
        price = p;
        quantity = q;
    }

    public String getName() { return name;}
    public double getPrice() { return price;}
    public int getQuantity() { return quantity;}
    public int getId() { return id;}
    public void setPrice(int p) { price = p;}
    public void setQuantity(int q) { quantity = q;}

    public String buy(int q)
    {
        quantity -=q;
        return name+" quantity : "+q;
    }
}

class Customer
{
    private String id;
    private String name;
    private String address;
    private String phno;

    public Customer(String i) { id = i;}
    public Customer(String i, String n, String a, String p)
    {
        id = i;
        name= n;
        address = a;
        phno = p;
    }

    public String getName() { return name;}
    public String getAddress() { return address;}
    public String getPhno() { return phno;}

    public void setAddress(String a) { address = a;}
    public void setPhno(String p) { phno = p;}
}
