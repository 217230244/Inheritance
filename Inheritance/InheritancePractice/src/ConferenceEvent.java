public class ConferenceEvent extends Event{
    private boolean breakfastRequired;
    private double breakfastCost;
    private boolean lunchRequired;
    private double lunchCost;
    private boolean dinnerRequired;
    private double dinnerCost;
    private double conferenceEventCost;

    public ConferenceEvent(String eventID, String eventName, String eventLocation, String pointOfContact, double eventCost, int totalParticipants, int totalEventDays){
        super(eventID, eventName, eventLocation, pointOfContact, eventCost, totalParticipants, totalEventDays);
    }
    
    public double getBreakfastCost(){
        return breakfastCost;
    }

    public void setBreakfastCost(double breakfastCost){
        this.breakfastCost = breakfastCost;
    }

    public double getLunchCost(){
        return lunchCost;
        }

    public void setLunchCost(double lunchCost){
        this.lunchCost = lunchCost;
    }

    public double getDinnerCost(){
        return dinnerCost;
        }

    public void setDinnerCost(double dinnerCost){
        this.dinnerCost = dinnerCost;
    }

    public ConferenceEvent(String eventID, String eventName, String eventLocation, String pointOfContact, int totalParticipants, int totalEventDays,
    double breakfastCost, double lunchCost, double dinnerCost){
        super(eventID, eventName, eventLocation, pointOfContact, totalParticipants, totalEventDays);
        this.breakfastCost = breakfastCost;
        this.lunchCost = lunchCost;
        this.dinnerCost = dinnerCost;
    }


    @Override
    public void calculateEentCost(){
        conferenceEventCost = getEventCost() + ((getBreakfastCost() + getLunchCost() + getDinnerCost()) * getTotalParticipants() * getTotalEventDays();
    }

    @Override
    public String toString(){
        return "Conference Event details: " + "\n" +
        "Event ID: " + getEventID() + "\n" + 
        "Event Name: " + getEventName() + "\n" +
        "Event Location: " +getEventLocation() + "\n" +
        "Total participants: " + getTotalParticipants() + "\n" +
        "Total Conference Cost: " + conferenceEventCost;
    }    
}
