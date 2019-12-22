package Ticket;

public class TicketStatus {
protected String Status;
    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        if(Status == "open " || Status =="closed" || Status == "pending" )
        this.Status = Status;
    }
}
