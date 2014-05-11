
/*
Window for slider.
*/

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class Window extends JFrame{
        private JSlider slider;
        private Main c ;
        
        
        
        public Exer20(){
                super("Slider ");
                c = new Main();
                c.setBackground(Color.LIGHT_GRAY);
                slider = new JSlider(SwingConstants.HORIZONTAL, 0, 200, 10);
                slider.setMajorTickSpacing(10);
                slider.setPaintTicks(true);
                
                slider.addChangeListener(
                        new ChangeListener(){

                    @Override
                    public void stateChanged(ChangeEvent e) {
                       c.setD(slider.getValue());
                    }
                        
                        }
                );
                
                add(slider, BorderLayout.SOUTH);
                add(c, BorderLayout.CENTER);
            }
}
