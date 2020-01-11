import javax.swing.*;
import java.awt.*;

public class DrawACar extends JPanel{
    int x = 0;
    public static void main() {

        JFrame f = new JFrame();
        f.setContentPane(new DrawACar());
        f.setSize(600, 400);
        f.setVisible(true);
    }

    public void paintComponent(Graphics g){
        // this statement required
        super.paintComponent(g);

        // optional: paint the background color (default is white)
        setBackground(Color.CYAN);
        int y, width, height;
        x = x + 2;
        y = 200;
        width = 600;
        height = 400;

        // display words
        g.setColor(Color.GRAY);
        g.fillRect( 0, y, width, height);

        g.setColor(Color.RED);
        g.fillRect( x + 85, y - 50, 265, 100);
        g.fillRect( x + 110, y -125, 200, 75);

        g.setColor(Color.WHITE);
        g.fillRect(x + 120, y -115, 75, 60);
        g.fillRect(x + 210, y -115, 75, 60);

        g.setColor(Color.BLACK);
        g.fillOval(x + 100, y + 25  , 50, 50);

        g.fillOval(x + 280, y + 25  , 50, 50);

        g.setColor(Color.YELLOW);
        g.fillOval( 400, y - 200, 100, 100);

        
        int x1 = 100;
        y = 250;

        g.setColor(Color.BLUE);
        g.fillRect( x1 + 85, y - 50, 265, 100);
        g.fillRect( x1 + 110, y -125, 200, 75);

        g.setColor(Color.WHITE);
        g.fillRect(x1 + 120, y -115, 75, 60);
        g.fillRect(x1 + 210, y -115, 75, 60);

        g.setColor(Color.BLACK);
        g.fillOval(x1 + 100, y + 25  , 50, 50);

        g.fillOval(x1 + 280, y + 25  , 50, 50);

        
        
    }
}
