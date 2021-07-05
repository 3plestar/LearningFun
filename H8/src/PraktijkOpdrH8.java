import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PraktijkOpdrH8 extends Applet {
    TextField num1, num2;
    Button plus, min, mult, div;
    double gnum1, gnum2, awnser;

    public void init(){
        num1= new TextField("",20);
        num2= new TextField("", 20);

        plus= new Button("+");
        plusListener pl = new plusListener();
        plus.addActionListener(pl);

        min= new Button("-");
        minListener mi = new minListener();
        min.addActionListener(mi);

        mult= new Button("*");
        multListener mu = new multListener();
        mult.addActionListener(mu);

        div= new Button("/");
        divListener di = new divListener();
        div.addActionListener(di);

        add(num1);
        add(num2);
        add(plus);
        add(min);
        add(mult);
        add(div);

        setSize(700,500);
    }

    public void paint(Graphics g){
        g.drawString("" +awnser, 20, 60);
    }

    class plusListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            gnum1 = Double.parseDouble(num1.getText());
            gnum2 = Double.parseDouble(num2.getText());
            awnser = gnum1 + gnum2;
            repaint();
        }
    }

    class minListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            gnum1 = Double.parseDouble(num1.getText());
            gnum2 = Double.parseDouble(num2.getText());
            awnser = gnum1 - gnum2;
            repaint();
        }
    }

    class multListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            gnum1 = Double.parseDouble(num1.getText());
            gnum2 = Double.parseDouble(num2.getText());
            awnser = gnum1 * gnum2;
            repaint();
        }
    }

    class divListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            gnum1 = Double.parseDouble(num1.getText());
            gnum2 = Double.parseDouble(num2.getText());
            awnser = gnum1 / gnum2;
            repaint();
        }
    }

}
