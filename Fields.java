import java.awt.*;
import java.applet.*;




public class Fields extends Applet {


    public static void drawTree(Graphics g) {


        int red = 92;
        int green = 64;
       int blue = 51;
    g.setColor(new Color(red,green,blue));
       g.fillRect(75,450,50,100);

        g.setColor(new Color(0,100,0));
        g.fillOval( 50,375,100,100);
    }


    public static void drawBushes(Graphics g) {
        int red = 0;
        int green = 100;
        int blue = 0;

        g.setColor(new Color(red,green,blue));
        g.fillOval(125,500,70,40);
        g.fillOval(125,490,40,30);
        g.fillOval(150,490,40,30);
        g.fillOval(100,500,40,30);
        g.fillOval(110,510,30,30);
        g.fillOval(135,485,40,30);
        g.fillOval(145,490,50,30);



    }


    public static void drawHouse(Graphics g) {







    }


    public static void drawLake(Graphics g) {


    int red = 0;
    int green = 0;
    int blue = 54;

    g.setColor(new Color(red,green,blue));
    g.fillOval(700,475, 150,100);
    g.fillOval(725,500,175,100);
}



}
