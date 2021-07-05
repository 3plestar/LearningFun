import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class EightOne extends Applet {
    Label a;
    TextField b;
    Button ok, reset;
    String text;

    public void init() {
        text = "";

        a = new Label("Type and press ok or reset");
        b = new TextField("", 20);

        ok = new Button("Ok");
        okListener oky = new okListener();
        ok.addActionListener(oky);

        reset = new Button("Reset");
        resetListener re = new resetListener();
        reset.addActionListener(re);

        add(a);
        add(b);
        add(ok);
        add(reset);
    }

    public void paint(Graphics g) {
        g.drawString(text, 50, 100);
    }

    class okListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            text = b.getText();
            repaint();
        }
    }

    class resetListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            text = "";
            b.setText("");
            repaint();
        }
    }
}
