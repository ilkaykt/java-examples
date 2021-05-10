
package appletuygulama;
import java.applet.Applet;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.Window;
public class Applet_uygulama extends Applet implements Runnable{
    int x,y;
    public static void centreWindow(Window frame) {
    Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (int) ((dimension.getWidth() - frame.getWidth()) / 2);
    int y = (int) ((dimension.getHeight() - frame.getHeight()) / 2);
    frame.setLocation(x, y);
}
    public void init(){
        x=0;
        y=0;
        setSize(200,200);
        
        (new Thread(Applet_uygulama.this)).start();
    }   
    @Override
    
    public void run() {
        while(true){
            try{
                Thread.sleep(10);
            }
            catch(Exception e){
                
            }
            x=x+1;
            y=y+1;
            repaint();
        }
    }
    public void paint(Graphics g){
        g.setColor(Color.black);
        g.fillRect(x, y, 30, 30);
    }
}

