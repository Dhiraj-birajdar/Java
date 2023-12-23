import java.awt.*;
class AwtUi {
    public static void main(String[] args) {
        Ui frame = new Ui();
        frame.setTitle("FlowLayout in Java Example");
        frame.setSize(400,150);
        frame.setVisible(true);
    }
}

class Ui extends Frame
{
    Ui()
    {
        Button[] button = new Button[10];
        setLayout(new FlowLayout());
        for(int i=0;i<button.length;i++)
        {
            button[i]= new Button("Button "+(i+1));
            add(button[i]);
        }
    }
}