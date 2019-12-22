package TicketpGUI;

import HumanGUI.UserGUI;
import Network.Clients;
import Network.Server;
import Ticket.Ticket;
import TicketingSystemGUI.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import static ticketingsystem.TicketingSystem.z;

public class TicketGUI extends JFrame {
       ImageIcon background_image =new ImageIcon();


    JFrame Frame4 = new JFrame();
    JFrame Frame6 = new JFrame();
    JFrame Frame5 = new JFrame();
    JFrame Frame7 = new JFrame();
    JFrame Frame8 = new JFrame();
    JFrame Frame9 = new JFrame();
    JFrame Frame = new JFrame();
    JFrame Frame2 = new JFrame();
    JTextField TicketID = new JTextField("");
    JLabel ID = new JLabel("Ticket ID:  ");
    JTextArea TicketDescription = new JTextArea("");
    JLabel Descr = new JLabel("Description:  ");
    JTextField newdescription = new JTextField("");
    JComboBox Priority = new JComboBox(new String[]{"Low", "Moderate", "Critical"});
    JLabel pri = new JLabel("Select Priority :");
    JButton Submit = new JButton("Submit");
    JButton Submit1 = new JButton("Search");
    JButton Submit2 = new JButton("Delete");
    JButton Submit3 = new JButton("Edit");
    JButton Submit5 = new JButton("Search");
    JButton Search = new JButton("Search for a ticket ");
    JButton addTicket = new JButton("Add a new ticket ");
    JButton delete = new JButton("Delete a recent Ticket");
    JButton message = new JButton("Send a message");
    JButton Faq = new JButton("View FAQs");
    JButton rating = new JButton("Rate our service");
    JTextArea ta = new JTextArea(4, 5);
    JLabel msg = new JLabel("Message : ");
    JButton Submit8 = new JButton("Send message");
    JLabel id = new JLabel("Ticket ID :");
    JLabel des = new JLabel("Description :");
    JButton Home = new JButton("Home Screen");
    JButton logout = new JButton("Logout");

     private void SearchedTicket(){
     Frame2.setTitle("Ticket");
     Frame2.setLayout(null);
     Frame2.setResizable(false);
        Frame2.setSize(600, 600);
        Frame2.setVisible(true);
        Frame2.getContentPane().add(id);
        id.setBounds(20, 0, 110, 30);
         Frame2.getContentPane().add(des);
        des.setBounds(20, 50, 110, 30);
                for (int i = 0; i < z.size(); i++) {
                if (z.get(i).getTicketID() == Integer.parseInt(TicketID.getText())) {
                JLabel idLabel = new JLabel(Integer.toString(z.get(i).getTicketID()));
                idLabel.setBounds(100, 0, 150, 30);
                Frame2.getContentPane().add(idLabel);

                JLabel nameLabel = new JLabel(z.get(i).getDescription());
                nameLabel.setBounds(100, 50, 250, 30);
                Frame2.getContentPane().add(nameLabel);
               
                }
                
     }
                Frame2.getContentPane().add(Home);
        Home.setBounds(150, 200, 175, 30);
        background_image=new ImageIcon("C:\\Users\\Mohamed\\Desktop\\tst.jpg");
       Image img=background_image.getImage();
       Image temp_img=img.getScaledInstance(600,600, Image.SCALE_SMOOTH);

       background_image=new ImageIcon(temp_img);
       JLabel background=new JLabel("",background_image,JLabel.CENTER);
       background.setBounds(0,0,600,600);
      Frame2.add(background);
           Frame2.setDefaultCloseOperation(EXIT_ON_CLOSE);
     }
    
    private void addTicket() {
        Frame4.setTitle("Ticket");
        Frame4.setLayout(null);
        Frame4.setSize(600, 600);
        Frame4.setResizable(false);
        Frame4.setVisible(true);
        Frame4.getContentPane().add(ID);
        ID.setBounds(10, 0, 110, 20);
        TicketID.setBounds(80, 0, 110, 20);
        Frame4.getContentPane().add(TicketID);
        Frame4.getContentPane().add(Descr);
        Descr.setBounds(10, 50, 110, 20);
        TicketDescription.setBounds(80, 50, 110, 20);
        Frame4.getContentPane().add(TicketDescription);
        Frame4.getContentPane().add(pri);
        pri.setBounds(10, 100, 110, 20);
        Priority.setBounds(100, 100, 110, 20);
        Frame4.getContentPane().add(Priority);

        Frame4.getContentPane().add(Submit);
        Submit.setBounds(150, 150, 75, 20);
        Frame4.getContentPane().add(Home);
        Home.setBounds(150, 200, 175, 30);
        Frame4.setDefaultCloseOperation(EXIT_ON_CLOSE);
        background_image=new ImageIcon("C:\\Users\\Mohamed\\Desktop\\tst.jpg");
       Image img=background_image.getImage();
       Image temp_img=img.getScaledInstance(600,600, Image.SCALE_SMOOTH);

       background_image=new ImageIcon(temp_img);
       JLabel background=new JLabel("",background_image,JLabel.CENTER);
       background.setBounds(0,0,600,600);
      Frame4.add(background);
    }

