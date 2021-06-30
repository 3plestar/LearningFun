import java.awt.*;
import java.applet.*;

public class FourThree extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.lightGray);
        g.setColor(Color.orange);
        g.fillOval(19, 12, 8, 8);
        g.fillRect(21,20, 4, 200);
        g.setColor(Color.red);
        g.fillRect(25,20, 100, 20);
        g.setColor(Color.white);
        g.fillRect(25,40, 100, 20);
        g.setColor(Color.blue);
        g.fillRect(25,60, 100, 20);
    }
}