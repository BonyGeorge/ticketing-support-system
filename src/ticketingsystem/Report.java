package ticketingsystem;

import Ticket.Ticket;
import static java.awt.Color.BLACK;
import static java.awt.Color.BLUE;
import static java.awt.Color.GREEN;
import static java.awt.Color.ORANGE;
import static java.awt.Color.RED;
import static java.awt.Color.YELLOW;
import java.awt.Graphics;
import java.awt.HeadlessException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JLabel;
import static ticketingsystem.TicketingSystem.z;
public class Report extends JFrame {

    
   

    public Report() throws HeadlessException {
        this.setSize(600,600);
        this.setResizable(false);
        this.setTitle("Reports");
        this.setLayout(null);
        repaint();
        
    }
    @Override
     public void paint(Graphics g){
         
        Ticket TEST=new Ticket();
        
        int CT_counter=0;
        int OT_counter=0;
        int PT_counter=0;
        int NS_counter=0;
        float CT_ratio;
        float OT_ratio;
        float PT_ratio;
        float NS_ratio;
        try {
            TEST.ReadingFile();
        } catch (IOException ex) {
            Logger.getLogger(Report.class.getName()).log(Level.SEVERE, null, ex);
        }
        for (int i=0;i<z.size();i++){
           if("closed".equals(z.get(i).getTicketStatus()))
               CT_counter=CT_counter+1;
           else if("open".equals(z.get(i).getTicketStatus()))
               OT_counter=OT_counter+1;
           else if("pending".equals(z.get(i).getTicketStatus()))
               PT_counter=PT_counter+1;
           else if(z.get(i).getTicketStatus()==null)
               NS_counter=NS_counter+1;
    }
        try {
            TEST.ReadingFile();
        } catch (IOException ex) {
            Logger.getLogger(Report.class.getName()).log(Level.SEVERE, null, ex);
        }
       CT_ratio=(float)CT_counter/(float)z.size();
       PT_ratio=(float)PT_counter/(float)z.size();
       OT_ratio=(float)OT_counter/(float)z.size();
       NS_ratio=(float)NS_counter/(float)z.size();
       JLabel Closed=new  JLabel(Integer.toString(CT_counter));
       JLabel Pending=new  JLabel(Integer.toString(PT_counter));
       JLabel Open=new  JLabel(Integer.toString(OT_counter));
       JLabel NonChecked=new  JLabel(Integer.toString(NS_counter));
       JLabel LClosed=new  JLabel("Closed");
       JLabel LPending=new  JLabel("Pending");
       JLabel LOpen=new  JLabel("Open");
       JLabel LNonChecked=new  JLabel("Not Checked");
       JLabel Color=new JLabel("Color");
       this.add(Color);
       Color.setBounds(240,120,35,10);
       this.add(LClosed);
       LClosed.setBounds(30,170,43,10);
       this.add(LPending);
       LPending.setBounds(30,220,50,15);
       this.add(LOpen);
       LOpen.setBounds(30,270,35,15);
       this.add(LNonChecked);
       LNonChecked.setBounds(30,320,75,10);
       JLabel Status=new JLabel("Status");
       this.add(Status);
       Status.setBounds(30,120,40,10);
       JLabel Number=new JLabel("Number");
       this.add(Number);
       Number.setBounds(125,120,45,10);
       this.add(Closed);
       Closed.setBounds(140,170,15,10);
       this.add(Pending);
       Pending.setBounds(140,220,15,10);
       this.add(Open);
       Open.setBounds(140,270,15,10);
       this.add(NonChecked);
       NonChecked.setBounds(140,320,15,10);
            g.setColor(BLUE);
            g.fillArc(330,170,250,250,0,(int)(CT_ratio*360));
            g.setColor(RED);
            g.fillArc(330,170,250,250,(int)(CT_ratio*360),(int)(OT_ratio*360));
            g.setColor(GREEN);
            g.fillArc(330,170,250,250,(((int)(CT_ratio*360))+((int)(OT_ratio*360))),(int)(PT_ratio*360));
            g.setColor(YELLOW);  
            g.fillArc(330,170,250,250,(((int)(CT_ratio*360))+((int)(OT_ratio*360))+((int)(PT_ratio*360))),(int)(NS_ratio*360));
            g.setColor(BLUE);
            g.fillOval(245,200,30,30);
            g.setColor(GREEN);
            g.fillOval(245,250,30,30);
            g.setColor(RED);
            g.fillOval(245,300,30,30);
            g.setColor(YELLOW);
            g.fillOval(245,350,30,30);
       
}
}
