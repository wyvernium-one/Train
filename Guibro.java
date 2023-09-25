import javax.swing.*;
public class Guibro 
{
    public static void main(String[] args) 
    {
        String name = JOptionPane.showInputDialog(null, args, "Enter your name", 0);
        JOptionPane.showMessageDialog(null, args, "Hello " +name, 0);

        int age = Integer.parseInt(JOptionPane.showInputDialog(null, args, "Enter your age", 0));
        JOptionPane.showMessageDialog(null, args, "You are " +age+" years old", 0);



    }
}
