import java.util.ArrayList;
/**
 * GoBus, vendor
 */
public class GoBus extends Vendor//extends keyword sets Vendor as the parent class of this class

{  
  public GoBus()
  {
      super();//super method is called to get all the informaton from the abstract class
      
      company ="GoBus";
      
      //Creating trip objects
      Trip trip1 = new Trip(7923,"Galway","Donegal","11/11/2019","11.00am","11/11/2019",
      "2.30pm",30,60);
      
      Trip trip2 = new Trip(2346,"Limerick","Donegal","11/11/2019","11.00am","11/11/2019",
      "4.40pm",40,60);
      
      Trip trip3 = new Trip(5082,"Dublin","Mayo","11/11/2019","10.00am","11/11/2019",
      "1.30m",20,60);
      
      //Adding the trip objects to the arraylist
      trips.add(trip1);
      trips.add(trip2);
      trips.add(trip3);
  }
}
