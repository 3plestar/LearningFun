//"zo eerlijk mogelijk" zeg je
import java.awt.*;
import java.applet.*;


public class Meme extends Applet {
    int a, friends, money, bonus;

    public void init() {
        a = 927;
        friends = 4;
        money = a/friends;
        //echt heel eerlijk:
        bonus= money+a%friends;
    }

    public void paint(Graphics g) {
        g.drawString("Jan €" + money, 20, 20);
        g.drawString("Ali €" + money, 20, 40);
        g.drawString("Jeannette €" + money, 20, 60);
        //niks mis mee
        g.drawString("Ik €" + bonus, 20, 80);
    }
}