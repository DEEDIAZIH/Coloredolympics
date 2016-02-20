

import javax.swing.JApplet;
import java.awt.Color;
import java.awt.Graphics;

public class olympicsColors extends JApplet {
    
    public void paint(Graphics canvas) 
    {
canvas.drawOval(100, 50, 100, 100);
canvas.drawOval(240, 50, 100, 100);
canvas.drawOval(380, 50, 100, 100);
canvas.drawOval(170, 100, 100, 100);
canvas.drawOval(310, 100, 100, 100);  
    
   // draw oval interior and outline:
    canvas.setColor(Color.BLUE);
    canvas.fillOval(100, 50, 100, 100);
    
    canvas.setColor(Color.YELLOW);
    canvas.fillOval(240, 50, 100, 100);
    
    canvas.setColor(Color.BLACK);
    canvas.fillOval(380, 50, 100, 100);
    
    canvas.setColor(Color.GREEN);
    canvas.fillOval(170, 100, 100, 100);
    
    canvas.setColor(Color.RED);
    canvas.fillOval(310, 100, 100, 100);
    
        
    }

   
}
