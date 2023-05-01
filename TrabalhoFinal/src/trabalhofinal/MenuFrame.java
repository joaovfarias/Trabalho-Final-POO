
package trabalhofinal;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class MenuFrame extends JFrame{
    
    JButton botao1, botao2;
    
    MenuFrame(){
        
        JLabel menuText = new JLabel("Bem-vindo ao jogo Strategy!");
        menuText.setFont(new Font("comic sans", Font.BOLD, 30));
        menuText.setForeground(Color.black);
        menuText.setBounds(65, 0, 440, 440);
        
        botao1 = new JButton("Posição Aleatória");
        botao2 = new JButton("Definir Posição");
        
        botao1.setBounds(55, 300, 150, 80);
        botao1.setFocusable(false);
        botao1.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    System.out.println("Botao 1");
                    
                }
            }
        );
        botao2.setBounds(325, 300, 150, 80);
        botao2.setFocusable(false);
        botao2.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    // this.dispose();
                    Grade grade = new Grade();
                    grade.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                }
            }
        );
        
        setLayout(null);
        this.setSize(560, 700);
        this.setResizable(false);
        this.getContentPane().setBackground(new Color(232, 243, 230));
        this.getContentPane().add(menuText);
        this.add(botao1);
        this.add(botao2);
        setVisible(true);
    }
}

