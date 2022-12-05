import java.awt.*;
import java.applet.*;

public class Background extends Applet{


        public static void drawGround (Graphics g){
            int red =144;
            int green = 238;
            int blue = 144;
            g.setColor(new Color(red, green, blue));
            g.fillRect(0, 400 ,1000,200);

        }


        public static void drawSky(Graphics g){


            int red = 173;
            int green = 216;
            int blue = 230;

            g.setColor(new Color(red, green, blue));
            g.fillRect(1,1 , 1000,400);
    }
}
