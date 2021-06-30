import java.awt.*;
import java.applet.*;

public class TwoPointTwo extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        g.setColor(Color.red);
        g.drawString("David", 50, 60 );
        g.setColor(Color.blue);
        g.drawString("Dekker", 50, 80 );
    }
}