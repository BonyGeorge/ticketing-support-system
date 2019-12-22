
package ticketingsystem;
public class ExceptionSID extends Exception {
    
    public ExceptionSID() {
         super();
    }

    public ExceptionSID(String message) {
         super(message);
         message="Inavlid Social ID";
    }
    

    
}
