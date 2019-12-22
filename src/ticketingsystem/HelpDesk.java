package ticketingsystem;

public class HelpDesk {
protected int id;
protected String[] issueSbject;
protected String body;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if(id >0){
        this.id = id;}
        else
            System.out.println("Invalid ID");
    }

    public String[] getIssueSbject() {
        return issueSbject;
    }

    public void setIssueSbject(String[] issueSbject) {
        issueSbject=new String[20];
        this.issueSbject = issueSbject;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        if(body.length()!=0){
        this.body = body;}
        else
            System.out.println("Invalid Issue Body");
    }
public boolean CreateMessage(){
    return true;
}
}
