package jpaneltest;


import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JPanel;

public class JPanelTest extends JPanel {

    @Override
    public void paintComponent(Graphics g) {
        g.setColor(Color.black);
        g.drawOval(225, 5, 25, 25); // root bta3 el tree
        g.drawOval(375, 70, 25, 25);// right child
        g.drawOval(75, 70, 25, 25);// left child
        g.drawOval(5, 140, 25, 25);
        g.drawOval(135, 140, 25, 25);
        g.drawOval(300, 140, 25, 25);
        g.drawOval(450, 140, 25, 25);
        
    }

    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        jFrame.add(new JPanelTest());
        jFrame.setSize(500, 500);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

}
