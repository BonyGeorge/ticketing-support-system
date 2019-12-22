package TicketpGUI;

import java.awt.*;
import javax.swing.*;


public class TrackTicketGUI extends JFrame{
     JPanel Frame =new JPanel(new FlowLayout());
    JTextField TicketID=new JTextField("Ticket ID:  ");
    JLabel ID=new JLabel("Ticket ID:  ");
    JButton Search =new JButton("Search");
     
    public TrackTicketGUI(){
         Container cp =getContentPane();
        setLayout(null);
    setSize(500,500);
    setTitle("Track Ticket");
     cp.add(ID);
        ID.setBounds(10,0,110,20);
        TicketID.setBounds(80,0,110,20);
        cp.add(TicketID);
        
        cp.add(Search);
        Search.setBounds(100,100,75,20);
    }
}