    private void SearchTicket() {
        Frame5.setTitle("Search Ticket");
        Frame5.setLayout(null);
        Frame5.setSize(600, 600);
        Frame5.setResizable(false);
        Frame5.setVisible(true);
        Frame5.getContentPane().add(ID);
        ID.setBounds(10, 0, 110, 20);
        TicketID.setBounds(80, 0, 110, 20);
        Frame5.getContentPane().add(TicketID);
        Frame5.getContentPane().add(Submit1);
        Submit1.setBounds(150, 150, 75, 20);
        Frame5.getContentPane().add(Home);
        Home.setBounds(150, 200, 175, 30);
        Frame5.setDefaultCloseOperation(EXIT_ON_CLOSE);
        background_image=new ImageIcon("C:\\Users\\Mohamed\\Desktop\\tst.jpg");
       Image img=background_image.getImage();
       Image temp_img=img.getScaledInstance(600,600, Image.SCALE_SMOOTH);

       background_image=new ImageIcon(temp_img);
       JLabel background=new JLabel("",background_image,JLabel.CENTER);
       background.setBounds(0,0,600,600);
      Frame5.add(background);

    }

    private void deleteTicket() {
        Frame7.setTitle("Delete Ticket");
        Frame7.setLayout(null);
        Frame7.setResizable(false);
        Frame7.setSize(600, 600);
        Frame7.setVisible(true);
        Frame7.getContentPane().add(ID);
        ID.setBounds(10, 0, 110, 20);
        TicketID.setBounds(80, 0, 110, 20);
        Frame7.getContentPane().add(TicketID);
        Frame7.getContentPane().add(Submit2);
        Submit2.setBounds(150, 150, 75, 20);
        Frame7.getContentPane().add(Home);
        Home.setBounds(150, 200, 175, 30);
        Frame7.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
       
         background_image=new ImageIcon("C:\\Users\\Mohamed\\Desktop\\tst.jpg");
       Image img=background_image.getImage();
       Image temp_img=img.getScaledInstance(600,600, Image.SCALE_SMOOTH);

       background_image=new ImageIcon(temp_img);
       JLabel background=new JLabel("",background_image,JLabel.CENTER);
       background.setBounds(0,0,600,600);
      Frame7.add(background);
    }



    private void sendmessage() {
        Frame.setTitle("Search Ticket");
        Frame.setLayout(null);
        Frame.setSize(600, 600);
        Frame.setVisible(true);
        Frame.setResizable(false);
        Frame.getContentPane().add(msg);
        msg.setBounds(20, 20, 110, 20);
        ta.setBounds(80, 20, 110, 20);
        Frame.getContentPane().add(ta);
        Frame.getContentPane().add(Submit8);
        Submit8.setBounds(150, 150, 175, 30);
        Frame.getContentPane().add(Home);
        Home.setBounds(150, 200, 175, 30);
        Frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        background_image=new ImageIcon("C:\\Users\\Mohamed\\Desktop\\tst.jpg");
       Image img=background_image.getImage();
       Image temp_img=img.getScaledInstance(600,600, Image.SCALE_SMOOTH);

       background_image=new ImageIcon(temp_img);
       JLabel background=new JLabel("",background_image,JLabel.CENTER);
       background.setBounds(0,0,600,600);
      Frame.add(background);
    }

