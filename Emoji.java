import java.applet.*;
import java.awt.*;
/*
<applet code="Emoji.java" width="600" height="600">
</applet>
*/
public class Emoji extends Applet
{
    public void paint(Graphics g)
    {
        g.setColor(Color.black);
        g.drawOval(200,150,250,250);

        g.setColor(Color.yellow);
        g.fillOval(200,150,250,250);
        
        g.setColor(Color.black);
        g.fillOval(265,240,15,25);
        g.fillOval(370,240,15,25);
        
        //g.drawLine(340,300,250,250);//
 
    
        g.fillArc(295,310,80,50,180,180);   
    }
}