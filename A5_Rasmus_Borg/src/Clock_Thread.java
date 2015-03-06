

import java.util.Calendar;
//import java.util.GregorianCalendar;

public class Clock_Thread extends Thread {
// Calendar cal = new GregorianCalendar();

public boolean running = true;

private ClockInterface clockInterface; 

   public Clock_Thread(ClockInterface ci){
	 this.clockInterface=ci;
   }

   public void run() {
	  // long timer = System.currentTimeMillis();
	   while (running) {   
		Calendar now = Calendar.getInstance();
		clockInterface.update(now.get(Calendar.HOUR_OF_DAY), now.get(Calendar.MINUTE),now.get(Calendar.SECOND));
		
		   try{
			   Thread.sleep(1000);
			   
		   }catch (InterruptedException ex){
	   }
   }  
}
}