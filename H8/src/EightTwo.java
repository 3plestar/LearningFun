import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class EightTwo extends Applet {
    Button man, vrouw, pman, pvrouw;
    int m, v, pm, pv, all;

    public void init(){
        man = new Button("Man");
        manListener a = new manListener();
        man.addActionListener(a);

        vrouw = new Button("Vrouw");
        vrouwListener b = new vrouwListener();
        vrouw.addActionListener(b);

        pvrouw = new Button("Potentiele vrouw");
        pvrouwListener c = new pvrouwListener();
        pvrouw.addActionListener(c);

        pman = new Button("Potentiele man");
        pmanListener d = new pmanListener();
        pman.addActionListener(d);

        add(man);
        add(vrouw);
        add(pman);
        add(pvrouw);

        setSize(1000,500);

    }

    public void paint(Graphics g){
        g.drawString("Aantal mannen: " +m, 20, 50);
        g.drawString("Aantal vrouwen: " +v, 20, 70);
        g.drawString("Aantal potentiele mannen: " +pm, 20, 90);
        g.drawString("Aantal potentiele vrouwen: " +pv, 20, 110);
        g.drawString("Totaal: " +all, 20, 130);
    }

    class manListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            m++;
            all++;
            repaint();
        }
    }

    class vrouwListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            v++;
            all++;
            repaint();
        }
    }

    class pvrouwListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            pv++;
            all++;
            repaint();
        }
    }

    class pmanListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            pm++;
            all++;
            repaint();
        }
    }
}
