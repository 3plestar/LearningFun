import java.awt.*;
import java.applet.*;

public class FourTwo extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        g.drawLine(20, 120, 120, 120);
        g.drawLine(20, 120, 70, 50);
        g.drawLine(70, 50, 120, 120);
        g.drawRect(25,120, 90, 80);
        g.drawRect(35,160, 30, 40);
    }
}