package ticketingsystem;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public  class Rating implements  IFile,Serializable {
 protected String description;
    protected int Rating;
    protected int NofRatedTickets;
    
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        if(description != " ")
        this.description = description;
    }

    public int getRating() {
        return Rating;
    }

    public void setRating(int Rating) {
        if(Rating >=0 && Rating <=5 )
        this.Rating = Rating;
    }

    public int getNofRatedTickets() {
        return NofRatedTickets;
    }

    public void setNofRatedTickets(int NofRatedTickets) {
        if(NofRatedTickets!=0)
        this.NofRatedTickets = NofRatedTickets;
    }
    
   

    

    
   
  @Override
    public boolean WritingFile() throws IOException {
        try {
        ObjectOutputStream Bin = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Mohamed\\Desktop\\RatingFile.bin")) ;
            Bin.writeObject(TicketingSystem.r);
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
    ObjectInputStream Inp = new ObjectInputStream(new FileInputStream("C:\\Users\\Mohamed\\Desktop\\RatingFile.bin")) ;
            TicketingSystem.r=(ArrayList<Rating>)Inp.readObject();
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