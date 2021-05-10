package apletuygg;
import java.applet.Applet;
import java.awt.*;


public class Apletuygg extends Applet implements Runnable{
int x,y;
    public void init(){
        x=0;
        y=0;
        setSize(500,500);
    }
    public void run() {
       
    }
    public void paint(Graphics g){
       g.drawLine(100, 100, 100, 200);
       g.drawLine(100,100,200,100);
       g.drawLine(200,100,200,200);
       g.drawLine(100,200,200,200);
       g.drawLine(150,150,250,150);
       g.drawLine(150, 150, 150, 50);
       g.drawLine(150, 50, 250, 50);
       g.drawLine(250,50,250,150);
       g.drawLine(100, 100, 150, 50);
       g.drawLine(100, 200, 150, 150);
       g.drawLine(200, 200, 250, 150);
       g.drawLine(200, 100, 250, 50);
       g.drawLine(5,210,100,210);
       g.drawString("Abi goruyorsunuz.", 5, 225);
       g.drawLine(5, 230, 100, 230);
       g.drawOval(100, 300, 100, 100);
       g.drawOval(150, 300, 100, 100);
       g.drawOval(125,250, 100, 100);
       g.drawOval(125, 350, 100,100);
    }
}

   