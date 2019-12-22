package HumanGUI;

import Human.Worker;
import java.awt.Image;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import static ticketingsystem.TicketingSystem.w;


public class WorkerGUI extends JFrame{
    ImageIcon background_image =new ImageIcon();
    
 JFrame Frame =new JFrame();
    JFrame Frame2 =new JFrame();
    JFrame Frame3 =new JFrame();
    JTextField Username=new JTextField("");
    JPasswordField Password =new JPasswordField("");
    JLabel Name=new JLabel("Username :  ");
    JLabel Pass=new JLabel("Password : ");
    JButton Submit =new JButton("Submit");
    JButton Submit1 =new JButton("Submit");
    JButton NewEmployee =new JButton("Sign Up");
    JButton Login =new JButton("login");
    JLabel Name1=new JLabel("First Name  ");
     JTextField FirstName=new JTextField(" ");
     JLabel MiddleName=new JLabel("Middle Name  ");
     JTextField MiddleNam=new JTextField(" ");
     JLabel LastName=new JLabel("Last Name  ");
     JTextField LastNam=new JTextField(" ");
     JLabel email=new JLabel("email  ");
     JTextField email1=new JTextField(" ");
     JLabel telephone=new JLabel("telephone  ");
     JTextField telep=new JTextField(" ");
     JLabel salary=new JLabel("Salary  ");
     JTextField ssalary=new JTextField(" ");
     JLabel Address=new JLabel("Address  ");
     JTextField Adress=new JTextField(" ");
     JLabel ID=new JLabel("ID  ");
     JTextField ID1=new JTextField(" ");
     JLabel SocialID=new JLabel("Social ID  ");
     JTextField sID=new JTextField(" ");
     JLabel WorkingHour=new JLabel("Working Hrs  ");
     JTextField WHRS=new JTextField(" ");
     JLabel Department=new JLabel("Department  ");
     JTextField Dep=new JTextField(" ");
     JLabel username=new JLabel("username  ");
     JTextField Username1=new JTextField(" ");
     JLabel password=new JLabel("password  ");
     JPasswordField Password1=new JPasswordField("");
    protected  Worker WorkerS = new Worker();
    
    private void SignUp(){
    
     
        Frame3.setTitle("Sign up");
        Frame3.setLayout(null);     
        Frame3.setResizable(false);
        Frame3.setSize(600,600);
        Frame3.setVisible(true);
        Frame3.getContentPane().add(Name1);
        Name1.setBounds(10,0,110,20);
        FirstName.setBounds(85,0,110,20);
        Frame3.getContentPane().add(FirstName);
        Frame3.getContentPane().add(MiddleName);
        MiddleName.setBounds(10,20,110,20);
        MiddleNam.setBounds(85,20,110,20);
        Frame3.getContentPane().add(MiddleNam);
        Frame3.getContentPane().add(LastName);
        LastName.setBounds(10,40,110,20);
        LastNam.setBounds(85,40,110,20);
        Frame3.getContentPane().add(LastNam);
        Frame3.getContentPane().add(ID);
        ID.setBounds(10,60,110,20);
        ID1.setBounds(85,60,110,20);
        Frame3.getContentPane().add(ID1);
        Frame3.getContentPane().add(username);
        username.setBounds(10,80,110,20);
        Username1.setBounds(85,80,110,20);
        Frame3.getContentPane().add(Username1);
        Frame3.getContentPane().add(password);
        password.setBounds(10,100,110,20);
        Password1.setBounds(85,100,110,20);
        Frame3.getContentPane().add(Password1);
        Frame3.getContentPane().add(email);
        email.setBounds(10,120,110,20);
        email1.setBounds(85,120,110,20);
        Frame3.getContentPane().add(email1);
        Frame3.getContentPane().add(telephone);
        telephone.setBounds(10,140,110,20);
        telep.setBounds(85,140,110,20);
        Frame3.getContentPane().add(telep);
        Frame3.getContentPane().add(Address);
        Address.setBounds(10,160,110,20);
        Adress.setBounds(85,160,110,20);
        Frame3.getContentPane().add(Adress);
        Frame3.getContentPane().add(SocialID);
        SocialID.setBounds(10,180,110,20);
        sID.setBounds(85,180,110,20);
        Frame3.getContentPane().add(sID);
        Frame3.getContentPane().add(salary);
        salary.setBounds(10,200,110,20);
        ssalary.setBounds(85,200,110,20);
        Frame3.getContentPane().add(ssalary);
        Frame3.getContentPane().add(WorkingHour);
        WorkingHour.setBounds(10,220,110,20);
        WHRS.setBounds(85,220,110,20);
        Frame3.getContentPane().add(WHRS);
        Frame3.getContentPane().add(Department);
        Department.setBounds(10,240,110,20);
        Dep.setBounds(85,240,110,20);
        Frame3.getContentPane().add(Dep);
         Frame3.getContentPane().add(Submit1);
        Submit1.setBounds(100,280,75,20);
     Frame3.setDefaultCloseOperation(EXIT_ON_CLOSE);
     background_image=new ImageIcon("C:\\Users\\Mohamed\\Desktop\\tst.jpg");
       Image img=background_image.getImage();
       Image temp_img=img.getScaledInstance(600,600, Image.SCALE_SMOOTH);

       background_image=new ImageIcon(temp_img);
       JLabel background=new JLabel("",background_image,JLabel.CENTER);
       background.setBounds(0,0,600,600);
      Frame3.add(background);
     }
    
