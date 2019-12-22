package ticketingsystem;
public class MakePayment {

    protected float amount;
 protected int TransactionID;
    protected int UserID;
    
    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        if(amount>0.0)
        this.amount = amount;
    }

    public int getTransactionID() {
        return TransactionID;
    }

    public void setTransactionID(int TransactionID) {
        if(TransactionID>0)
        this.TransactionID = TransactionID;
    }

    public int getUserID() {
        return UserID;
    }

    public void setUserID(int UserID) {
        if(UserID!=0)
        this.UserID = UserID;
    }
   

    public void ConfirmTransaction(){           //leih mane3mlhash boolean
        
    }
    public void ReturnMoneyOnCancellation(){
        
    }
    
}