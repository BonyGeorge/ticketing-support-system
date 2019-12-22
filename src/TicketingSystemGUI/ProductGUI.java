
package TicketingSystemGUI;

import HumanGUI.SupplierGUI;
import Ticket.Ticket;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.*;
import ticketingsystem.Product;
import static ticketingsystem.TicketingSystem.p;


public class ProductGUI extends JFrame{
           ImageIcon background_image =new ImageIcon();

    
    JFrame Frame4= new JFrame();
    JFrame Frame6= new JFrame();
     JFrame Frame5= new JFrame();
    JLabel ProductID=new JLabel("Product ID: ");
     JTextField PID=new JTextField("");
     JLabel ProductType=new JLabel("Product Name:  ");
     JTextField PType=new JTextField("");
     JLabel ProductPrice=new JLabel("Product Price:  ");
     JTextField PPrice=new JTextField("");
     JButton Submit =new JButton("Add");
     JButton Add =new JButton("Add Product");
     JButton View =new JButton("View Products");
    JButton logout =new JButton("Logout");
    JButton Home = new JButton("Home Screen");
     private JLabel idTagLabel;
    private JLabel nameTagLabel;
    private JLabel levelTagLabel;
    int xc = 50;
    int y_cor = 80;     

     
    private void AddProducts(){
         Frame4.setTitle("Add Product");
        Frame4.setLayout(null);     
        Frame4.setSize(600,600);
        Frame4.setVisible(true);
        Frame4.setResizable(false);
        Frame4.getContentPane().add(ProductID);
        ProductID.setForeground(Color.WHITE);
        ProductID.setBounds(10,0,110,20);
        PID.setBounds(90,0,110,20);
        Frame4.getContentPane().add(PID);
        Frame4.getContentPane().add(ProductType);
        ProductType.setForeground(Color.WHITE);
        ProductType.setBounds(10,30,110,20);
        PType.setBounds(90,30,110,20);
        Frame4.getContentPane().add(PType);
        Frame4.getContentPane().add(ProductPrice);
        ProductPrice.setForeground(Color.WHITE);
        ProductPrice.setBounds(10,60,110,20);
        PPrice.setBounds(90,60,110,20);
        Frame4.getContentPane().add(PPrice);
        Frame4.getContentPane().add(Submit);
        Submit.setBounds(100,240,75,20);
        Frame4.getContentPane().add(Home);
        Home.setBounds(100,240,300,20);
     Frame4.setDefaultCloseOperation(EXIT_ON_CLOSE);
     background_image=new ImageIcon("C:\\Users\\Mohamed\\Desktop\\tst.jpg");
       Image img=background_image.getImage();
       Image temp_img=img.getScaledInstance(600,600, Image.SCALE_SMOOTH);

       background_image=new ImageIcon(temp_img);
       JLabel background=new JLabel("",background_image,JLabel.CENTER);
       background.setBounds(0,0,600,600);
      Frame4.add(background);
         
         
}
    public void ViewProducts(){
         Frame5.setTitle("Products");
        Frame5.setLayout(null);     
        Frame5.setSize(600,600);
        Frame5.setVisible(true);
        Frame5.setResizable(false);
       idTagLabel = new JLabel("Product Name");
            nameTagLabel = new JLabel("Product ID");
            levelTagLabel = new JLabel("Product Price");
           

            idTagLabel.setBounds(50, 80 - 50, 100, 30);
            nameTagLabel.setBounds(50 + 150, 80 - 50, 100, 30);
            levelTagLabel.setBounds(50 + 250, 80 - 50, 100, 30);
            

            idTagLabel.setForeground(Color.WHITE);
            nameTagLabel.setForeground(Color.WHITE);
            levelTagLabel.setForeground(Color.WHITE);
            

            Frame5.getContentPane().add(idTagLabel);
            Frame5.getContentPane().add(nameTagLabel);
            Frame5.getContentPane().add(levelTagLabel);
             Ticket x = new Ticket();
               try {
                   x.ReadingFile();
               } catch (IOException ex) {
                   Logger.getLogger(ProductGUI.class.getName()).log(Level.SEVERE, null, ex);
               }
             
                
             
                for (int i = 0; i < p.size(); i++) { 
                JLabel pptype = new JLabel(p.get(i).getProductType());
                pptype.setBounds(xc, y_cor, 100, 30);
                pptype.setForeground(Color.WHITE);
                Frame5.getContentPane().add(pptype);
                

                JLabel ppid = new JLabel(Integer.toString(p.get(i).getProductID()));
                ppid.setBounds(xc + 150, y_cor, 100, 30);
                ppid.setForeground(Color.WHITE);
                Frame5.getContentPane().add(ppid);
                

                JLabel ppprice = new JLabel(Integer.toString(p.get(i).getPrice()));
                ppprice.setBounds(xc + 250, y_cor, 100, 30);
                ppprice.setForeground(Color.WHITE);
                Frame5.getContentPane().add(ppprice);
               
y_cor += 40;

            }
            

            Frame5.getContentPane().add(Home);
        Home.setBounds(100,500,300,20);
            Frame5.setDefaultCloseOperation(EXIT_ON_CLOSE);
            background_image=new ImageIcon("C:\\Users\\Mohamed\\Desktop\\tst.jpg");
       Image img=background_image.getImage();
       Image temp_img=img.getScaledInstance(600,600, Image.SCALE_SMOOTH);

       background_image=new ImageIcon(temp_img);
       JLabel background=new JLabel("",background_image,JLabel.CENTER);
       background.setBounds(0,0,600,600);
      Frame5.add(background);
    }
     public ProductGUI() {

        Frame6.setTitle("Operations");
        Frame6.setLayout(null);
        Frame6.setSize(600, 600);
        Frame6.setResizable(false);
        Frame6.setVisible(true);
        Frame6.add(Add);
        Add.setBounds(100, 20, 300, 30);
        Frame6.add(View);
        View.setBounds(100, 80, 300, 30);
        Frame6.add(logout);
        logout.setBounds(100, 140, 300, 30);
        Frame6.setDefaultCloseOperation(EXIT_ON_CLOSE);
        Submit.addActionListener(new ButtonWatcher1());
        Add.addActionListener(new ButtonWatcher1());
        View.addActionListener(new ButtonWatcher1());
        logout.addActionListener(new ButtonWatcher1());
        Home.addActionListener(new ButtonWatcher1());
        background_image=new ImageIcon("C:\\Users\\Mohamed\\Desktop\\tst.jpg");
       Image img=background_image.getImage();
       Image temp_img=img.getScaledInstance(600,600, Image.SCALE_SMOOTH);

       background_image=new ImageIcon(temp_img);
       JLabel background=new JLabel("",background_image,JLabel.CENTER);
       background.setBounds(0,0,600,600);
      Frame6.add(background);
     }
 private class ButtonWatcher1 implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            Object buttonPressed=ae.getSource();
             Product x = new Product();
            if(buttonPressed.equals(Submit)){
                  if(!PID.getText().isEmpty() && PID.getText().length()<=1  ){
                    JOptionPane.showMessageDialog(null, "Invalid ID , Please enter another one" , "alert" , JOptionPane.ERROR_MESSAGE); 
                }  
                       else if(!PPrice.getText().isEmpty() && PPrice.getText().length()<=2 ){
                    JOptionPane.showMessageDialog(null, "Invalid Price , Please enter another one" , "alert" , JOptionPane.ERROR_MESSAGE); 
                }
                       else if(!PType.getText().isEmpty() && PType.getText().length()<=2 ){
                    JOptionPane.showMessageDialog(null, "Invalid Type , Please enter another one" , "alert" , JOptionPane.ERROR_MESSAGE); 
                }
                       else{
               
                 x.setProductID(Integer.parseInt(PID.getText()));
        x.setPrice(Integer.parseInt(PPrice.getText()));
        x.setProductType(PType.getText());
                
                
                try {
                    x.ReadingFile();
                } catch (IOException ex) {
                    Logger.getLogger(SupplierGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
        p.add(x);
                try {
                    x.WritingFile();
                } catch (IOException ex) {
                    Logger.getLogger(ProductGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
                    
                JOptionPane.showMessageDialog(null, "Product Added Successfuly");
                 Frame4.setVisible(false);
                 Frame6.setVisible(true);
            }
            }
            if(buttonPressed.equals(Add)){
                Frame6.setVisible(false);
                Frame4.setVisible(true);
                AddProducts();
            }
            if(buttonPressed.equals(View)){
                Frame6.setVisible(false);
               ViewProducts();
            }
            if (buttonPressed.equals(Home)){
                dispose();
            ProductGUI xx = new ProductGUI();
            } 
            else if (buttonPressed.equals(logout)){
                dispose();
                Frame6.setVisible(false);
            SupplierGUI s = new SupplierGUI();
            } 
}}}
