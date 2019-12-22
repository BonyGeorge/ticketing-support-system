package Ticket;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import ticketingsystem.Date;
import java.io.ObjectOutputStream;
import ticketingsystem.IFile;
import ticketingsystem.TicketingSystem;


public class Ticket implements IFile,Serializable {


    protected String Description;
    protected String TicketStatus;
   protected Category x;
   protected Date TicketDate;
   protected int TicketID;

    public String getTicketStatus() {
        return TicketStatus;
    }

    public void setTicketStatus(String TicketStatus) {
        this.TicketStatus = TicketStatus;
    }
   protected Date DueDate;
   

       public Category getX() {
        return x;
    }

    public void setX(Category x) {
        this.x = x;
    }
  
    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        if(Description!=null)
        this.Description = Description;
    }

    public Date getTicketDate() {
        return TicketDate;
    }

    public void setTicketDate(Date TicketDate) {
        this.TicketDate = TicketDate;
    }

    public int getTicketID() {
        return TicketID;
    }

    public void setTicketID(int TicketID) {
        if(TicketID>0)
        this.TicketID = TicketID;
    }

    public Date getDueDate() {
        return DueDate;
    }

    public void setDueDate(Date DueDate) {
        this.DueDate = DueDate;
    }
    public String setPriority(int Priority){
        if(Priority>=1 && Priority<=3)
    switch(Priority){
        case 1:
            return "Low";
        case 2:
            return "Moderate"; 
        case 3:
            return "Critical"; 
    }
        return null; 
    }

    @Override
    public boolean WritingFile() throws IOException {
         try {
        ObjectOutputStream Bin = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Mohamed\\Desktop\\NTicketFile.bin")) ;
            Bin.writeObject(TicketingSystem.z);
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
    ObjectInputStream Inp = new ObjectInputStream(new FileInputStream("C:\\Users\\Mohamed\\Desktop\\NTicketFile.bin")) ;
            TicketingSystem.z=(ArrayList<Ticket>)Inp.readObject();
            Inp.close();
            return true;
    }
    catch (IOException ex){
        return false;
        
    }   catch (ClassNotFoundException ex) {
           return false;
        }
}
 
}
