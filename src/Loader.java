import javax.swing.*;
import java.awt.*;

public class Loader
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setSize(800,600);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setTitle("Our first window application");
        int x = (int) ((dimension.getWidth() - frame.getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - frame.getHeight()) / 2);
        frame.setLocation(x, y);
        frame.setVisible(true);
        System.out.println("Some text");
    }
}
