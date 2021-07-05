import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TenThree extends Applet {
    TextField a;
    Label label;
    int month;
    String text;

    public void init(){
        text= "";

        a= new TextField("", 20);
        aListener n = new aListener();
        a.addActionListener(n);

        label= new Label("Enter maand nummer");

        add(label);
        add(a);
    }

    public void paint(Graphics g) {
        g.drawString(text, 50, 60 );
    }

    class aListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            month = Integer.parseInt(a.getText());
            switch(month) {
                case 1:
                    text = "Januari, 31 dagen";
                    break;
                case 2:
                    text = "Februari, 28 of 29 dagen";
                    break;
                case 3:
                    text = "Maart, 31 dagen";
                    break;
                case 4:
                    text = "April, 30 dagen";
                    break;
                case 5:
                    text = "Mei, 31 dagen";
                    break;
                case 6:
                    text = "Juni, 30 dagen";
                    break;
                case 7:
                    text = "Juli, 31 dagen";
                    break;
                case 8:
                    text = "Augustus, 31 dagen";
                    break;
                case 9:
                    text = "September, 30 dagen";
                    break;
                case 10:
                    text = "Oktober, 31 dagen";
                    break;
                case 11:
                    text = "November, 30 dagen";
                    break;
                case 12:
                    text = "December, 31 dagen";
                    break;
                default:
                    text = "Verkeerd getal";
                    break;
            }
            repaint();
        }
    }

}
