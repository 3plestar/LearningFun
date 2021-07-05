import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
Maak een applet waarin een tekstvak met label en een knop Ok staan.
In het tekstvak moet een bedrag worden ingevuld en zodra de gebruiker op Ok klikt
of op de enter-toets drukt moet de prijs inclusief BTW (= 21%) in het venster geplaatst worden.
 */

public class EightThree extends Applet {
    Label a;
    TextField mon;
    Button ok;
    double price, btw;

    public void init(){
        a= new Label("Voer het bedrag in");

        mon= new TextField("", 20);
        monListener money = new monListener();
        mon.addActionListener(money);

        ok= new Button("Ok");
        okListener oky = new okListener();
        ok.addActionListener(oky);

        add(a);
        add(mon);
        add(ok);
    }

    public void paint(Graphics g){
        g.drawString("Bedrag plus Btw: €" +btw, 20, 50);
    }

    class monListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            price = Double.parseDouble(mon.getText());
            btw = price + price * 0.21;
            repaint();
        }
    }

    class okListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            price = Double.parseDouble( mon.getText() );
            btw = price + price * 0.21;
            repaint();
        }
    }

}
