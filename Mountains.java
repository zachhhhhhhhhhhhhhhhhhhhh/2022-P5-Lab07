import java.awt.*;
import java.applet.*;




public class Mountains extends Applet{

    public static void drawPeaks(Graphics g){

        int red =90;
        int green = 90;
        int blue = 90;

        g.setColor(new Color(red,green,blue));

        g.fillArc(100,150,200,500,0,180);

        g.fillArc(150,125,200,550,0,180);
        g.fillArc(500,150,200,500,0,180);

        g.fillArc(650,100,200,600,0,180);
    }




    public static void drawsnow(Graphics g){



    }


    public static void drawFlag(Graphics g){
        g.setColor(Color.red);
        g.fillRect(740,50,50,20);


        int red = 158;
        int green = 157;
        int blue = 157;

        g.setColor(new Color(red,green,blue));
        g.fillRect(735, 40, 10,70);

        int r2 = 255;
        int g2 = 215;
        int b2 = 0;
        g.setColor(new Color(r2,g2,b2));
        g.fillOval(725, 20,30,30);




    }



    public static void drawSun(Graphics g){
        int red = 255;
        int green = 255;
        int blue = 0;

        g.setColor( new Color(red, green , blue));
        g.fillOval(1,1,100, 100 );




    }
}
