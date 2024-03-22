public class Main {
    public static void main(String[] args) throws Exception {
        ConferenceEvent conferenceEvent = new ConferenceEvent(eventID:"E001", eventName:"AI Conference", eventLocation:"0", pointOfContact:"0", eventCost:"100", totalParticipants:"20", totalEventDays:"3")
        conferenceEvent.calculateEentCost();
        System.out.println(conferenceEvent);
    }
}}