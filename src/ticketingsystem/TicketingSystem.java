package ticketingsystem;
import TicketingSystemGUI.HomeScreen;
import Human.*;
import HumanGUI.UserGUI;
import Ticket.*;
import TicketingSystemGUI.RatingGUI;
import TicketingSystemGUI.WelcomeFrame;
import java.util.ArrayList;
import java.util.HashMap;

public class TicketingSystem  {
     public static ArrayList<Adminstrator> x = new ArrayList<Adminstrator>(); 
     public static ArrayList<Ticket> z = new ArrayList<Ticket>();
     public static ArrayList<Worker> w = new ArrayList<Worker>();
     public static ArrayList<User> y=new ArrayList<User>();
     public static ArrayList<Rating> r=new ArrayList<Rating>();
      public static ArrayList<Product> p=new ArrayList<Product>();
     public static ArrayList<Supplier> s = new ArrayList<Supplier>();
     public static ArrayList<FAQ> q = new ArrayList<FAQ>();
     public static HashMap<String,Adminstrator> AdminHM=new HashMap<String,Adminstrator>();
     public static HashMap<String,User> UserHM=new HashMap<String,User>();
     public static HashMap<String,Worker> WorkerHM=new HashMap<String,Worker>();
     public static HashMap<String,Supplier> SupplierHM=new HashMap<String,Supplier>();
         
    public static void main(String[] args)  {
        
        WelcomeFrame f=new WelcomeFrame();
        f.setVisible(true);
        
        }}