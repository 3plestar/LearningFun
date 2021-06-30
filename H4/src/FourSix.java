import java.awt.*;
import java.applet.*;

public class FourSix extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        g.fillArc(10,30,100,100,0,180);
        g.fillRect(10,80,100,140);
        g.fillArc(10,170,100,100,0,-180);
        g.setColor(Color.green);
        g.fillOval(30, 50, 60,60);
        g.setColor(Color.orange);
        g.fillOval(30, 120, 60,60);
        g.setColor(Color.red);
        g.fillOval(30, 190, 60,60);
    }
}