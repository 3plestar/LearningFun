import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PraktijkOpdrH10 extends Applet {
    int num;
    TextField t;
    String judge,fill;
    Label info;

    public void init(){
        fill="";

        info= new Label("Voer cijfer in:");

        t= new TextField("",20);
        tListener wow = new tListener();
        t.addActionListener(wow);

        add(info);
        add(t);
    }

    public void paint(Graphics g){
        g.drawString(fill,20,50);
    }

    class tListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            num=Integer.parseInt(t.getText());
                if(num>=0 && num<=3){
                    judge=" Slecht";
                    fill="Een "+num+" is"+judge;
                }
                else if(num==4){
                    judge=" Onvoldoende";
                    fill="Een "+num+" is"+judge;
                }
                else if(num==5){
                    judge=" Matig";
                    fill="Een "+num+" is"+judge;
                }
                else if(num>=6 && num<=7){
                    judge=" Voldoende";
                    fill="Een "+num+" is"+judge;
                }
                else if(num>=9 && num<=10){
                    judge=" Goed";
                    fill="Een "+num+" is"+judge;
                }
                else{
                    fill="Alleen cijfers tussen 0 en 10 toegestaan.";
                }

            repaint();
        }
    }

}
