import java.util.Calendar;

import java.util.List;
 
import javax.swing.SwingWorker;
 
public class ClockLogic extends SwingWorker <Void, Void> implements ClockInterface{
     
    public DigitalClockGui clock;
    public int time_hours;
    public int time_minutes;
    public int time_seconds;
    public static int alarm_hours=10;
    public static int alarm_minutes;
    public static int alarm_seconds;

    private boolean alarm;
    
     
    public ClockLogic(DigitalClockGui gui){
         
        clock = gui;
        Thread myThread= new Clock_Thread(ClockLogic.this);
        myThread.start();
        	
        
    }
     
    @Override
    protected Void doInBackground() throws Exception {
         
        while(isCancelled() == false)
        {
            /**
             * This If check if the numbers form the textAreas match the current time so activates the Alarm
             */
            if(time_hours == alarm_hours && time_minutes == alarm_minutes && time_seconds == alarm_seconds && alarm == true){
                 
                clock.invokeAlarm();
                System.out.println("WAKE UP!");
                 
            }
        this.publish();
     
        }
 
        return null;
    }
     
     
    protected void process(List<Void> chunks) {
         
        /**
         * Gets the time from the computer that the program is running
         */
         
        Calendar myTime = Calendar.getInstance();
        time_hours = myTime.get(Calendar.HOUR_OF_DAY);
        time_minutes = myTime.get(Calendar.MINUTE);
        time_seconds = myTime.get(Calendar.SECOND);
          
        clock.setTime(time_hours, time_minutes, time_seconds);
         
 
    }
     
     
    public void setAlarm(int hours, int minutes, int seconds){
        alarm_hours = hours;
        alarm_minutes = minutes;
        alarm_seconds = seconds;
    }
     
    public void setBoolean(boolean Alarm){
        alarm = Alarm;
    }
     
    
    public void reset(){
    	alarm_hours = 0;
        alarm_minutes = 0;
        alarm_seconds = 0;
    	
    }

	@Override
	public void update(int hours, int minutes, int seconds) {
	clock.TimeDisplay.setText(String.valueOf(hours)+ String.valueOf(minutes)+ String.valueOf(seconds) );
	
		System.out.println(String.valueOf(hours)+ String.valueOf(minutes)+ String.valueOf(seconds) );
		
	}

	
    
 
}
