/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Network;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author ASUS
 */
public class Server extends JFrame implements Runnable{
    private ServerSocket Mysocket;
    private SimpleDateFormat Sss;
    private Socket clientsocket;
    private JTextField OneMessage;
    public  JLabel allMessage;
    //private ServerGUI sg;
    private JLabel WhoSent= new JLabel();
  
    private ArrayList<Socket> Allconnections=new ArrayList<Socket>();
    
    JButton sendMsg=new JButton("Send");
    public Server() throws IOException
    {
        setSize(new Dimension (600,600));
        setTitle("Server Chat");
        Mysocket=new ServerSocket(6000);
        setLayout(null);
        allMessage=new JLabel("<html>All messages here");
        OneMessage=new JTextField("Type Here!");
        allMessage.setBounds(20, 20, 300, 100);
        OneMessage.setBounds(allMessage.getBounds().x,allMessage.getBounds().y+allMessage.getHeight()+10,150,50);
        sendMsg.setBounds(OneMessage.getBounds().x,OneMessage.getBounds().y+OneMessage.getHeight()+10,150,50);
        add(allMessage);
        add(OneMessage);
        add(sendMsg);
        add(WhoSent);
        sendMsg.addActionListener(new act());
          Sss = new SimpleDateFormat("HH:mm:ss");
    
        
    }
    public void run() 
    {
        try
        {
        while (true)
        {
        clientsocket=Mysocket.accept();
        Allconnections.add(clientsocket);
        Threads ct=new Threads(clientsocket,allMessage);
        Thread t1=new Thread(ct);
        t1.start();
        Thread.sleep(1000);
            System.out.println("Is There any Other Connection");
        }
        }
        catch (InterruptedException e)
        {}
        catch (IOException e)
        {}
    }
    private class act implements  ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                
                if (e.getSource().equals(sendMsg))
                {
                    
                start(OneMessage.getText());
                allMessage.setText(allMessage.getText()+"<br>"+OneMessage.getText());
                OneMessage.setText(null);
                
                }
                
            } catch (IOException ex) {
                System.out.println(ex);
            }
        }
        
    }
    public void start(String msg) throws IOException
    {
        for (Socket s: Allconnections)
        {
        OutputStream os=s.getOutputStream();
        PrintWriter pw=new PrintWriter(os,true);
        pw.println(msg);
        }

                
    }
    private synchronized void broadcast(String message) {
		
		String time = Sss.format(new Date());
		String messageLf = time + " " + message + "\n";
		//if(sg == null)
			//System.out.print(messageLf);
		//else
			//sg.appendRoom(mesgssageLf);     // append in the room window
                    
    }
    
}
