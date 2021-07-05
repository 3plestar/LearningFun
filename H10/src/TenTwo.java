import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TenTwo extends Applet {
    TextField num;
    double gnum, hi, low, set;

    public void init(){
        num= new TextField("",20);
        numListener nu = new numListener();
        num.addActionListener(nu);
        add(num);
    }

    public void paint(Graphics g){
        g.drawString("Hoogste ingevoerde getal: " +hi,20,70);
        g.drawString("Laagste ingevoerde getal: " +low,20,90);
    }

    class numListener implements ActionListener {
        public void actionPerformed(ActionEvent e){
            gnum = Double.parseDouble(num.getText());
            if (set==0){
                set++;
                hi=gnum;
                low=gnum;
            }

            if (gnum>hi){
                hi=gnum;
            }

            if (gnum<low) {
                low=gnum;
            }
            repaint();
        }
    }
}
