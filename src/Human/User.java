package Human;

import java.io.FileNotFoundException;
import java.io.IOException;
import ticketingsystem.HelpDesk;
import ticketingsystem.IFile;
import Ticket.*;
import Ticket.TrackTicket;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import ticketingsystem.LoginOptions;
import ticketingsystem.TicketingSystem;
import static ticketingsystem.TicketingSystem.z;


public  class User extends Human implements IFile, Serializable, LoginOptions {
  
    protected String BirthDate;
    protected String CompanyName;
    protected String NumberOfEmployees;
   protected Ticket Ticket;

    public String getBirthDate() {
        
        return BirthDate;
    }
    public void setBirthDate(String BirthDate) {
        if(BirthDate!=null)
        this.BirthDate = BirthDate;
    }

    public String getCompanyName() {
        
        return CompanyName;
    }

    public void setCompanyName(String CompanyName) {
        
       if(CompanyName!=null)
        this.CompanyName = CompanyName;
    }

    public String getNumberOfEmployees() {
        
        return NumberOfEmployees;
    }

    public void setNumberOfEmployees(String NumberOfEmployees) {
        if(NumberOfEmployees!=null)
        this.NumberOfEmployees = NumberOfEmployees;
    }
      public String RateourService(int rating)
    { switch (rating){
        case 1:
            return "Very bad Service";
        case 2:
            return "Bad Service";
        case 3:
            return "Acceptable Service";
        case 4:
            return "Very Good Service";
        case 5:
    return "Excellent Service";
        
    }
        return null;
        
    }
    
    public void EditTicket(int id , String desc){
        TrackTicket y= new TrackTicket();
    
        for (int i=0;i<TicketingSystem.z.size();i++){
            if (id==y.Search(z.get(i).getTicketID()))
                z.get(i).setDescription(desc);
        
        
        }}
    public void DeleteTicket(int id){
        TrackTicket x= new TrackTicket();
     for (int i=0;i<TicketingSystem.z.size();i++){
            if (id==x.Search(z.get(i).getTicketID()))
                z.remove(i);

        }

      
    } 
    public String SendMessage(HelpDesk helpsdesk)
    {
        return null;
        
    }

    @Override
    public boolean WritingFile() throws IOException {
        try {
        ObjectOutputStream Bin = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Mohamed\\Desktop\\NUsernFile.bin")) ;
            Bin.writeObject(TicketingSystem.y);
            Bin.close();
        
        return true;
    }
    catch(IOException ex){
        return false;
    }
    }

    @Override
    public boolean ReadingFile() throws FileNotFoundException, IOException {
         try{
    ObjectInputStream Inp = new ObjectInputStream(new FileInputStream("C:\\Users\\Mohamed\\Desktop\\NUsernFile.bin")) ;
            TicketingSystem.y=(ArrayList<User>)Inp.readObject();
            Inp.close();
            return true;
    }
    catch (IOException ex){
        return false;
        
    }   catch (ClassNotFoundException ex) {
           
            return false;
        }
        
}

    @Override
    public boolean LoginIn(String UN, String Password) {
         for (String i:TicketingSystem.UserHM.keySet())
{
    if(UN.equals(i))
    {
        if(Password.equals(TicketingSystem.UserHM.get(i).getPassword()))
            return true;
    }
       
}
return false;
    }

    @Override
    public void Logout() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}   