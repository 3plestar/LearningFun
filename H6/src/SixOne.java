import java.awt.*;
import java.applet.*;


public class SixOne extends Applet {
    double a, friends;
    double money;

    public void init() {
        a = 113;
        friends = 4;
        money = a/friends;
    }

    public void paint(Graphics g) {
        g.drawString("Jan €" + money, 20, 20);
        g.drawString("Ali €" + money, 20, 40);
        g.drawString("Jeannette €" + money, 20, 60);
        g.drawString("Ik €" + money, 20, 80);
    }
}