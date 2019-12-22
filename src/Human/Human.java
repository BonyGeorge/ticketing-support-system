package Human;

import java.io.Serializable;

public class Human implements Serializable{
protected String id;
protected String SocialID;
protected String email;
protected String UserName;
protected String Password;
protected String PhoneNumber;
protected String Address;
protected String FirstName;
protected String LastName;
protected String MiddleName;

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        if(FirstName!=null && FirstName.length()>=2){
        this.FirstName = FirstName;}
    
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        if(LastName!=null && LastName.length()>=2){
        this.LastName = LastName;}
        
    }

    public String getMiddleName() {
        return MiddleName;
    }

    public void setMiddleName(String MiddleName) {
        if(MiddleName!=null && MiddleName.length()>=2){
        this.MiddleName = MiddleName;}
        
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        if(id!=null){
        this.id = id;}
        
    }

    public String getSocialID() {
        return SocialID;
    }

    public void setSocialID(String SocialID) {
        this.SocialID = SocialID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        if(UserName.length() != 0 ){
        this.UserName = UserName;
        }
       
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        if(Password.length() != 0 && Password.length()>=4){
        this.Password = Password;}
        
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String PhoneNumber) {
        if(PhoneNumber.length() != 0 && PhoneNumber.length() <= 12){
        this.PhoneNumber = PhoneNumber;}
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        if(Address!=null)
        this.Address = Address;
    }

}