    public WorkerGUI() {
        
        Frame2.setTitle("Worker");
        Frame2.setLayout(null);     
        Frame2.setSize(600,600);
        Frame2.setResizable(false);
        Frame2.setVisible(true);
        Frame2.getContentPane().add(NewEmployee);
        NewEmployee.setBounds(10,0,110,20);
        Frame2.getContentPane().add(Login);
        Login.setBounds(20,100,115,30);
        background_image=new ImageIcon("C:\\Users\\Mohamed\\Desktop\\tst.jpg");
       Image img=background_image.getImage();
       Image temp_img=img.getScaledInstance(600,600, Image.SCALE_SMOOTH);

       background_image=new ImageIcon(temp_img);
       JLabel background=new JLabel("",background_image,JLabel.CENTER);
       background.setBounds(0,0,600,600);
      Frame2.add(background);
       
     
        Frame2.setDefaultCloseOperation(EXIT_ON_CLOSE);
        Submit.addActionListener(new ButtonWatcher1());
        NewEmployee.addActionListener(new ButtonWatcher());
        Login.addActionListener(new ButtonWatcher());
        Submit1.addActionListener(new ButtonWatcher1());
    }
     private void Login(){
         Frame.setTitle("Login");
        Frame.setLayout(null);     
        Frame.setSize(600,600);
        Frame.setVisible(true);
        Frame.setResizable(false);
        
        Frame.getContentPane().add(Name);
        Name.setBounds(10,0,110,20);
        Username.setBounds(80,0,110,20);
        Frame.getContentPane().add(Username);
        
        Frame.add(Pass);
        Pass.setBounds(10,50,110,20);
        Password.setBounds(80,50,110,20);
        Frame.getContentPane().add(Password);
        background_image=new ImageIcon("C:\\Users\\Mohamed\\Desktop\\tst.jpg");
       Image img=background_image.getImage();
       Image temp_img=img.getScaledInstance(600,600, Image.SCALE_SMOOTH);

       background_image=new ImageIcon(temp_img);
       JLabel background=new JLabel("",background_image,JLabel.CENTER);
       background.setBounds(0,0,600,600);
      Frame.add(background);
        
        Frame.getContentPane().add(Submit);
        Submit.setBounds(100,150,75,20);
      Frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
         
     }
    private class ButtonWatcher implements ActionListener{

        @Override
       public void actionPerformed(ActionEvent ae) {
            Object buttonPressed=ae.getSource();
            if(buttonPressed.equals(NewEmployee)){
                Frame2.setVisible(false);
                Frame3.setVisible(true);
                SignUp();
                
            }
                else if (buttonPressed.equals(Login)){
                    Frame2.setVisible(false);
                    Frame.setVisible(true);
                Login();
                
                
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
                       else if(!WHRS.getText().isEmpty() && WHRS.getText().length()>=2 ){
                    JOptionPane.showMessageDialog(null, "Invalid Working Hours , Please enter another one" , "alert" , JOptionPane.ERROR_MESSAGE); 
                }
                       else if(!Dep.getText().isEmpty() && Dep.getText().length()>=2 ){
                    JOptionPane.showMessageDialog(null, "Invalid Department , Please enter another one" , "alert" , JOptionPane.ERROR_MESSAGE); 
                }
                         else if(!email1.getText().isEmpty() && email1.getText().length()<=10&& !email1.getText().contains("@") && !email1.getText().contains(".com")){
                    JOptionPane.showMessageDialog(null, "Invalid email , Please enter another one" , "alert" , JOptionPane.ERROR_MESSAGE); 
                }
                      
    else{
            Worker  worker = new Worker() ;
                 worker.setFirstName(FirstName.getText());
        worker.setLastName(LastNam.getText());
        worker.setMiddleName(MiddleNam.getText());
        worker.setId(ID1.getText());
        worker.setSocialID(sID.getText());
        worker.setEmail(email1.getText());
        worker.setUserName(Username1.getText());
        worker.setPassword(Password1.getText());
        worker.setPhoneNumber(telep.getText());
        worker.setAddress(Adress.getText());
        worker.setWorkingHours(WHRS.getText());
        worker.setDepartment(Dep.getText());
        
                try {
                    worker.ReadingFile();
                } catch (IOException ex) {
                    Logger.getLogger(SupplierGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
        w.add(worker);
                try {
                    worker.WritingFile();
                } catch (IOException ex) {
                    Logger.getLogger(SupplierGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            JOptionPane.showMessageDialog(null, "Sign up complete");
           Frame3.setVisible(false);
                       }
            
            }
                else if(buttonPressed.equals(Submit)){
                if (WorkerS.LoginIn(Username.getText(),Password.getText())==true){
                 JOptionPane.showMessageDialog(null, "Login complete");
                }
            else {
             JOptionPane.showMessageDialog(null, "Login failed invalid username or password ");
                }}
}}}
