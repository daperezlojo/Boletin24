
package boletin24;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class Evento implements ActionListener{
    
    JFrame marco;
    JPanel panel;
    JTextField cantidade;
    JButton boton1,boton2;
    
    public Evento(){
        
        marco = new JFrame("ventana");
        panel = new JPanel();
        cantidade = new JTextField(8);
        boton1 = new JButton("debuxa");
        boton2 = new JButton("limpa");
        
        marco.setSize(600, 600);
        panel.add(cantidade);
        panel.add(boton1);
        panel.add(boton2);
        marco.add(panel);
        boton1.addActionListener(this);
        boton2.addActionListener(this);
        
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
           Graphics g = panel.getGraphics();
            Object boton=e.getSource();
            
            if(boton == boton1){
                g.setColor(Color.RED);
            int circulos=Integer.parseInt(cantidade.getText());
            for(int i=0;i<circulos;i++){
                int x1= (int) (Math.random()*100)+60;
                int y1= (int) (Math.random()*100)+80;
                g.drawOval(x1, y1, 200, 200);
            }
            }else{
                    panel.paint(g);
            
                    
              }
                
       
    }
    
    
}
