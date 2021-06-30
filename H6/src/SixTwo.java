import java.awt.*;
import java.applet.*;


public class SixTwo extends Applet {
    int second, hour, day, year;

    public void init() {
        second=1;
        hour=second*(60*60);
        day=hour*24;
        year=day*265;
    }

    public void paint(Graphics g) {
        g.drawString("Aantal seconden in een seconde:" + second, 20, 20);
        g.drawString("Aantal seconden in een uur:" + hour, 20, 40);
        g.drawString("Aantal seconden in een dag:" + day, 20, 60);
        g.drawString("Aantal seconden in een jaar:" + year, 20, 80);
    }
}