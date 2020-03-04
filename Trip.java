/**
 * This class creates the template for trips for the vendors
 */
public class Trip
{
    private int tripID;
    private String origin;
    private String destination;
    private String departureDate;
    private String departureTime;
    private String arrivalDate;
    private String arrivalTime;
    private float fare;
    private int availableSeats;
    /**
     * Constructor for objects of class Trip
     */
    //Vendors have to input the relevant trip information to create a new trip
    public Trip(int tripID, String origin, String destination, String departureDate,
    String departureTime, String arrivalDate, String arrivalTime, float fare, 
    int availableSeats)
    {
        this.tripID = tripID;
        this.origin = origin;
        this.destination = destination;
        this.departureDate = departureDate;
        this.departureTime = departureTime;
        this.arrivalDate = arrivalDate;
        this.arrivalTime = arrivalTime;
        this.fare = fare;
        this.availableSeats = availableSeats;
    }
    
    //getter method that returns the fare of a trip
    public float getFare()
    {
      return fare;  
    }
    
    //getter method that returns the origin of the trip
    public String getOrigin()
    {
      return origin;  
    }
    
    //getter method that returns the destination of the trip
    public String getDestination()
    {
      return destination;  
    }
    
    //getter method that returns the ID of the trip
    public int getTripID()
    {
       return tripID;
    }
    
    //getter method that returns the availible seats on the trip
    public int getAvailableSeats()
    {
       return availableSeats;
    }
    
    //setter method that sets how many seats are avalible on the trip
    public void setAvailableSeats(int num)
    {
        this.availableSeats = num;
    }
    
    //toString method to show the status of trip objects 
    @Override
    public String toString()
    {
       String s = "";
       s += "Trip ID: " +tripID+ "\n";
       s += "Origin: "+origin+"\n";
       s += "Destination: "+destination+"\n";
       s += "Departure Date: "+departureDate+"\n";
       s += "Departure Time: "+departureTime+"\n";
       s += "Arrival Date: "+arrivalDate+"\n";
       s += "Arrival Time: "+arrivalTime+"\n";
       s += "Fare: "+fare+"\n";
       s += "Currently available seats: "+availableSeats+"\n";
       return s;
    }
}







