import java.applet.*;
import java.awt.*;

public class PraktijkOpdrH6 extends Applet {
    double C1, C2, C3, answer,wario, doubleback;
    int intconvert;


    public void init() {
        C1=5.9;
        C2=6.3;
        C3=6.9;

        wario=(C1+C2+C3)/3*10;
        doubleback=intconvert=(int)wario;
        answer=doubleback/10;
    }

    public void paint(Graphics g) {
        g.drawString("Het gemiddelde is: "+answer, 20,20);
    }

}
