package TicketingSystemGUI;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import ticketingsystem.FAQ;
import static ticketingsystem.TicketingSystem.q;


public class FAQGUI extends JFrame {
    JFrame Frame = new JFrame();
      JLabel idTagLabel;
     JLabel nameTagLabel;
     JLabel AnswerTagLabel;
     JButton back = new JButton("Back to tickets operations");
    int xc = 40;
    int y_cor = 80; 
   FAQ h = new FAQ();
    public  FAQGUI(){
        Frame.setTitle("FAQ");
        Frame.setResizable(false);
        Frame.setLayout(null);
        Frame.setSize(600, 600);
        Frame.setVisible(true);
        
        idTagLabel = new JLabel("Question ID");
            nameTagLabel = new JLabel("Question");
            AnswerTagLabel = new JLabel("Answer");
           

            idTagLabel.setBounds(20, 80 - 50, 100, 30);
            nameTagLabel.setBounds(40 + 100, 80 - 50, 200, 30);
            AnswerTagLabel.setBounds(50 + 350, 80 - 50, 200, 30);
            back.setBounds(300, 400, 300, 30);

            idTagLabel.setForeground(Color.red);
            nameTagLabel.setForeground(Color.red);
            AnswerTagLabel.setForeground(Color.red);
            

            Frame.getContentPane().add(idTagLabel);
            Frame.getContentPane().add(nameTagLabel);
            Frame.getContentPane().add(AnswerTagLabel);
            Frame.add(back);
             try {
                h.ReadingFile();
            } catch (IOException ex) {
                Logger.getLogger(FAQGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
                    
            
            for (int i = 0; i < q.size(); i++) {
           
            JLabel pptype = new JLabel(Integer.toString(q.get(i).getID()));
            pptype.setBounds(xc, y_cor, 100, 30);
            Frame.getContentPane().add(pptype);
            
            
            JLabel ppid = new JLabel(q.get(i).getQuestion());
            ppid.setBounds(xc + 100, y_cor, 200, 30);
            Frame.getContentPane().add(ppid);
            
            
            JLabel id = new JLabel(q.get(i).getAnswer());
            id.setBounds(xc + 350, y_cor, 200, 30);
            Frame.getContentPane().add(id);
            
            y_cor += 40;

            }
        Frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        back.addActionListener(new ButtonWatcher1() );

    }
    
    
    private class ButtonWatcher1 implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            Object buttonPressed=ae.getSource();
            if(buttonPressed.equals(back)){
                Frame.setVisible(false);
                HomeScreen z = new HomeScreen();
            }
}}}
