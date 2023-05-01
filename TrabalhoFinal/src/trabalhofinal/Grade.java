package trabalhofinal;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Grade extends JFrame{
    
    
    Grade(){
        JFrame frame = new JFrame();
        frame.setResizable(false);
        frame.setSize(450, 600);
        frame.getContentPane().setBackground(new Color(0xC4A484));
        
        JPanel grid = new JPanel();
        grid.setBounds(32, 50, 360, 450);
        grid.setLayout(new GridLayout(5, 5));
        
        for (int i = 1; i < 26; i++){
            JButton button = new JButton();
            if (i == 13){
                button.setBackground(Color.BLACK);
                grid.add(button);
            }
            else{
                button.setBackground(new Color(0x90EE90));  
                grid.add(button);
            }
        }
        
        frame.setLayout(null);
        frame.setVisible(true);
        frame.add(grid);
    }
}
