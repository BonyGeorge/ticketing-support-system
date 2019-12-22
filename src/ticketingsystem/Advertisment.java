package ticketingsystem;

import java.net.URL;


public class Advertisment {
   
    protected String CompanyName;
    protected URL URL;

    public String getCompanyName() {
        return CompanyName;
    }

    public void setCompanyName(String CompanyName) {
        if(CompanyName.length()!=0){
        this.CompanyName = CompanyName;}
        
    }

    public URL getURL() {
        return URL;
    }

    public void setURL(URL URL) {
        this.URL = URL;
    }
public void RequestAd(){
}
}