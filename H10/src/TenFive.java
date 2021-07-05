import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TenFive extends Applet {
    double snum, num1, num2, num3, fin;
    int set;
    TextField t;
    Button ok;
    String s1,s2,s3,vol1,vol2,vol3,res,sfin;

    public void init(){
        t= new TextField("",20);

        res="Ok";
        ok= new Button("Ok");
        okListener n = new okListener();
        ok.addActionListener(n);

        s1="";
        s2="";
        s3="";
        vol1="";
        vol2="";
        vol3="";
        sfin="";

        add(t);
        add(ok);
    }

    public void paint(Graphics g) {
        g.drawString("Eerste cijfer: "+s1 +vol1, 50, 60 );
        g.drawString("Tweede cijfer: "+s2 +vol2, 50, 80 );
        g.drawString("Derde cijfer: "+s3 +vol3, 50, 100 );
        g.drawString("gemiddelde: "+sfin, 50, 120);
    }

    class okListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            snum = Double.parseDouble(t.getText());
            if (set==0 && snum>=0 && snum<=10){
                set++;
                num1 = snum;
                    s1 = ""+num1;
                    if (num1 > 5.5) {
                        vol1 = " Voldoende";
                    } else {
                        vol1 = " Onvoldoende";
                    }
                    fin=num1;
                    sfin=""+fin;
            }
            else if (set==1 && snum>=0 && snum<=10){
                set++;
                num2 = snum;
                    s2 = "" + num2;
                    if (num2 > 5.5) {
                        vol2 = " Voldoende";
                    } else {
                        vol2 = " Onvoldoende";
                    }
                    fin=(num1+num2)/2;
                    sfin=""+fin;

            }
            else if (set==2 && snum>=0 && snum<=10){
                set++;
                num3 = snum;

                    s3 = "" + num3;
                    if (num3 > 5.5) {
                        vol3 = " Voldoende";
                    } else {
                        vol3 = " Onvoldoende";
                    }
                    fin=(num1+num2+num3)/3;
                    sfin=""+fin;

                ok.setLabel("Reset");
            }
            else if (set==3){
                set=0;
                ok.setLabel("Ok");
                s1="";
                s2="";
                s3="";
                vol1="";
                vol2="";
                vol3="";
                sfin="";
            }
            repaint();
        }
    }

}
