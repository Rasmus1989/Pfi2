


import java.util.Calendar;
import java.util.GregorianCalendar;


public class ClockLogic implements ClockInterface {

	private DigitalClockGui clockGUI;
	private int alarmHour;
	private int alarmMinute;
	private String tid="";
	private String alarmTid="";
	private int hours;
	private int minutes;
	
	
	
	public ClockLogic (DigitalClockGui clockIn){
		this.clockGUI = clockIn;
		
		Thread t = new Clock_Thread(this); //This creates a thread
		//t.setName("UpdateThread");
		t.start(); //this starts a thread when ok with preparations etc
	}

	public void setAlarm(int hours, int minute){
alarmHour=hours;
alarmMinute=minute;

alarmTid=String.format("%02d",alarmHour) +" : " + String.format("%02d", alarmMinute);
//alarmTid=String.valueOf(alarmHour) +" : " + String.valueOf(alarmMinute);

clockGUI.setAlarm(alarmTid);
		
	}
	
	public void clearAlarm(){
		clockGUI.clear();
		
	}
	//@Override

	public void update(int hours, int minute, int second) {
		Calendar cal = new GregorianCalendar();
		hours=cal.get(Calendar.HOUR_OF_DAY);
		minute=cal.get(Calendar.MINUTE);
		second = cal.get(Calendar.SECOND);
		//tid = String.valueOf(hours) +":" + String.valueOf(minute) +":"+String.valueOf(second); // <- Detta fungerar också men ger ex. 2:22 ist för 02:22.
		tid = (String.format("%02d",hours)+" : "+String.format("%02d",minute)+" : "+String.format("%02d",second)); // retunerar "02" ist för "2".
		this.hours=hours;
		this.minutes=minute;
		
		
		System.out.println(tid);	
		clockGUI.setTimeOnLabel(tid);
		if((this.hours==alarmHour) && (this.minutes==alarmMinute) && (clockGUI.alarmIsSet==true)){
			clockGUI.alarm(true);
			
		}
		if(clockGUI.alarmIsOn==true){
			clockGUI.soundAlarm();
		}
		// TODO Auto-generated method stub

	}

	
	}