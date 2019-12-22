package TicketingSystemGUI;

import HumanGUI.UserGUI;
import TicketpGUI.TicketGUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import ticketingsystem.Rating;
import static ticketingsystem.TicketingSystem.r;

public  class RatingGUI extends JFrame{
    JFrame Frame = new JFrame();
     JComboBox ServiceRating =new JComboBox();
     JLabel rating =new JLabel(" Rating ");
     JButton save = new JButton("Submit");
     JLabel desc = new JLabel("Additional comments ");
     JTextField des = new JTextField("");
     
     public RatingGUI(){
         Frame.setTitle("Rate our Service");
     Frame.setLayout(null);
        Frame.setSize(600, 600);
        Frame.setVisible(true);
        Frame.setResizable(false);
     ServiceRating.addItem(1);
ServiceRating.addItem(2);
ServiceRating.addItem(3);
ServiceRating.addItem(4);
ServiceRating.addItem(5);
Frame.add(rating);
 Frame.add(ServiceRating);
 rating.setBounds(50, 25, 110, 30);
 ServiceRating.setBounds(200,25,110,30);
 Frame.add(desc);
        desc.setBounds(50,100,150,30);
        des.setBounds(200,100,110,30);
        Frame.add(des);
 Frame.add(save);
 save.setBounds(200, 300, 110, 30);
  Frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
  
         save.addActionListener(new ButtonWatcher());
     }
     private class ButtonWatcher implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            Object buttonPressed=ae.getSource();
            if(buttonPressed.equals(save)){
                

                Rating x = new Rating();
                x.setRating(ServiceRating.getSelectedIndex());
                x.setDescription(des.getText());
                try {
                    x.ReadingFile();
                } catch (IOException ex) {
                    Logger.getLogger(RatingGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
                r.add(x);
                try {
                    x.WritingFile();
                } catch (IOException ex) {
                    Logger.getLogger(RatingGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
               JOptionPane.showMessageDialog(null, "Thanks for your time");
               Frame.setVisible(false);
                TicketGUI z = new TicketGUI();
            }}
        }
    
}
