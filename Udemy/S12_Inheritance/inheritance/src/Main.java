public class Main {
    public static void main(String[] args) {
        SavingsAccount s1 = new SavingsAccount("Dhiraj Birajdar", "Pune", "998585", "12-02-200");
        LoanAccount l1 = new LoanAccount("Akash", "Goa", "54546", "12-05-2003");
        System.out.println(s1.deposit(50000));
        System.out.println(s1.withdraw(50000));
        System.out.println(l1.repayment(50000));
        System.out.println(s1.getAcno$());
        SavingsAccount s2 = new SavingsAccount("Dhiraj Birajdar", "Pune", "998585", "12-02-200");
        System.out.println(s2.getAcno$());




    }
}

class Account{
    // private properties
    private static int acno$ = 1000;
    private int balance;
    private String name;
    private String address;
    private String phno;
    private String dob;
    // constructor
    public Account(String name, String address, String phno, String dob){
        acno$ = ++acno$;
        this.name = name;
        setAddress(address);
        setPhno(phno);
        this.dob = dob;
    }
    // get methods
    public int getAcno$(){
        return acno$;
    }
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public String getPhno() {
        return phno;
    }
    public String getDob() {
        return dob;
    }
    // set methods
    public void setAddress(String address) {
        this.address = address;
    }
    public void setPhno(String phno) {
        this.phno = phno;
    }
    public int getBalance() {
        return balance;
    }

    protected void setBalance(int balance) {
        this.balance = balance;
    }
}

class SavingsAccount extends Account{

    public SavingsAccount(String name, String address, String phno, String dob){
        super(name, address, phno,dob);

    }
    public int deposit(int amount){
        setBalance(getBalance() + amount);
        return getBalance();
    }
    public int withdraw(int amount){
        if(amount >= getBalance()){
            setBalance(getBalance()-amount);
        }
        return getBalance();
    }
}

class LoanAccount extends Account{
    public LoanAccount(String name, String address, String phno, String dob){
        super(name, address, phno,dob);
    }
    public void payEmi(int amount){
        setBalance(getBalance()+amount);
    }
    public int repayment(int amount){
        if(getBalance() == amount)
            setBalance(getBalance()-amount);
        return getBalance();
    }
}
