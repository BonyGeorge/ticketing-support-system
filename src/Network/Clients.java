/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Network;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class Clients extends JFrame{
    private JLabel recivedMsg;
    private JTextField tx_Msg=new JTextField("Insert Your mssg");
    InputStream is_s;
    OutputStream os_s;
    Socket Fromserver = null;
    String clientName;
   // String msg = "Connection accepted " + Mysocket.getInetAddress() + ":" + Mysocket.getPort();
    public Clients (String Name) throws IOException
    {
        clientName=Name;
        setSize(300,600);
        setTitle("Client Server" + Name);
        recivedMsg=new JLabel("<html>Recived Message<br>");
        setLayout(null);
        recivedMsg.setBounds(20,20, 200,250);
        add(recivedMsg);
        JButton btnReciveMsg=new JButton("Send");
        btnReciveMsg.setBounds(20,350,100,50);
        tx_Msg.setBounds(btnReciveMsg.getBounds().x,btnReciveMsg.getBounds().y+50,100,50);
        add(tx_Msg);
        btnReciveMsg.addActionListener(new act());
        add(btnReciveMsg);
        
                try {
                    Fromserver = new Socket("127.0.0.1", 6000);
                    is_s=Fromserver.getInputStream();
                    os_s=Fromserver.getOutputStream();
                    updategui t=new updategui();
                    t.start();

                } catch (IOException ex) {
                    
                }
                   
                
    }
     private class act implements  ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) {
            PrintWriter Writing=new PrintWriter(os_s,true);
            Writing.println(clientName+": "+tx_Msg.getText());
        }
        
    }
//     void sendMessage(Chat msg)
//     {
//         os_s.
//     }
    private class updategui extends Thread //inner class by extend Thread
    {
        
        public void run()
        {
            while (true)
            {
                
                BufferedReader Reading=new BufferedReader(new InputStreamReader(is_s));
                String Message = null;
                try {
                    Message = Reading.readLine();
                    if (Message!=null)
                    {
                    recivedMsg.setText(recivedMsg.getText()+"<br>"+Message);
                    System.out.println("Server says " +Message);
                    
                    }
                } catch (IOException ex) {
                    System.out.println(ex);
                }
                
                try {
                    Thread.sleep(100);
                } catch (InterruptedException ex) {
                    
                }
    
         
            }
        }
        }
    }
    

