package Human;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import ticketingsystem.IFile;
import ticketingsystem.LoginOptions;
import ticketingsystem.TicketingSystem;

public class Worker extends Human implements LoginOptions ,IFile,Serializable {
protected String WorkingHours;
protected String Department;

    public String getWorkingHours() {
        return WorkingHours;
    }

    public void setWorkingHours(String WorkingHours) {
        if(WorkingHours!=null)
        this.WorkingHours = WorkingHours;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String Department) {
        if(Department!=null)
        this.Department = Department;
    }
public void HandleTickets(){
}

@Override
public void Logout(){
}

    @Override
    public boolean WritingFile() throws IOException {
        try {
        ObjectOutputStream Bin = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Mohamed\\Desktop\\NWorkerFile.bin")) ;
            Bin.writeObject(TicketingSystem.w);
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
    ObjectInputStream Inp = new ObjectInputStream(new FileInputStream("C:\\Users\\Mohamed\\Desktop\\NWorkerFile.bin")) ;
            TicketingSystem.w=(ArrayList<Worker>)Inp.readObject();
            Inp.close();
            return true;
    }
    catch (IOException ex){
        return false;
        
    } catch (ClassNotFoundException ex) {
        return false;
    }
}

    @Override
    public boolean LoginIn(String UN, String Password) {
     for (String i:TicketingSystem.WorkerHM.keySet())
{
    if(UN.equals(i))
    {
        if(Password.equals(TicketingSystem.WorkerHM.get(i).getPassword()))
            return true;
    }
       
}    
    return false;
    }
}
 