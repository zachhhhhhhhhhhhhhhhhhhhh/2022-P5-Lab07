import java.awt.*;
import java.applet.*;
public class MountainRange extends Applet{

    public void paint(Graphics g){



        //background
        Background.drawGround(g);
        Background.drawSky(g);



        //mountains
        Mountains.drawFlag(g);
        Mountains.drawPeaks(g);
        Mountains.drawsnow(g);
        Mountains.drawSun(g);
//fields
        Fields.drawTree(g);
        Fields.drawBushes(g);
        Fields.drawHouse(g);
        Fields.drawLake(g);

    }

























}
