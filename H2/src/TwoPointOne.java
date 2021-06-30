//importeer de benodigde klassen uit de Java bibliotheek
import java.awt.*;
import java.applet.*;

public class TwoPointOne extends Applet {

    public void init() {
        setBackground(Color.blue);
    }

//door de blauw lijkt het alsof de geel wit is
    public void paint(Graphics g) {
        g.setColor(Color.yellow);
        g.drawString("David", 50, 60 );
    }
}