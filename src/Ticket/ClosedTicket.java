package Ticket;


import ticketingsystem.Date;

public class ClosedTicket {
    protected Date ClosedTime;
    public void ClosedTicket(){}

    public Date getClosedTime() {
        return ClosedTime;
    }

    public void setClosedTime(Date ClosedTime) {
        this.ClosedTime = ClosedTime;
    }
}
