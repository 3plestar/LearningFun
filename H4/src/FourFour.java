import java.awt.*;
import java.applet.*;

public class FourFour extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        g.drawString("100", 0, 20 );
        g.drawString("80", 8, 40 );
        g.drawString("60", 8, 60 );
        g.drawString("40", 8, 80 );
        g.drawString("20", 8, 100 );
        g.drawString("0", 16, 120 );

        g.drawString("Valerie", 35, 135 );
        g.drawString("Jeroen", 85, 135 );
        g.drawString("Hans", 135, 135 );

        g.setColor(Color.red);
        g.fillRect(35, 80 ,10,40);
        g.setColor(Color.green);
        g.fillRect(85, 20 ,10,100);
        g.setColor(Color.blue);
        g.fillRect(135, 40 ,10,80);
    }
}