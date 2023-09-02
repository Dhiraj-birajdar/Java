import javax.swing.JOptionPane;
public class Gui{
    public static void main(String[] args) {
        
        String name = JOptionPane.showInputDialog(null, args, "hi hello", 0);
        JOptionPane.showMessageDialog(null, "hello "+name);
        int age = Integer.parseInt(JOptionPane.showInputDialog(null, args, "hi hello", 0));
        JOptionPane.showMessageDialog(null, "hello "+age);

    }
}