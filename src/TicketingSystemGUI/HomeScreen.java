package TicketingSystemGUI;

import Human.Adminstrator;
import HumanGUI.AdminstratorGUI;
import Human.Supplier;
import HumanGUI.SupplierGUI;
import Human.User;
import HumanGUI.UserGUI;
import Human.Worker;
import HumanGUI.WorkerGUI;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;
import static ticketingsystem.TicketingSystem.AdminHM;
import static ticketingsystem.TicketingSystem.SupplierHM;
import static ticketingsystem.TicketingSystem.UserHM;
import static ticketingsystem.TicketingSystem.WorkerHM;
import static ticketingsystem.TicketingSystem.s;
import static ticketingsystem.TicketingSystem.w;
import static ticketingsystem.TicketingSystem.x;
import static ticketingsystem.TicketingSystem.y;


public class HomeScreen extends JFrame implements Runnable{
    ImageIcon background_image =new ImageIcon();
    JButton Admin = new JButton("Adminstrator ");
    JButton User = new JButton("User ");
    JButton Supplier = new JButton("Supplier");
    JButton Worker = new JButton("Worker");
    JLabel Time=new JLabel();
    static JFrame  Frame = new JFrame();
    JButton PlayMusic=new JButton("Play");
    JButton Pause=new JButton("Pause");
    int z=0,c=100;
    
   
    
    public HomeScreen(){
    Frame.setTitle("Ticketing Support System");
    
     Frame.setLayout(null);
        Frame.setSize(600, 600);
        Frame.setVisible(true);
        Frame.add(Admin);
        Admin.setBounds(150, 140, 300, 30);
        Frame.add(User);
        User.setBounds(150, 200, 300, 30);
        /*Frame.add(Worker);
        Worker.setBounds(150, 260, 300, 30);*/
        PlayMusic.setBounds(150, 380, 150, 30);
        Frame.add(PlayMusic);
       /* Pause.setBounds(300, 380, 150, 30);
        Frame.add(Pause);*/
        Frame.add(Supplier);
        Supplier.setBounds(150, 320, 300, 30);
        Frame.add(Time);
        Time.setBounds(20,20,200,20);
        Admin.addActionListener(new ButtonWatcher());
        PlayMusic.addActionListener(new ButtonWatcher());
        Pause.addActionListener(new ButtonWatcher());
        User.addActionListener(new ButtonWatcher());
        Worker.addActionListener(new ButtonWatcher());
        Supplier.addActionListener(new ButtonWatcher());
        
        background_image=new ImageIcon("C:\\Users\\Mohamed\\Desktop\\customer.png");
       Image img=background_image.getImage();
       Image temp_img=img.getScaledInstance(600,600, Image.SCALE_SMOOTH);
       
       background_image=new ImageIcon(temp_img);
       JLabel background=new JLabel("",background_image,JLabel.CENTER);
       background.setBounds(0,0,600,600);
      Frame.add(background);

      repaint();
      Frame.setResizable(false);
    Frame.addWindowListener(new close());
    }
    
        MusicThread M=new MusicThread();
    
    
        @Override
        public void paint(Graphics g){
        
  
        super.paint(g);
        Graphics2D g2d=(Graphics2D) g;
        Font f=new Font("Areial",Font.BOLD+Font.ITALIC ,50 );
        g2d.setFont(f);
        g2d.setColor(Color.MAGENTA);
        g2d.drawString("TicketingSupportSystem",z,c);
        //setSize(1000,100);
            setBounds(0,0,1000,300);
        try{
        Thread.sleep(100);
        
        }catch(InterruptedException ex){
        }
        z+=10;
        if(z>this.getWidth()){
            z=0; 
        }
           repaint();
        } 
        
    @Override
    public void run(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss ");
        while(true){
        LocalDateTime local = LocalDateTime.now();
        Time.setText(dtf.format(local));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(UserGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
     private class ButtonWatcher implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            Object buttonPressed = ae.getSource();
            if (buttonPressed.equals(Admin)) {
                Adminstrator  Admin = new Adminstrator();
                try {
                    Admin.ReadingFile();
                } catch (IOException ex) {
                    Logger.getLogger(HomeScreen.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(HomeScreen.class.getName()).log(Level.SEVERE, null, ex);
                }
           for (int i=0;i<x.size();i++){
                AdminHM.put(x.get(i).getUserName(),x.get(i));
                }
           Frame.setVisible(false);
             AdminstratorGUI f = new AdminstratorGUI();
             
            }
         if(buttonPressed.equals(PlayMusic)){
            M.start();
           }  
         if(buttonPressed.equals(Pause)){
            M.stop();
           }  
        if (buttonPressed.equals(User)) {
         User user = new User();
                try {
                    user.ReadingFile();
                } catch (IOException ex) {
                    Logger.getLogger(HomeScreen.class.getName()).log(Level.SEVERE, null, ex);
                }
           for (int i=0;i<y.size();i++){
                UserHM.put(y.get(i).getUserName(),y.get(i));
                }
                      Frame.setVisible(false);
           UserGUI b = new UserGUI();
           
        }
        if (buttonPressed.equals(Worker)) {
        
                Worker  worker = new Worker();
                try {
                    worker.ReadingFile();
                } catch (IOException ex) {
                    Logger.getLogger(HomeScreen.class.getName()).log(Level.SEVERE, null, ex);
                }
            
           for (int i=0;i<w.size();i++){
                WorkerHM.put(w.get(i).getUserName(),w.get(i));
                } 
           Frame.setVisible(false);
            WorkerGUI g = new WorkerGUI();
        }
        if (buttonPressed.equals(Supplier)) {
             Supplier supplier = new Supplier();
                try {
                    supplier.ReadingFile();
                } catch (IOException ex) {
                    Logger.getLogger(HomeScreen.class.getName()).log(Level.SEVERE, null, ex);
                }
            for (int i=0;i<s.size();i++){
                SupplierHM.put(s.get(i).getUserName(),s.get(i));
                }
            Frame.setVisible(false);
            SupplierGUI d = new SupplierGUI();
            
        }
        }}
     
     public class close extends WindowAdapter{
         @Override
         public void windowClosing (WindowEvent e){
                 System.exit(0);
         }
     }
    public class MusicThread extends Thread{

        @Override
        public void run() {
            
        InputStream music;
        try
        {
            music=new FileInputStream(new File("C:\\Users\\Mohamed\\Documents\\01 Bellyache.wav"));
            AudioStream audios=new AudioStream(music);
            AudioPlayer.player.start(audios);
           
        }
        catch(Exception e)
                {
                    JOptionPane.showMessageDialog(null,"alert","error cannot find path",JOptionPane.ERROR_MESSAGE);
                }
            
    
        }
    
    }
}
