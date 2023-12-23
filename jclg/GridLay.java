import java.awt.*;
import javax.swing.*;

class GridLay
{
    JFrame jf;
    JButton jb[] = new JButton[9];
    GridLay()
    {
        jf = new JFrame();
        for(int i=0;i<9;i++)
        {
            jb[i] = new JButton("Sr.No:"+(i+1));
            jf.add(jb[i]);
        }

        jf.setLayout(new GridLayout(2,4));
        jf.setSize(420,420);
        jf.setVisible(true);

    }
    public static void main(String[] args)
    {
        new GridLay();
    }
}