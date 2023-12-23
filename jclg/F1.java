import java.awt.*;

// Method 2 isA
class Meth2 extends Frame
{
    Label l;
    TextField tf;
    Button b;

    public Meth2()
    {
        super("Method2 App");
        setLayout(new FlowLayout());

        l = new Label("Name : ");
        tf = new TextField(30);
        b = new Button("M2 Sub");

        add(l);
        add(tf);
        add(b);
    }
}

class F1
{
    public static void main(String[] args)
    {
        // Method 2 isA
        Meth2 m2f = new Meth2();
        m2f.setSize(400,300);
        m2f.setVisible(true);

        // Method 1 hasA
        Frame f = new Frame("The App");
        f.setLayout(new FlowLayout());

        Label l = new Label("Name: ");
        TextField tf = new TextField(20);
        Button b = new Button("Submit");

        f.add(l);
        f.add(tf);
        f.add(b);

        f.setSize(300,300);
        f.setVisible(true);
    }
}