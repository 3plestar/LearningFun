import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TenFour extends Applet {
    TextField m, y;
    Button but;
    int month, year;
    String text;
    Label ml, yl;

    public void init(){
        text= "";

        ml= new Label("Month");
        yl= new Label("Year");

        m= new TextField("", 20);
        y= new TextField("", 20);

        but= new Button("Ok");
        butListener n = new butListener();
        but.addActionListener(n);

        add(yl);
        add(y);
        add(ml);
        add(m);
        add(but);

        setSize(700,500);
    }

    public void paint(Graphics g) {
        g.drawString(text, 50, 60 );
    }

    class butListener implements ActionListener {
        public void actionPerformed(ActionEvent e){
            month = Integer.parseInt(m.getText());
            year = Integer.parseInt(y.getText());
            switch(month) {
                case 1:
                    text = "Januari, 31 dagen";
                    break;
                case 2:
                        if ( (year % 4 == 0 && !(year % 100 == 0)) || year % 400 == 0 ) {
                            text = "Februari, 29 dagen";
                        }
                        else {
                            text = "Februari, 28 dagen";
                        }
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
