package GUI;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.plaf.ColorUIResource;

public class Win extends JFrame
{
    Win()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Taylor's Application");
        this.setSize(1280, 720);
        this.setVisible(true);

        ImageIcon imgIcon = new ImageIcon("D:\\Java\\GUI\\Taylor.png");
        this.setIconImage(imgIcon.getImage());
        this.getContentPane().setBackground(new ColorUIResource(0, 0, 0));
    }
}
