/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TicketingSystemGUI;

import static TicketingSystemGUI.HomeScreen.Frame;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WelcomeFrame extends JFrame
{
    JButton b1=new JButton("Start");
    
    int x=0,y=100;
    public WelcomeFrame()
    {
        
        
        b1.setBounds(600,600,100,50);
        add(b1);
        b1.addActionListener(new OnClick());
        setLayout(null);
        setTitle("Welcome Page");
        setSize(new Dimension(5000,5000));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
       // repaint();
        
    }
    
        @Override
        public void paint(Graphics g){
        
  
        super.paint(g);
        Graphics2D g2d=(Graphics2D) g;
        Font f=new Font("Areial",Font.BOLD+Font.ITALIC ,50 );
        g2d.setFont(f);
        g2d.setColor(Color.BLACK);
        g2d.drawString("Welcome to Our TicketingSupportSystem",x,y);
        //setSize(1000,100);
        try{
        Thread.sleep(100);
        
        }catch(InterruptedException ex){
        }
        x+=10;
        if(x>this.getWidth()){
            x=0; 
        }
           repaint();
        }
        
        
     private class OnClick implements ActionListener
     {

        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource().equals(b1))
            {
                setVisible(false);
                HomeScreen home = new HomeScreen();
               
        Thread t=new Thread(home);
        t.start();
      /*
            HomeScreen.Frame.setVisible(true); // El Frame mesh raady yet2akses
            setVisible(false);*/
            }
        }
     
     
     
     }
        
        
    }
    
