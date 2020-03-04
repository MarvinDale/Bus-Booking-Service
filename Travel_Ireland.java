/**
 * This is the main method of the project, here each of the vendor classes are tested
 */
public class Travel_Ireland
{
    public static void main(String[] args)
    {
        Travel_Ireland test = new Travel_Ireland();
        //test.busEireann();
        //test.goBus();
        test.cityLink();
    }
    
    public void busEireann()
    {
       System.out.println("\tBUS EIREANN\n");
        //instantiation of Bus Eireann that populates some default Trip objects stored
       BusEireann be = new BusEireann();
       
       //Prints out details of all the stored Trip objects
       System.out.println(be);
       
       //Select a trip by referencing a valid trip ID
       Trip selectedTrip = be.getTrip(9101);
       
       //Select a trip by referencing with the selcted trip and number of passengers
       Booking booking = new Booking(selectedTrip, 10);
       
       if(booking.getSuccess() == true) //Print details of a successful booking
       {
           be.makeBooking(booking);
           System.out.println("\nBooking Successful");
           System.out.println("=============================================");
           System.out.println("Number of Passengers: "+booking.getNumPassengers());
           System.out.println("Trip Details: ["+booking.getSelectedTrip().getOrigin()+"] to ["+ booking.getSelectedTrip().getDestination()+"]");
           System.out.println("Trip ID: "+booking.getSelectedTrip().getTripID());
           System.out.println("Total Cost: £"+(booking.getNumPassengers())*(selectedTrip.getFare()));
           System.out.println("=============================================\n\n\n\n");
       }
       else //The booking will fail if there are not enough seats available
       {
           System.out.println("\n\nBooking Failed!\n\n") ;
       }
       
       //Prints out all trips again with the available seats updated based on the booking
       System.out.println(be);
    }
    
    public void goBus()
    {
       System.out.println("\tGO BUS\n");
        //instantiation of Bus Eireann that populates some default Trip objects stored
       GoBus gb = new GoBus();
       
       //Prints out details of all the stored Trip objects
       System.out.println(gb);
       
       //Select a trip by referencing a valid trip ID
       Trip selectedTrip = gb.getTrip(7923);
       
       //Select a trip by referencing with the selcted trip and number of passengers
       Booking booking = new Booking(selectedTrip, 7);
       
       if(booking.getSuccess() == true) //Print details of a successful booking
       {
           gb.makeBooking(booking);
           System.out.println("\nBooking Successful");
           System.out.println("=============================================");
           System.out.println("Number of Passengers: "+booking.getNumPassengers());
           System.out.println("Trip Details: ["+booking.getSelectedTrip().getOrigin()+"] to ["+ booking.getSelectedTrip().getDestination()+"]");
           System.out.println("Trip ID: "+booking.getSelectedTrip().getTripID());
           System.out.println("Total Cost: £"+(booking.getNumPassengers())*(selectedTrip.getFare()));
           System.out.println("=============================================\n\n\n\n");
       }
       else //The booking will fail if there are not enough seats available
       {
           System.out.println("\n\nBooking Failed!\n\n") ;
       }
       
       //Prints out all trips again with the available seats updated based on the booking
       System.out.println(gb);
    }
    
    public void cityLink()
    {
       System.out.println("\t CITY LINK\n");
        //instantiation of Bus Eireann that populates some default Trip objects stored
       CityLink cl = new CityLink();
       
       //Prints out details of all the stored Trip objects
       System.out.println(cl);
       
       //Select a trip by referencing a valid trip ID
       Trip selectedTrip = cl.getTrip(4489);
       
       //Select a trip by referencing with the selcted trip and number of passengers
       Booking booking = new Booking(selectedTrip, 11);
       
       if(booking.getSuccess() == true) //Print details of a successful booking
       {
           cl.makeBooking(booking);
           System.out.println("\nBooking Successful");
           System.out.println("=============================================");
           System.out.println("Number of Passengers: "+booking.getNumPassengers());
           System.out.println("Trip Details: ["+booking.getSelectedTrip().getOrigin()+"] to ["+ booking.getSelectedTrip().getDestination()+"]");
           System.out.println("Trip ID: "+booking.getSelectedTrip().getTripID());
           System.out.println("Total Cost: £"+(booking.getNumPassengers())*(selectedTrip.getFare()));
           System.out.println("=============================================\n\n\n\n");
       }
       else //The booking will fail if there are not enough seats available
       {
           System.out.println("\n\nBooking Failed!\n\n") ;
       }
       
       //Prints out all trips again with the available seats updated based on the booking
       System.out.println(cl);
       
       //Select a trip by referencing a valid trip ID
       Trip selectedTrip2 = cl.getTrip(4489);
       
       //Select a trip by referencing with the selcted trip and number of passengers
       Booking booking2 = new Booking(selectedTrip, 100);//ordering too many tickets so the booking will fail
       
       if(booking2.getSuccess() == true) //Print details of a successful booking
       {
           cl.makeBooking(booking2);
           System.out.println("\nBooking Successful");
           System.out.println("=============================================");
           System.out.println("Number of Passengers: "+booking2.getNumPassengers());
           System.out.println("Trip Details: ["+booking2.getSelectedTrip().getOrigin()+"] to ["+ booking2.getSelectedTrip().getDestination()+"]");
           System.out.println("Trip ID: "+booking2.getSelectedTrip().getTripID());
           System.out.println("Total Cost: £"+(booking2.getNumPassengers())*(selectedTrip.getFare()));
           System.out.println("=============================================\n\n\n\n");
       }
       else //The booking will fail if there are not enough seats available
       {
           System.out.println("\n\nBooking Failed!\n\n") ;
       }
       
       //Prints out all trips again with the available seats updated based on the booking
       System.out.println(cl);
    }
}