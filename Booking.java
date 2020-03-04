
/**
 *This class is responsible for completing the booking by checking if enough seats are available
 *if the booking is successful the seats remaining are calculated in this class
 */
public class Booking
{
    int numPassengers;
    int remainingSeats;
    boolean success;
    Trip selectedTrip;
    /**
     * Constructor for objects of class Booking
     */
    public Booking(Trip selectedTrip, int numPassengers)
    {
       this.selectedTrip = selectedTrip;
       this.numPassengers = numPassengers;
       
       //when a booking is instansiated the remaining seats is set to the avalible seats minus the number of tickets bought
       remainingSeats = selectedTrip.getAvailableSeats() - numPassengers;
       
       //if theres enough seats to complete the booking the booking will be set to successful
       if (remainingSeats >= 0) 
       {
           success = true;
       }
    }
    
    //getter method for the success of the booking
    public boolean getSuccess()
    {
        return success;
    }
    
    //getter method for the seats remaining after the booking
    public int getRemainingSeats()
    {
        return remainingSeats;
    }
    
    //getter method for the selected trip
    public Trip getSelectedTrip()
    {
        return selectedTrip;
    }
    
    //getter method for the number of passengers booked on the bus
    public int getNumPassengers()
    {
        return numPassengers;
    }
    
}