    public TicketGUI() {

        Frame6.setTitle("Ticket Operations");
        Frame6.setLayout(null);
        Frame6.setSize(600, 600);
        Frame6.setResizable(false);
        Frame6.setVisible(true);
        Frame6.add(addTicket);
        addTicket.setBounds(100, 20, 300, 30);
        Frame6.add(Search);
        Search.setBounds(100, 80, 300, 30);
        Frame6.add(delete);
        delete.setBounds(100, 140, 300, 30);
        Frame6.add(message);
        message.setBounds(100, 200, 300, 30);
        Frame6.add(Faq);
        Faq.setBounds(100, 260, 300, 30);
         Frame6.add(rating);
        rating.setBounds(100, 320, 300, 30);
        Frame6.add(logout);
        logout.setBounds(100, 380, 300, 30);
        background_image=new ImageIcon("C:\\Users\\Mohamed\\Desktop\\tst.jpg");
       Image img=background_image.getImage();
       Image temp_img=img.getScaledInstance(600,600, Image.SCALE_SMOOTH);

       background_image=new ImageIcon(temp_img);
       JLabel background=new JLabel("",background_image,JLabel.CENTER);
       background.setBounds(0,0,600,600);
      Frame6.add(background);

        addTicket.addActionListener(new ButtonWatcher());
        Search.addActionListener(new ButtonWatcher());
        delete.addActionListener(new ButtonWatcher());
        //message.addActionListener(new ButtonWatcher());
        Submit.addActionListener(new ButtonWatcher1());
        Submit1.addActionListener(new ButtonWatcher1());
        Submit2.addActionListener(new ButtonWatcher1());
        Submit3.addActionListener(new ButtonWatcher1());
        Submit8.addActionListener(new ButtonWatcher1());
        Home.addActionListener(new ButtonWatcher1());
        logout.addActionListener(new ButtonWatcher1());
        rating.addActionListener(new ButtonWatcher1());
        Faq.addActionListener(new ButtonWatcher1());
        message.addActionListener(new ButtonWatcher1());
        Frame6.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private class ButtonWatcher implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            Object buttonPressed = ae.getSource();
            if (buttonPressed.equals(addTicket)) {
                Frame4.setVisible(true);
                Frame6.setVisible(false);
                addTicket();

            } else if (buttonPressed.equals(Search)) {
                Frame5.setVisible(true);
                Frame6.setVisible(false);
                SearchTicket();

            } else if (buttonPressed.equals(delete)) {
                Frame7.setVisible(true);
                Frame6.setVisible(false);
                deleteTicket();

            }  /*else if (buttonPressed.equals(message)) {
            Frame6.setVisible(false);
            Frame.setVisible(true);
            sendmessage();
            }*/
           
        }
    }

    private class ButtonWatcher1 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            Object buttonPressed = ae.getSource();
            Ticket m = new Ticket();
            if (buttonPressed.equals(Submit)) {
                // Add Ticket
                if(!TicketID.getText().isEmpty() && TicketID.getText().length()<=0  ){
                    JOptionPane.showMessageDialog(null, "Invalid ID , Please enter another one" , "alert" , JOptionPane.ERROR_MESSAGE); 
                }  
                       else if(!TicketDescription.getText().isEmpty() && TicketDescription.getText().length()<=5  ){
                    JOptionPane.showMessageDialog(null, "Invalid Description , Please enter another one" , "alert" , JOptionPane.ERROR_MESSAGE); 
                }
                       else{

                Ticket c = new Ticket();
                c.setTicketID(Integer.parseInt(TicketID.getText()));
                c.setDescription(TicketDescription.getText());
                
                c.setPriority(Priority.getSelectedIndex());
 
                try {
                    c.ReadingFile();
                } catch (IOException ex) {
                    Logger.getLogger(TicketGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
                z.add(c);
               try {
                    c.WritingFile();
                } catch (IOException ex) {
                    Logger.getLogger(TicketGUI.class.getName()).log(Level.SEVERE, null, ex);
                }

                JOptionPane.showMessageDialog(null, "Your Ticket has been Submitted ");
                Frame4.setVisible(false);
                TicketGUI x = new TicketGUI();
                       }
            }else if (buttonPressed.equals(Home)){
                 Frame6.dispose();
                 Frame.dispose();
                 Frame2.dispose();
                 Frame4.dispose();
                 Frame5.dispose();
                 Frame7.dispose();
                 Frame8.dispose();
                 Frame9.dispose();
            TicketGUI x = new TicketGUI();
            } 
            else if (buttonPressed.equals(logout)){
                dispose();
                Frame6.setVisible(false);
            UserGUI x = new UserGUI();
            } 
            else if (buttonPressed.equals(message)){
                
                try {
                    Server H =new Server();
                    H.setVisible(true);
                    Thread t=new Thread(H);
                    t.start();
                } catch (IOException ex) {
                    Logger.getLogger(TicketGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
               
                try {
                   Clients cl= new Clients("User");
                   cl.setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(TicketGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
        
       
            } 
            else if (buttonPressed.equals(rating)){
                dispose();
                Frame6.setVisible(false);
            RatingGUI z = new RatingGUI();
            } 
            else if (buttonPressed.equals(Faq)){
                dispose();
                Frame6.setVisible(false);
            FAQGUI zz = new FAQGUI();
            
            } 
            else if (buttonPressed.equals(Submit1)) {// search
                
                try {
                    m.ReadingFile();
                } catch (IOException ex) {
                    Logger.getLogger(TicketGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
                Frame5.setVisible(false);
                         SearchedTicket();
                    Frame2.setVisible(true);
                    
                    
                    
                
            } else if (buttonPressed.equals(Submit2)) { // delete
               
                try {
                    m.ReadingFile();
                } catch (IOException ex) {
                    Logger.getLogger(TicketGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
                 for (int i = 0; i < z.size(); i++) {
        if (z.get(i).getTicketID() == Integer.parseInt(TicketID.getText())) {
        z.remove(i);
        }
            try {
                m.WritingFile();
            } catch (IOException ex) {
                Logger.getLogger(TicketGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        }
                                JOptionPane.showMessageDialog(null, "Your Ticket has been Deleted Successfully ");

                Frame7.setVisible(false);
                Frame6.setVisible(true);
            } 

        }
    }
}
