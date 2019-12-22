package ticketingsystem;



public class Invoice {
    
    protected int AssetsID;
    protected int SerialNumber;
    protected String Model;
    protected Date DateOfPurchase;
    protected int NumberOfAssetsInStore;

    public int getAssetsID() {
        return AssetsID;
    }

    public void setAssetsID(int AssetsID) {
        if(AssetsID>0)
        this.AssetsID = AssetsID;
    }

    public int getSerialNumber() {
        return SerialNumber;
    }

    public void setSerialNumber(int SerialNumber) {
        if(SerialNumber>0)
        this.SerialNumber = SerialNumber;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String Model) {
        if(Model!=null)
        this.Model = Model;
    }

    public Date getDateOfPurchase() {
        return DateOfPurchase;
    }

    public void setDateOfPurchase(Date DateOfPurchase) {
        
        this.DateOfPurchase = DateOfPurchase;
    }

    public int getNumberOfAssetsInStore() {
        return NumberOfAssetsInStore;
    }

    public void setNumberOfAssetsInStore(int NumberOfAssetsInStore) {
        if(NumberOfAssetsInStore>=0)
        this.NumberOfAssetsInStore = NumberOfAssetsInStore;
    }
    
}