package ticketingsystem;

public class Date {
public int Day;
public int Month;
public int Year;
public int hour;
public int minute;
public int seconds;

    public int getDay() {
        return Day;
    }

    public void setDay(int Day) {
        if(Day > 0 && Day <31 ){
        this.Day = Day;}
        
    }

    public int getMonth() {
        return Month;
    }

    public void setMonth(int Month) {
        if(Month>0&&Month<12){
        this.Month = Month;}
        
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int Year) {
        if(Year > 0){
        this.Year = Year;}
        
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if(hour>0&&hour<24){
        this.hour = hour;}
        
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if (minute <=60){
        this.minute = minute;}
        
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
         if (seconds <=60){
        this.seconds = seconds;}
         
    }
}
