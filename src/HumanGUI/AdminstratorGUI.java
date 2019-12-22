package HumanGUI;

import Human.Adminstrator;
import Ticket.Ticket;
import TicketingSystemGUI.FAQGUI;
import TicketingSystemGUI.HomeScreen;
import TicketingSystemGUI.ProductGUI;
import TicketpGUI.DashBoardGUI;
import TicketpGUI.TicketGUI;
import java.awt.Color;
import java.awt.Image;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.text.MaskFormatter;
import ticketingsystem.FAQ;
import ticketingsystem.Product;
import ticketingsystem.Report;
import static ticketingsystem.TicketingSystem.q;
import static ticketingsystem.TicketingSystem.x;
import static ticketingsystem.TicketingSystem.z;


public class AdminstratorGUI extends JFrame{
    
    ImageIcon background_image =new ImageIcon();
    JFrame Frame =new JFrame();
    JFrame Frame2 =new JFrame();
    JFrame Frame3 =new JFrame();
    JFrame Frame5 =new JFrame();
   JTextField Username=new JTextField("");
    JPasswordField Password =new JPasswordField("");
    JLabel Name=new JLabel("Username :  ");
    JLabel Pass=new JLabel("Password : ");
    JButton Submit =new JButton("Submit");
    JButton Submit1 =new JButton("Submit");
    JButton NewUser =new JButton("Sign Up");
    JButton Login =new JButton("login");
    JLabel Name1=new JLabel("First Name  ");
     JTextField FirstName=new JTextField("");
     JLabel MiddleName=new JLabel("Middle Name  ");
     JTextField MiddleNam=new JTextField(" ");
     JLabel LastName=new JLabel("Last Name  ");
     JTextField LastNam=new JTextField("");
     JLabel email=new JLabel("Email  ");
     JTextField email1=new JTextField(" ");
     JLabel telephone=new JLabel("telephone  ");
     JFormattedTextField telep=new JFormattedTextField(" ");
     JLabel salary=new JLabel("Salary  ");
     JTextField ssalary=new JTextField("");
     JLabel Address=new JLabel("Address  ");
     JTextField Adress=new JTextField("");
     JLabel ID=new JLabel("ID  ");
     JTextField ID1=new JTextField(" ");
     JLabel SocialID=new JLabel("Social ID  ");
     JTextField sID=new JTextField(" ");
     JLabel username=new JLabel("username  ");
     JTextField Username1=new JTextField("");
     JLabel password=new JLabel("password  ");
     JPasswordField Password1=new JPasswordField("");
     JLabel Birthdate=new JLabel("birthdate  ");
     JTextField birthdate=new JTextField("");
     JLabel CompName=new JLabel("comp Name  ");
     JTextField companyName=new JTextField("");
     JLabel NoOfEmployees=new JLabel("Employees no.  ");
     JTextField employeess=new JTextField("");
     JButton Home = new JButton("Home Screen");
     JButton Home2 = new JButton("Main Screen");
      JButton NewAdmin ;
     private JLabel QID;
     private JTextField queid;
     private JLabel Q;
     private JTextField ques;
     private JLabel A;
     private JTextField ans;
     private JButton Add;
     private MaskFormatter mask ;
    protected Adminstrator AdminS;
     ///////UNCHECKED TICKETS/////
    private JFrame Frame8=new JFrame();
    private JLabel IDD;
    private JLabel Desc;
    private JLabel IDLBL;
    private JLabel DESCLBL;
    /////////ADMIN APP GUI//////////
    private JFrame Frame4=new JFrame();
    private JButton Handle;
    private JButton logout;
    private JButton View;
    private JButton Dashboard;
    private JButton Update1;
    private JButton Reports ;
    private JButton view ;
    private JButton AFAQ ;
    private JButton Access ;
    private JButton check ;
    private JLabel AD;
    
                  
         /////////Edit Ticket Status///////
    private JFrame Frame6 =new JFrame();
    private JComboBox TicketStatus ;
    private JLabel status  ;
    private JButton UpdateOne ;
    private JLabel TID ;
    private JTextField HID ;
    private JButton SUBMIT ;
    private JFrame Frame7 ;
    private JLabel id ;
    private JLabel des  ;
    private JButton sUbmit ;
    private Ticket zz;
    
