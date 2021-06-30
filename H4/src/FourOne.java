import java.awt.*;
import java.applet.*;

public class FourOne extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        g.drawLine(10, 120, 110, 120);
        g.drawLine(10, 120, 60, 30);
        g.drawLine(60, 30, 110, 120);
    }
}