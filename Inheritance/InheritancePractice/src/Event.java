public class Event {

    public static final double insuranceCost = 100.00;

    private String eventID;
    private String eventName;
    private String eventLocation;
    private String pointOfContact;
    private double eventCost;
    private int totalParticipants;
    private int totalEventDays;
    
    public Event(String eventID, String eventName, String eventLocation, String pointOfContact, double eventCost, int totalParticipants, int totalEventDays){
        this.eventID = eventID;
        this.eventName = eventName;
        this.eventLocation = eventLocation;
        this.pointOfContact = pointOfContact;
        this.eventCost = eventCost;
        this.totalParticipants = totalParticipants;
        this.totalEventDays = totalEventDays;

    }
    
    public String getEventID(){
        return eventID;
    }

    public void setEventID(String eventID){
        this.eventID = eventID;
    }

    public String getEventName(){
        return eventName;
    }

    public void setEventName(String eventName){
        this.eventName = eventName;
    }

    public String getEventLocation(){
        return eventLocation;
    }

    public void setEventLocation(String location){
        this.eventLocation = location;
    }

    public String getPointOfContact(){
        return pointOfContact;
    }

    public void setPointOfContact(String pointOfContact){
        this.pointOfContact = pointOfContact;
    }

    public double getEventCost(){
        return eventCost;
    }

    public void setEventCost(double eventCost){
        this.eventCost = eventCost + (eventCost * 0.3) + (insuranceCost);
    }

    public int getTotalParticipants(){
        return totalParticipants;
    }

    public void setTotalParticipants(int totalParticipants){
        this.totalParticipants = totalParticipants;
    }
    
    public int getTotalEventDays(){
        return totalEventDays;
    }

    public void setTotalEventDays(int totalEventDays){
        this.totalEventDays = totalEventDays;
    }

    public String toString(){
        return eventID + " " + eventName + " " + eventLocation + " " + pointOfContact + " "+ eventCost + " " + totalParticipants + " " + totalEventDays;
    }

    public void calculateEentCost(){
        this.eventCost = eventCost + (eventCost * tax) + insuranceCost;
    }

}    



