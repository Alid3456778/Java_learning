import java.applet.*;
import java.awt.*;

public class AppletWala extends Applet{

    public void init(){
        System.out.println("Initialization of Applet");
    }
    public void start(){
        System.out.println("Starting the Applet");
    }
    public void stop(){
        System.out.println("Stoping the Applet");
    }
    public void paint(Graphics g){
        System.out.println("Painting The Applet");
    }
    public void destory(){
        System.out.println("Destorying the Applet");
    }

    // public static void main(String[] args){
    //         AppletWala applet = new AppletWala();
    //         applet.init();
    //         applet.start();
    //         // applet.paint(new Graphics);
    //         applet.stop();
    //         // applet.destory();
     

    // }
}