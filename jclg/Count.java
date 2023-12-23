import java.awt.*;
import java.awt.event.*;
class ButtonDemo extends Frame implements ActionListener
{
    int count = 0;
    Label l;
    Button b;

    public ButtonDemo()
    {
        super("Counter");
        setLayout(new FlowLayout());

        l = new Label("    "+count);
        b = new Button("Click");
        b.addActionListener(this);

        add(l);
        add(b);
    }
    public void actionPerformed(ActionEvent e)
    {
        // count++;
        // l.setText("    "+count);
        for(int i=0; i  < 999; i++)
        {
            l.setText("    "+i);
            for(int j=0;j<500000000;j++){
                j++;
            }
        }
    }

}
class Count
{
    public static void main(String[] args)
    {
        ButtonDemo c = new ButtonDemo();
        c.setSize(300,300);
        c.setVisible(true);
    }
}