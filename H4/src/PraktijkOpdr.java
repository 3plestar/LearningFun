import java.awt.*;
import java.applet.*;

public class PraktijkOpdr extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        //rij 1
        g.drawString("Lijn", 90, 35 );
        g.drawString("Rechthoek", 70, 155 );
        g.drawString("Afgeronde rechthoek", 40, 275 );

        //rij 2
        g.drawString("Gevulde rechthoek met ovaal", 225, 155 );
        g.drawString("Gevulde ovaal", 280, 275 );

        //rij 3
        g.drawString("Taartpunt met ovaal eromheen", 435, 155 );
        g.drawString("Cirkel", 510, 275 );

        //rij 1
        g.drawLine(10,20,210,20);
        g.drawRect(10, 40,200,100);
        g.drawRoundRect(10,160,200,100,30,30);

        //rij 2 kleur
        g.setColor(Color.magenta);
        g.fillRect(220, 40,200,100);
        g.fillOval(220,160,200,100);

        //rij 3 kleur
        g.fillArc(430,40,200,100,0,45);

        //rij 2
        g.setColor(Color.black);
        g.drawOval(220,40,200,100);

        //rij 3
        g.drawOval(430,40,200,100);
        g.drawOval(480,160,100,100);
    }
}