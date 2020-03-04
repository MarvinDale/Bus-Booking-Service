import java.util.ArrayList;
/**
 * An abstract class that is the parent class to all vendors added to the system
 */
// An abstract class used to easily add new vendors to the system
// New vendors just have to provide their name, their availble trips and add them to an array list
abstract class Vendor
{
  String company = "";
  ArrayList<Trip>trips;
  
  public Vendor()
  {
    //creating an arraylist to store different trip objects for each vendor  
    trips = new ArrayList<>();
  }
  
  //method used to select a particular trip using the trips ID number
  public Trip getTrip(int ID)
  {
     int id;
     Trip selectedTrip = new Trip(0,"","","","","","",0,0);
     for(Trip trip : trips) //An advanced for loop that searches through all the trips in the arraylist
     {
         //reads the ID of each trip objects and stores it in the "id" variable
         id = trip.getTripID();
         //an if statement that compares the inputed ID from the user to the id variable
         //obtained from each trip object
         if (ID == id)
         {
            //if the inputted ID matches the id of a trip object the trip object is set as
            //the selected trip
            selectedTrip = trip;
         }
     }
     //the selected trip is returned, if the ID doent exist the booking will fail
     return selectedTrip;
  }
  
  //method used to removed the seats that have been booked
  public void makeBooking(Booking booking)
  {
     for(Trip trip : trips) //Advanced for loop that searches through all the trips in the arraylist
     {
        //An if statement that finds the selected trip in the array list 
        if (booking.getSelectedTrip() == trip)
        {
            //The available seats are then set to amount calculated in the booking class
            trip.setAvailableSeats(booking.getRemainingSeats());
        }
        
     }
  }
  
  //A toString method that displays the available trips for each vendor
  @Override
  public String toString()
  {
     String s = "";
     //a for loop that gets the size of the arraylist and loops over every object using the index
     for(int i = 0; i < trips.size();i++)
     {
       s+= trips.get(i);
       s+= "\n\n";
     }
      return s;
  }
}