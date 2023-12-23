import java.awt.*;

class F2 extends Frame
{
    Label l;
    TextField t;
    Button b;

    public F2()
    {
        super("Method 3 preferred way");
        setLayout(new FlowLayout());

        l = new Label("Name3: ");
        t = new TextField(20 );
        b = new Button("Ok");

        add(l);
        add(t);
        add(b);
    }

    public static void main(String[] args)
    {
        F2 f = new F2();
        f.setSize(500,500);
        f.setVisible(true);
    }
}