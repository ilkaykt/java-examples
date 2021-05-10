/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appletuyg;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;


public class Appletuyg extends Applet implements Runnable,KeyListener{
    
    int x,y,boyut=50,yon=1;
    public void init(){
        setSize(200, 200);
        x=0;
        y=getHeight()/2-(boyut/2);
        (new Thread(Appletuyg.this)).start();
         addKeyListener(this);
        
    }
   
    
    @Override
    public void run() {
         while(true){
      try{        
              Thread.sleep(100);
          
          }   
      
      
          catch(Exception e){}
      x=x+yon*2;
        if (x>getHeight()-50) {
            yon=-1;
        }
        else if (x==0) {
            yon=1;
        }
        repaint();
    }
    }
          
      
    public void paint(Graphics g){
        g.setColor(Color.red);
        g.fillOval(x, y, boyut, boyut);
        
    }

    @Override
    public void keyTyped(KeyEvent ke) {
     
    }

    @Override
    public void keyPressed(KeyEvent ke){
        if (ke.getKeyCode()==KeyEvent.VK_DOWN) {
           y=y+5;
           repaint();
        }
        if (ke.getKeyCode()==KeyEvent.VK_UP) {
           y=y-5;
           repaint();
        }
        
    }

    @Override
    public void keyReleased(KeyEvent ke) {
       
    }


}
