import java.applet.*;
import java.awt.*;

public class SixThree extends Applet {
    int a, b, negative;

    public void init() {
        a=2147483647;
        b=100;
        negative=a+b;
    }

    public void paint(Graphics g) {
        g.drawString(""+negative, 20,20);

    }

}
