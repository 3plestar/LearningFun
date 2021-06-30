import java.awt.*;
import java.applet.*;

public class FourFive extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.blue);
        g.setColor(Color.yellow);
        g.fillArc(100,50,100,100,0,180);
        g.fillRect(100,100,100,100);
        g.fillArc(100,150,100,100,0,-180);
    }
}