import java.awt.*;
class BordLay extends Frame
{
    TextField name, pass;
    Button e,w,s,n,c;
    // BorderLayout B1;
    BordLay(String title)
    {
        super(title);
        setVisible(true);
        setSize(420,420);
        setLayout(new BorderLayout());
        e = new Button("East");
        w = new Button("West");
        s = new Button("South");
        n = new Button("North");
        c = new Button("Center");

        add(e,BorderLayout.EAST);
        add(w,BorderLayout.WEST);
        add(s,BorderLayout.SOUTH);
        add(n,BorderLayout.NORTH);
        add(c,BorderLayout.CENTER);
    }

    public static void main(String[] args)
    {
        // BordLay bl = new BordLay("BorderLayout");
        new BordLay("BorderLayout");
    }
}