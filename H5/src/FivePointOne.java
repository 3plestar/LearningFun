import java.awt.*;
import java.applet.*;

public class FivePointOne extends Applet {
    //I hereby declare
    Color fillcolor;
    Color linecolor;
    int width;
    int height;

    public void init() {
        fillcolor=Color.magenta;
        linecolor=Color.black;
        width=200;
        height=100;
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
        g.drawRect(10, 40,width,height);
        g.drawRoundRect(10,160,width,height,30,30);

        //rij 2 kleur
        g.setColor(fillcolor);
        g.fillRect(220, 40,width,height);
        g.fillOval(220,160,width,height);

        //rij 3 kleur
        g.fillArc(430,40,width,height,0,45);

        //rij 2
        g.setColor(linecolor);
        g.drawOval(220,40,width,height);

        //rij 3
        g.drawOval(430,40,width,height);
        g.drawOval(480,160,100,height);
    }
}
