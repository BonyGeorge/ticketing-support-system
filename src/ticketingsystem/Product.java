package ticketingsystem;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class Product implements IFile,Serializable{
    protected int productID;
    public String ProductType;
    public int Price;

    public int getPrice() {
        return Price;
    }

    public void setPrice(int Price) {
       if(Price>0)
        this.Price = Price;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        if(productID>0)
        this.productID = productID;
    }

    public String getProductType() {
        return ProductType;
    }

    public void setProductType(String ProductType) {
        if(ProductType!=null)
        this.ProductType = ProductType;
    }
     @Override
    public boolean WritingFile() throws IOException {
         try {
        ObjectOutputStream Bin = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Mohamed\\Desktop\\NProducts.bin")) ;
            Bin.writeObject(TicketingSystem.p);
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
    ObjectInputStream Inp = new ObjectInputStream(new FileInputStream("C:\\Users\\Mohamed\\Desktop\\NProducts.bin")) ;
            TicketingSystem.p=(ArrayList<Product>)Inp.readObject();
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
