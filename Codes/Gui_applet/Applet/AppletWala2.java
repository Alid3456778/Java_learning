import java.applet.*;
import java.awt.*;

public class AppletWala2 extends Applet{
     public void init(){
        System.out.println("Initialization of Applet");
    }
    public void start(){
        System.out.println("Starting the Applet");
    }
    public void paint(Graphics g){
        g.drawString ("Hello World", 20, 20);
    }
        public void stop(){
        System.out.println("Stoping the Applet");
    }
}