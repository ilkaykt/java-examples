
package javaapplication19;
import java.applet.Applet;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.Graphics;


public class Buyuyentop extends Applet implements Runnable{
    int x,y,boyut,yon=-1;
    
    public void init(){
        
        
        boyut=30;
        setSize(200,200);
        x=getWidth()/2-boyut/2;
        y=getHeight()/2-boyut/2;
        
        (new Thread(Buyuyentop.this)).start();
    }
    
   

    @Override
    public void run() {
       while(true){
    try{
        Thread.sleep(50);
    }
    catch(Exception e){}
    x=x+yon*2;
    y=y+yon*2;
    boyut=boyut-yon*4;
            if (boyut>getHeight()) {
                yon=1;
               
            }
            else if(boyut<10)yon=-1; 
            repaint();
                }
    }
    @Override
    public void paint(Graphics g){
    g.setColor(Color.red);
    g.fillOval(x, y, boyut,boyut);
}
}



