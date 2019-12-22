package Human;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import ticketingsystem.LoginOptions;
import ticketingsystem.TicketingSystem;

public class Adminstrator extends Human implements LoginOptions, Serializable {
protected String Salary;


public String getSalary(){
        return Salary;
}
 public void setSalary(String Salary) {
     if(Salary!=null && Salary != "0")   
     this.Salary = Salary;
    }

public void HandleUrgentTickets() {
    }
public void UpdateTicketStatus(){
}
public void viewDashBoard(){
}
public void CheckDueDate(){
}
public void UpdateTicket(){
}
public void PrintReports(){
}
public void MakePayement(){
}
public void AssignTicket(){
}
public void AccessDashBoard(){
}
    
@Override
    public void Logout() {
       }
    

public boolean WritingFile() throws IOException{
    try {
        ObjectOutputStream Bin = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Mohamed\\Desktop\\AdminFile.bin")) ;
            Bin.writeObject(TicketingSystem.x);
            Bin.close();
        
        return true;
    }
    catch(IOException ex){
        return false;
    }
           
         
    }  
public boolean ReadingFile() throws IOException, ClassNotFoundException{
    try{
    ObjectInputStream Inp = new ObjectInputStream(new FileInputStream("C:\\Users\\Mohamed\\Desktop\\AdminFile.bin")) ;
            TicketingSystem.x=(ArrayList<Adminstrator>)Inp.readObject();
            Inp.close();
            return true;
    }
    catch (IOException ex){
        return false;
        
    }
}
  

@Override
    public boolean LoginIn(String UN, String Password) {
       for (String i:TicketingSystem.AdminHM.keySet())
{
    if(UN.equals(i))
    {
        if(Password.equals(TicketingSystem.AdminHM.get(i).getPassword()))
            return true;
    }
       
}
return false;
    }

    


}