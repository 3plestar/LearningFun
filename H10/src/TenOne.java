import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TenOne extends Applet {
    TextField num;
    double gnum, hi, set;

    public void init(){
        num= new TextField("",20);
        numListener nu = new numListener();
        num.addActionListener(nu);
        add(num);
    }

    public void paint(Graphics g){
        g.drawString("Hoogste ingevoerde getal: " +hi,20,70);
    }

    class numListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            gnum = Double.parseDouble(num.getText());
                if (set==0){
                    set++;
                    hi=gnum;
                }
                if (gnum>hi){
                    hi=gnum;
                }
            repaint();
        }
    }
}
