package Ticket;

import static ticketingsystem.TicketingSystem.z;


public class TrackTicket {
    
    protected int id ;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if(id>0)
        this.id = id;
    }
    
    public int Search (int TicketID){
       
        for(int i=0;i<z.size();i++){
            if (z.get(i).getTicketID()==TicketID)
                return i;
        }
        return -1;
        
    }


}