       private void SearchedTicket(){
           
                     
     Frame7.setTitle("Ticket");
     Frame7.setLayout(null);
        Frame7.setSize(600, 600);
        Frame7.setVisible(true);
        Frame7.setResizable(false);
        Frame7.add(id);
        id.setBounds(20, 0, 110, 30);
         Frame7.add(des);
         Frame7.add(TicketStatus);
         Frame7.add(sUbmit);
         sUbmit.setBounds(100,150,110,30);
         
         
         TicketStatus.setBounds(200,25,110,30);
        des.setBounds(20, 50, 110, 30);
        try {
            zz.ReadingFile();
        } catch (IOException ex) {
            Logger.getLogger(AdminstratorGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
                for (int i = 0; i < z.size(); i++) {
                if (z.get(i).getTicketID() == Integer.parseInt(HID.getText())) {
                JLabel idLabel = new JLabel(Integer.toString(z.get(i).getTicketID()));
                idLabel.setBounds(100, 0, 150, 30);
                Frame7.add(idLabel);

                JLabel nameLabel = new JLabel(z.get(i).getDescription());
                nameLabel.setBounds(100, 50, 250, 30);
                Frame7.add(nameLabel);
              
               
                }
                
                if(Integer.parseInt(HID.getText())!=z.get(i).getTicketID()) 
                 { if(i==z.size()-1)
             JOptionPane.showMessageDialog(null, "Cannot find your ticket", "alert",JOptionPane.ERROR_MESSAGE);
                 
                 }
     }
               // JOptionPane.showMessageDialog(null, "Cannot find your ticket", "alert",JOptionPane.ERROR_MESSAGE);
         //       Frame2.getContentPane().add(Home);
        Home.setBounds(150, 200, 175, 30);
           Frame7.setDefaultCloseOperation(EXIT_ON_CLOSE);
     }
        public void nonChecked(){
         Frame8.setSize(350,300);
         Frame8.setLayout(null);
         IDD=new JLabel("ID");
         Desc=new JLabel("Description");
         Frame8.add(IDD);
         IDD.setBounds(90,40,20,20);
         Frame8.add(Desc);
         Desc.setBounds(190,40,65,20);
         
         
         Ticket Searching=new Ticket();
        try {
            Searching.ReadingFile();
        } catch (IOException ex) {
            Logger.getLogger(AdminstratorGUI.class.getName()).log(Level.SEVERE, null, ex);
         
        }
        
            
                IDLBL=new JLabel(Integer.toString(z.get(z.size()-1).getTicketID()));
                Frame8.add(IDLBL);
                IDLBL.setBounds(90,100,60,20);
                DESCLBL=new JLabel(z.get(z.size()-1).getDescription());
                Frame8.add(DESCLBL);
                DESCLBL.setBounds(190,100,60,20);
                Home.setBounds(150, 200, 175, 30);
           
     }
    private void Search()
    {      
        Frame6.setTitle("Search to edit status");
      Frame6.setSize(600, 600);
        Frame6.setLayout(null);
        Frame6.setResizable(false);
       
        
        
        Frame6.add(TID);
        TID.setBounds(10, 0, 110, 20);
                Frame6.add(HID);
        HID.setBounds(80, 0, 110, 20);
        Frame6.add(SUBMIT);
        SUBMIT.setBounds(150, 150, 75, 20);
        

        Frame6.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }
    
         public void AdminApp(String AdA)
         {
         
             Frame4.setTitle("Adminstrator App");
             Frame4.setSize(600,600);
             Frame4.setLayout(null);
             Frame4.setResizable(false);
             
      
             AD.setText("Admin: "+AdA);
             Frame4.add(AD);
             AD.setBounds(10,10,300,30);
             AD.setForeground(Color.WHITE);
             Frame4.add(check);
             check.setBounds(100, 60, 300, 30);
             Frame4.add(Access);
             Access.setBounds(100, 120, 300, 30);
             Frame4.add(view);
             view.setBounds(100, 160, 300, 30);
             Frame4.add(Dashboard);
             Dashboard.setBounds(100, 200, 300, 30);
             Frame4.add(Update1);
             Update1.setBounds(100, 240, 300, 30);
             Frame4.add(Reports);
             Reports.setBounds(100, 280, 300, 30);
             Frame4.add(view);
             view.setBounds(100, 320, 300, 30);
             Frame4.add(AFAQ);
             AFAQ.setBounds(100, 360, 300, 30);
             Frame4.add(logout);
             logout.setBounds(100, 400, 300, 30);
             
              background_image=new ImageIcon("C:\\Users\\Mohamed\\Desktop\\tst.jpg");
       Image img=background_image.getImage();
       Image temp_img=img.getScaledInstance(600,600, Image.SCALE_SMOOTH);

       background_image=new ImageIcon(temp_img);
       JLabel background=new JLabel("",background_image,JLabel.CENTER);
       background.setBounds(0,0,600,600);
      Frame4.add(background);
      
             Frame4.setDefaultCloseOperation(EXIT_ON_CLOSE);
         }
     private void SignUp(){
    
     
        Frame3.setTitle("Sign up");
        Frame3.setLayout(null);     
        Frame3.setSize(600,600);
        Frame3.setVisible(true);
        Frame3.setResizable(false);
        Frame3.getContentPane().add(Name1);
        Name1.setBounds(10,0,110,20);
        Name1.setForeground(Color.WHITE);
        FirstName.setBounds(90,0,110,20);
        Frame3.getContentPane().add(FirstName);
        Frame3.getContentPane().add(MiddleName);
        MiddleName.setBounds(10,30,110,20);
        MiddleName.setForeground(Color.WHITE);
        MiddleNam.setBounds(90,30,110,20);
        Frame3.getContentPane().add(MiddleNam);
        Frame3.getContentPane().add(LastName);
        LastName.setBounds(10,60,110,20);
        LastName.setForeground(Color.WHITE);
        LastNam.setBounds(90,60,110,20);
        Frame3.getContentPane().add(LastNam);
        Frame3.getContentPane().add(ID);
        ID.setBounds(10,90,110,20);
        ID.setForeground(Color.WHITE);
        ID1.setBounds(90,90,110,20);
        Frame3.getContentPane().add(ID1);
        Frame3.getContentPane().add(username);
        username.setBounds(10,120,110,20);
        username.setForeground(Color.WHITE);
        Username1.setBounds(90,120,110,20);
        Frame3.getContentPane().add(Username1);
        Frame3.getContentPane().add(password);
        password.setBounds(10,180,110,20);
        password.setForeground(Color.WHITE);
        Password1.setBounds(90,180,110,20);
        Frame3.getContentPane().add(Password1);
        Frame3.getContentPane().add(email);
        email.setBounds(10,210,110,20);
        email.setForeground(Color.WHITE);
        email1.setBounds(90,210,110,20);
        Frame3.getContentPane().add(email1);
        Frame3.getContentPane().add(telephone);
        telephone.setBounds(10,240,110,20);
        telephone.setForeground(Color.WHITE);
        telep.setBounds(90,240,110,20);
        Frame3.getContentPane().add(telep);
        Frame3.getContentPane().add(Address);
        Address.setBounds(10,290,110,20);
        Address.setForeground(Color.WHITE);
        Adress.setBounds(90,290,110,20);
        Frame3.getContentPane().add(Adress);
        Frame3.getContentPane().add(SocialID);
        SocialID.setBounds(10,320,110,20);
        SocialID.setForeground(Color.WHITE);
        sID.setBounds(90,320,110,20);
        Frame3.getContentPane().add(sID);
        Frame3.getContentPane().add(salary);
        salary.setBounds(10,350,110,20);
        salary.setForeground(Color.WHITE);
        ssalary.setBounds(90,350,110,20);
        Frame3.getContentPane().add(ssalary);
         Frame3.getContentPane().add(Submit1);
        Submit1.setBounds(120,380,75,20);
        Frame3.getContentPane().add(Home);
        Home.setBounds(120,460,300,20);
         background_image=new ImageIcon("C:\\Users\\Mohamed\\Desktop\\tst.jpg");
       Image img=background_image.getImage();
       Image temp_img=img.getScaledInstance(600,600, Image.SCALE_SMOOTH);

       background_image=new ImageIcon(temp_img);
       JLabel background=new JLabel("",background_image,JLabel.CENTER);
       background.setBounds(0,0,600,600);
      Frame3.add(background);
      
     Frame3.setDefaultCloseOperation(EXIT_ON_CLOSE);
     }
    
    public AdminstratorGUI() {
        
        try {
             mask = new MaskFormatter("(###)###-####-#");
            mask.setPlaceholderCharacter('_');
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        telep= new JFormattedTextField(mask);
      NewAdmin =new JButton("Sign Up");
      Login =new JButton("login");
      QID=new JLabel("Question ID  ");
      queid=new JTextField("");
      Q=new JLabel("Question  ");
      ques=new JTextField("");
      A=new JLabel("Answer  ");
      ans=new JTextField("");
      Add=new JButton("Add");
      Home = new JButton("Home Screen");
      Home2 = new JButton("Main Screen");
      check = new JButton("Last Added Ticket");
      AdminS=new Adminstrator();
      Handle=new JButton("Handle Urgent Ticket");
      logout=new JButton("logout");
      View=new JButton("View DashBoard");
      Dashboard=new JButton("view DashBoard");
      Update1=new JButton("Update Ticket Status");
      Reports=new JButton("Print Reports");
      view=new JButton("View FAQ");
      AFAQ=new JButton("Add FAQ");
      Access=new JButton("View Assets");
       AD=new JLabel();
        TicketStatus=new JComboBox(new String []{"open","closed","pending"});
      status =new JLabel(" status :");
      UpdateOne =new JButton("Update");
      TID=new JLabel("Ticket ID: ");
      HID=new JTextField("");
      SUBMIT=new JButton("Submit");
      Frame7=new JFrame();
      id=new JLabel("Ticket Id:");
      des = new JLabel("Description:");
      sUbmit=new JButton("Submit");
     zz= new Ticket();
        
        Frame2.setTitle("Admin");
        Frame2.setLayout(null);     
        Frame2.setSize(600,600);
        Frame2.setVisible(true);
        Frame2.setResizable(false);
       Frame2.add(NewAdmin);
        NewAdmin.setBounds(100, 150, 400, 30);
        Frame2.add(Login);
        Login.setBounds(100, 250, 400, 30);
         Frame2.getContentPane().add(Home2);
        Home2.setBounds(200,320,200,20);
         background_image=new ImageIcon("C:\\Users\\Mohamed\\Desktop\\tst.jpg");
       Image img=background_image.getImage();
       Image temp_img=img.getScaledInstance(600,600, Image.SCALE_SMOOTH);

       background_image=new ImageIcon(temp_img);
       JLabel background=new JLabel("",background_image,JLabel.CENTER);
       background.setBounds(0,0,600,600);
      Frame2.add(background);
      
        
        Frame2.setDefaultCloseOperation(EXIT_ON_CLOSE);
         Submit.addActionListener(new ButtonWatcher1());
         NewAdmin.addActionListener(new ButtonWatcher());
        Login.addActionListener(new ButtonWatcher());
        Submit1.addActionListener(new ButtonWatcher1());
        AFAQ.addActionListener(new ButtonWatcher());
         Dashboard.addActionListener(new ButtonWatcher());
        Add.addActionListener(new ButtonWatcher());
        view.addActionListener(new ButtonWatcher());
        Home.addActionListener(new ButtonWatcher());
        Home2.addActionListener(new ButtonWatcher());
        Access.addActionListener(new ButtonWatcher());
        SUBMIT.addActionListener(new ButtonWatcher1()) ;
        Update1.addActionListener(new ButtonWatcher1());
        sUbmit.addActionListener(new ButtonWatcher1());
         Reports.addActionListener(new ButtonWatcher1());
         logout.addActionListener(new ButtonWatcher1());
         check.addActionListener(new ButtonWatcher1());
    }
    private void Login(){
         Frame.setTitle("Login");
        Frame.setLayout(null);     
        Frame.setSize(600,600);
        Frame.setResizable(false);
        Frame.setVisible(true);
        
       Frame.getContentPane().add(Name);
        Name.setBounds(100,50,110,20);
        Name.setForeground(Color.WHITE);
        Username.setBounds(180,50,110,20);
        Frame.getContentPane().add(Username);
        
        Frame.add(Pass);
        Pass.setBounds(100,100,110,20);
        Pass.setForeground(Color.WHITE);
        Password.setBounds(180,100,110,20);
        Frame.getContentPane().add(Password);
        
        Frame.getContentPane().add(Submit);
        Submit.setBounds(100,250,110,20);
        Frame.getContentPane().add(Home);
        Home.setBounds(120,300,300,20);
      Frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
       background_image=new ImageIcon("C:\\Users\\Mohamed\\Desktop\\tst.jpg");
       Image img=background_image.getImage();
       Image temp_img=img.getScaledInstance(600,600, Image.SCALE_SMOOTH);

       background_image=new ImageIcon(temp_img);
       JLabel background=new JLabel("",background_image,JLabel.CENTER);
       background.setBounds(0,0,600,600);
      Frame.add(background);
      
         
     }
    private void AddQuestion(){
         Frame5.setTitle("Add Question");
        Frame5.setLayout(null);     
        Frame5.setSize(600,600);
        Frame5.setVisible(true);
        Frame5.setResizable(false);
        Frame5.getContentPane().add(QID);
        QID.setBounds(10,0,110,20);
        QID.setForeground(Color.WHITE);
        queid.setBounds(90,0,110,20);
        Frame5.getContentPane().add(queid);
        Frame5.getContentPane().add(Q);
        Q.setBounds(10,30,110,20);
        Q.setForeground(Color.WHITE);
        ques.setBounds(90,30,110,20);
        Frame5.getContentPane().add(ques);
        Frame5.getContentPane().add(A);
        A.setBounds(10,60,110,20);
        A.setForeground(Color.WHITE);
        ans.setBounds(90,60,110,20);
        Frame5.getContentPane().add(ans);
        Frame5.getContentPane().add(Add);
        Add.setBounds(100,240,75,20);
        Frame3.getContentPane().add(Home);
        Home.setBounds(120,300,300,20);
         background_image=new ImageIcon("C:\\Users\\Mohamed\\Desktop\\tst.jpg");
       Image img=background_image.getImage();
       Image temp_img=img.getScaledInstance(600,600, Image.SCALE_SMOOTH);

       background_image=new ImageIcon(temp_img);
       JLabel background=new JLabel("",background_image,JLabel.CENTER);
       background.setBounds(0,0,600,600);
      Frame5.add(background);
      Frame5.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }
    private class ButtonWatcher implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
           
             Product ff = new Product();
            Object buttonPressed=ae.getSource();
            if(buttonPressed.equals(NewAdmin)){
                Frame2.setVisible(false);
                Frame3.setVisible(true);
                SignUp();  
                }
                else if (buttonPressed.equals(Login)){
                    Frame2.setVisible(false);
                    Frame.setVisible(true);
                Login();
            }
            else if (buttonPressed.equals(AFAQ)){
                    Frame4.setVisible(false);
                    Frame5.setVisible(true);
                AddQuestion();
            }
            else if (buttonPressed.equals(Dashboard)){
                    Frame4.setVisible(false);
                    DashBoardGUI D = new DashBoardGUI();
                   // D.setVisible(true);
               
            }
             if (buttonPressed.equals(Home)){
                dispose();
            AdminstratorGUI xx = new AdminstratorGUI();
            } 
             if (buttonPressed.equals(Home2)){
                dispose();
                 Frame2.setVisible(false);
            HomeScreen z = new HomeScreen();
            } 
             if (buttonPressed.equals(Access)){
                dispose();
                 Frame4.setVisible(false);
                 
                 
                try {
                    //x.setVisible(false);
                    ff.ReadingFile();
                } catch (IOException ex) {
                    Logger.getLogger(AdminstratorGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
                 ProductGUI x = new ProductGUI();
                 x.ViewProducts();
            } 
            else if (buttonPressed.equals(Add)){
                    
                
                    FAQ f= new FAQ();
                    f.setQuestion(ques.getText());
                    f.setAnswer(ans.getText());
                    f.setID(Integer.parseInt(queid.getText()));
                try {
                    f.ReadingFile();
                } catch (IOException ex) {
                    Logger.getLogger(AdminstratorGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
                    q.add(f);
                try {
                    f.WritingFile();
                } catch (IOException ex) {
                    Logger.getLogger(AdminstratorGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
                JOptionPane.showMessageDialog(null, "Question Added");
                Frame5.setVisible(false);
                    Frame4.setVisible(true);
            }
            else if (buttonPressed.equals(view)){
                    Frame4.setVisible(false);
                    FAQGUI z = new FAQGUI();
                
            }
    }
} 
private class ButtonWatcher1 implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            Object buttonPressed=ae.getSource();
            if(buttonPressed.equals(Submit1)){
                 if(!FirstName.getText().isEmpty() && FirstName.getText().length()<=2 && !FirstName.getText().matches("[a-zA-Z]+") ){
                    JOptionPane.showMessageDialog(null, "Invalid First Name , Please enter another one" , "alert" , JOptionPane.ERROR_MESSAGE); 
                }
                    else if(!LastNam.getText().isEmpty() && LastNam.getText().length()<=2 && !LastNam.getText().matches("[a-zA-Z]+") ){
                    JOptionPane.showMessageDialog(null, "Invalid Last Name , Please enter another one" , "alert" , JOptionPane.ERROR_MESSAGE); 
                }
                     else if(!MiddleNam.getText().isEmpty() && MiddleNam.getText().length()<=2 && !MiddleNam.getText().matches("[a-zA-Z]+") ){
                    JOptionPane.showMessageDialog(null, "Invalid Middle Name , Please enter another one" , "alert" , JOptionPane.ERROR_MESSAGE); 
                }
                      else if(!ID1.getText().isEmpty() && ID1.getText().length()<=2 ){
                    JOptionPane.showMessageDialog(null, "Invalid ID , Please enter another one" , "alert" , JOptionPane.ERROR_MESSAGE); 
                }
                       else if(!sID.getText().isEmpty() && sID.getText().length()<=12 ){
                    JOptionPane.showMessageDialog(null, "Invalid Social ID , Please enter another one" , "alert" , JOptionPane.ERROR_MESSAGE); 
                }
                       
                     else if(!Username1.getText().isEmpty() && Username1.getText().length()<=4 ){
                    JOptionPane.showMessageDialog(null, "Invalid Username , Please enter another one" , "alert" , JOptionPane.ERROR_MESSAGE); 
                }    
                     else if(!Password1.getText().isEmpty() && Password1.getText().length()<=4 ){
                    JOptionPane.showMessageDialog(null, "Invalid Password , Please enter another one" , "alert" , JOptionPane.ERROR_MESSAGE); 
                }    
                      else if(!Adress.getText().isEmpty() && Adress.getText().length()<=4 ){
                    JOptionPane.showMessageDialog(null, "Invalid Address , Please enter another one" , "alert" , JOptionPane.ERROR_MESSAGE); 
                }    
                       else if(!telep.getText().isEmpty() && telep.getText().length()<=0 && telep.getText().length()>=12 ){
                    JOptionPane.showMessageDialog(null, "Invalid Telephone Number , Please enter another one" , "alert" , JOptionPane.ERROR_MESSAGE); 
                }  
                         else if(!email1.getText().isEmpty() && email1.getText().length()<=10&& !email1.getText().contains("@") && !email1.getText().contains(".com")){
                    JOptionPane.showMessageDialog(null, "Invalid email , Please enter another one" , "alert" , JOptionPane.ERROR_MESSAGE); 
                } 
                    
                    else{
                 Adminstrator  Admin = new Adminstrator();
                  Admin.setSalary(ssalary.getText());
        Admin.setFirstName(FirstName.getText());
        Admin.setLastName(LastNam.getText());
        Admin.setMiddleName(MiddleNam.getText());
        Admin.setId(ID1.getText());
        Admin.setSocialID(sID.getText());
        Admin.setEmail(email1.getText());
        Admin.setUserName(Username1.getText());
        Admin.setPassword(Password1.getText());
        Admin.setPhoneNumber(telep.getText());
        Admin.setAddress(Adress.getText());
                    
                try {
                    Admin.ReadingFile();
                } catch (IOException | ClassNotFoundException ex) {
                    Logger.getLogger(AdminstratorGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
        x.add(Admin);
                try {
                    Admin.WritingFile();
                } catch (IOException ex) {
                    Logger.getLogger(AdminstratorGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
           JOptionPane.showMessageDialog(null, "Sign up complete");
           Frame3.setVisible(false);
            AdminApp( Admin.getUserName());
                   Frame4.setVisible(true);
                    }
                }
            else if(buttonPressed.equals(Submit)){
                if (AdminS.LoginIn(Username.getText(),Password.getText())==true){
                 JOptionPane.showMessageDialog(null, "Login complete");
                   Frame.setVisible(false);
                   AdminApp(Username.getText() );
                   Frame4.setVisible(true);
                }
            else {
             JOptionPane.showMessageDialog(null, "Login failed invalid username or password ");
                }}
            else if(buttonPressed.equals(SUBMIT)){
                 try {
                    zz.ReadingFile();
                } catch (IOException ex) {
                    Logger.getLogger(TicketGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                         SearchedTicket();
                         Frame6.setVisible(false);
                    Frame7.setVisible(true);
        }
            else if(buttonPressed.equals(Update1)){
                Search();
            Frame4.setVisible(false);
            Frame6.setVisible(true);
            }
            else if(buttonPressed.equals(sUbmit)){
                 try {
                zz.ReadingFile();
            } catch (IOException ex) {
                Logger.getLogger(AdminstratorGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
            for (int i = 0; i < z.size(); i++) {
                if (z.get(i).getTicketID() == Integer.parseInt(HID.getText())) {
                      z.get(i).setTicketStatus((String) TicketStatus.getSelectedItem());
                 
                   
                    try {
                        z.get(i).WritingFile();
                    } catch (IOException ex) {
                        Logger.getLogger(AdminstratorGUI.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                }
}
            JOptionPane.showMessageDialog(null, "Status Updated");
            Frame7.dispose();
            Frame7.setVisible(false);
            Frame4.setVisible(true);
            
            }
            else if(buttonPressed.equals(Reports)){
                Report PrintReports=new Report();
                Frame4.setVisible(false);
                PrintReports.setVisible(true);
               PrintReports.repaint();
               JButton BACK=new JButton("Back");
               BACK.setBounds(400,500,110,20);
               PrintReports.add(BACK);
               BACK.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                       Object a=ae.getSource();
                       PrintReports.setVisible(false);
                       Frame4.setVisible(true);
                    }
                });
            }
            if (buttonPressed.equals(logout)){
                dispose();
                 Frame4.setVisible(false);
            AdminstratorGUI x = new AdminstratorGUI();
            } 
            if(buttonPressed.equals(check)){
                nonChecked();
Frame4.setVisible(false);
Frame8.setVisible(true);
                
            }
     }}}
