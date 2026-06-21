
package com.mycompany.mouse;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;

public class Mouse extends Frame{
    public Mouse(){
    
    setSize(500,400);
    
    setLayout(new FlowLayout());
    
    
    Button b = new Button("Close");
    Button b1 = new Button("Print");
    add(b1);
    add(b);
    
    
    b.addMouseListener(new MouseAdapter(){
    
    @Override
    public void mouseReleased(MouseEvent e) {
        System.exit(0);
    }

    });
    

       b1.addMouseListener(new MouseAdapter(){
        
        
    @Override
    public void mouseReleased(MouseEvent e) {
        JOptionPane.showMessageDialog(null, "Should print!");
        
        
    }
    });
   
    }

public static void main(String[] args) {
    
    new Mouse().setVisible(true);
  
    }


}


