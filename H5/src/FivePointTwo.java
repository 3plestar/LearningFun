import java.awt.*;
import java.applet.*;

public class FivePointTwo extends Applet {
    //I hereby declare
    int weightValerie;
    int weightJeroen;
    int weightHans;

    public void init() {
        weightValerie=60;
        weightJeroen=40;
        weightHans=90;
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
        g.fillRect(35, 120-weightValerie ,10,weightValerie);
        g.setColor(Color.green);
        g.fillRect(85, 120-weightJeroen ,10,weightJeroen);
        g.setColor(Color.blue);
        g.fillRect(135, 120-weightHans ,10,weightHans);
    }
}

/*
Ik voel me slim door die 120-weight. Ben daar helemaal zelf op gekomen.
 */