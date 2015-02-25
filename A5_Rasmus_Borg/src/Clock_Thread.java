import java.awt.*;

import java.util.*;

public class Clock_Thread extends Thread {
	public ClockInterface myInterface;
  String currentTime;
  Label labelToChange;
  boolean keepGoing = true;

  public Clock_Thread(ClockLogic myLogic){
	  super();
	  myInterface = myLogic;
	 System.out.println("The Time is1: ");
	 
    //labelToChange = lbl;
  } // end constructor

  public void stopLooping(){
    keepGoing = false;
  } // end stopLooping

  public void run(){
    while (keepGoing){
    	try {
			Thread.sleep(900);
			myInterface.update(12, 12, 12);
			System.out.println(	  );
		} catch (Exception e) {
			 
			e.printStackTrace();
		}
      //currentTime = String.valueOf(new Date());
      //labelToChange.setText(currentTime);
    } // end while loop
  } // end run

} // end class def