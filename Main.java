/*
This file creates the ball.
*/

import java.awt.*;
import javax.swing.*;

public class Main extends JPanel{
    private int d = 10;
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.fillOval(10, 10, d, d);
    }
    
    public void setD(int newD){
        d = (newD >= 0 ? newD :  10);
        repaint();
    }
    
    @Override
    public Dimension getPreferredSize(){
        return new Dimension(200, 200);   
    }
    
    public Dimension getMinimiundSize(){
    return getPreferredSize();
    }
    
}
