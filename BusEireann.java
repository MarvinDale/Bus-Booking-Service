import java.util.ArrayList;
/**
  BusEireann, vendor
  Where the trips for BusEireann are added
 */
public class BusEireann extends Vendor //extends keyword sets Vendor as the parent class of this class
{  
  public BusEireann()
  {
      super(); //super method is called to get all the informaton from the abstract class
      
      company ="Bus-Eireann";
      
      //Creating trip objects
      Trip trip1 = new Trip(1225,"Galway","Dublin","11/11/2019","10.00am","11/11/2019",
      "12.30pm",15,60);
      
      Trip trip2 = new Trip(5678,"Limerick","Cork","11/11/2019","10.00am","11/11/2019",
      "11.00pm",7,60);
      
      Trip trip3 = new Trip(9101,"Mayo","Derry","11/11/2019","9.00am","11/11/2019",
      "2.30pm",20,60);
      
      //Adding the trip objects to the arraylist
      trips.add(trip1);
      trips.add(trip2);
      trips.add(trip3);
  }
}