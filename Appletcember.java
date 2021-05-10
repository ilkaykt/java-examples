
package appletcember;
import java.applet.Applet;
import java.awt.Color; 
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
        

public class Appletcember extends Applet implements MouseMotionListener{
int mx, my,x,y,boyut=100,merkx,merky;
        int renk=0;
        String yazi="";
        
        public void init(){
            
            setSize(200,200);
           
            x=getWidth()/2-boyut/2;
            y=getHeight()/2-boyut/2;
        merkx=x+boyut/2;
            System.out.println(merkx);
       
        merky=y+boyut/2;
            addMouseMotionListener(this);
        }
     

        public void paint(Graphics g){
            if (renk==0)g.setColor(Color.black);
            else g.setColor(Color.black);
            g.fillOval(x, y, boyut, boyut);
            g.drawString(yazi, 10, 10);}

    @Override
    public void mouseDragged(MouseEvent me) {
    }

    @Override
    public void mouseMoved(MouseEvent me) {
        mx=me.getX();
        my=me.getY();
        double mesafe=Math.sqrt((mx-merkx)*(mx-merkx)+(my-merky)*(my-merky));
        if (mesafe<=boyut/2) {
       yazi="Mouse çemberin icinde"; renk=1;
        }
       else{
               yazi="Mouse çemberin dısında"; renk=0;
               }
        repaint();
            
        }
    }


        
                
            
        
        
   