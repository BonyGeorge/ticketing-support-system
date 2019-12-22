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
import ticketingsystem.Product;
import ticketingsystem.TicketingSystem;


public  class Supplier extends Human implements IFile,Serializable , LoginOptions {
    protected Product product;
    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        if(product!=null)
        this.product = product;
    }
public void AddProducts(){
}


    @Override
    public boolean WritingFile() throws IOException {
    try {
        ObjectOutputStream Bin = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Mohamed\\Desktop\\NSupplier.bin")) ;
            Bin.writeObject(TicketingSystem.s);
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
    ObjectInputStream Inp = new ObjectInputStream(new FileInputStream("C:\\Users\\Mohamed\\Desktop\\NSupplier.bin")) ;
            TicketingSystem.s=(ArrayList<Supplier>)Inp.readObject();
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
     for (String i:TicketingSystem.SupplierHM.keySet())
{
    if(UN.equals(i))
    {
        if(Password.equals(TicketingSystem.SupplierHM.get(i).getPassword()))
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
