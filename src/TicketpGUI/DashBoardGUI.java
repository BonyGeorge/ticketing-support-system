package TicketpGUI;

import HumanGUI.AdminstratorGUI;
import Ticket.Ticket;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import static ticketingsystem.TicketingSystem.z;

public class DashBoardGUI extends JFrame {
    JFrame Frame =new JFrame();
    JLabel TotalTickets=new JLabel(" Total Tickets ");
    JLabel Openedtickets=new JLabel(" Opened tickets ");
    JLabel ClosedTicket=new JLabel(" Closed Ticket ");
    JLabel SolvedTicket=new JLabel(" Pending Ticket ");
    JLabel tt;
    JLabel ot;
    JLabel ct;
    JLabel pt;
    JButton back = new JButton("Back");
    
public DashBoardGUI (){
    Ticket h=new Ticket();
     int CT_counter=0;
        int OT_counter=0;
        int PT_counter=0;
        int TT_counter=0;
        try {
            h.ReadingFile();
        } catch (IOException ex) {
            Logger.getLogger(DashBoardGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
         for (int i=0;i<z.size();i++){
           if("closed".equals(z.get(i).getTicketStatus()))
               
               CT_counter=CT_counter+1;
           else if("open".equals(z.get(i).getTicketStatus()))
               OT_counter=OT_counter+1;
           else if("pending".equals(z.get(i).getTicketStatus()))
               PT_counter=PT_counter+1;
           else if("pending".equals(z.get(i).getTicketStatus())&&"open".equals(z.get(i).getTicketStatus())&&"closed".equals(z.get(i).getTicketStatus()))
               TT_counter=TT_counter+1;
    }
    tt=new JLabel(Integer.toString(TT_counter));
    ot=new JLabel(Integer.toString(OT_counter));
    ct=new JLabel(Integer.toString(CT_counter));
    pt=new JLabel(Integer.toString(PT_counter));
    
    Frame.setSize(600,600);
    Frame.setTitle("DashBoard");
    Frame.setVisible(true);
    Frame.setResizable(false);
    Frame.setLayout(null);
    
    Frame.getContentPane().add(TotalTickets);
    Frame.getContentPane().add(Openedtickets);
    Frame.getContentPane().add(ClosedTicket);
    Frame.getContentPane().add(SolvedTicket);
    Frame.getContentPane().add(ct);
    Frame.getContentPane().add(ot);
    Frame.getContentPane().add(pt);
    Frame.getContentPane().add(tt);
    Frame.add(back);
    Frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
   
        TotalTickets.setBounds(50, 50, 300, 30);
        tt.setBounds(80, 100, 300, 30);
         Openedtickets.setBounds(300, 50, 300, 30);
         ot.setBounds(330, 100, 300, 30);
         ClosedTicket.setBounds(50, 250, 300, 30);
         ct.setBounds(80, 300, 300, 30);
         SolvedTicket.setBounds(300, 250, 300, 30);
         pt.setBounds(330, 300, 300, 30);
         back.setBounds(300, 400, 300, 30);
    back.addActionListener(new ButtonWatcher1());
   
   
    
     }
private class ButtonWatcher1 implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            Object buttonPressed=ae.getSource();
             
            if(buttonPressed.equals(back)){
                AdminstratorGUI z = new AdminstratorGUI();
                z.setVisible(false);
                z.AdminApp(z.getName());
                Frame.setVisible(false);
                
            }}}}
  


