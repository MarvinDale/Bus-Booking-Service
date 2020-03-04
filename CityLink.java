import java.util.ArrayList;
/**
 * CityLink, vendor
 * Where the trips for BusEireann are added
 */
public class CityLink extends Vendor//extends keyword sets Vendor as the parent class of this class
{  
  public CityLink()
  {
      super();//super method is called to get all the informaton from the abstract class
      
      company ="City-Link";
      
      //Creating trip objects
      Trip trip1 = new Trip(0466,"Donegal","Mayo","11/11/2019","1.00pm","11/11/2019",
      "3.30pm",25,60);
      
      Trip trip2 = new Trip(7878,"Sligo","Donegal","11/11/2019","1.00pm","11/11/2019",
      "1.40pm",10,60);
      
      Trip trip3 = new Trip(4489,"Cork","Kerry","11/11/2019","2.00pm","11/11/2019",
      "2.30pm",7,60);
      
      //Adding the trip objects to the arraylist
      trips.add(trip1);
      trips.add(trip2);
      trips.add(trip3);
  }
}