package se.mah.k3lara.skaneAPI.view;

import java.util.Calendar;

import se.mah.k3lara.skaneAPI.model.Line;
import se.mah.k3lara.skaneAPI.model.Lines;
import se.mah.k3lara.skaneAPI.model.Station;
import se.mah.k3lara.skaneAPI.xmlparser.Parser;

public class Update extends Thread {

	//private Parser parser;
	private GUI gui;
	public boolean running=true;

	public Update(GUI g) {
		
		this.gui = g;
	}

	@Override
	public void run() {
		 while (running) {
			 
			
		Lines lines = Parser.getStationResults(new Station("80046"));
		gui.LinjeField.setText("test");
		gui.AvgarField.setText("test");
		gui.DestinationField.setText("");
		gui.ForseningField.setText("");
		for (Line l : lines.getLines()) {
		

	if(l.getStopPoint().equals("B")){
			gui.LinjeField.append(l.getLineName()+"\n");
			gui.DestinationField.append(l.getTowards()+"\n");
			
			int inHour = l.getDepTime().get(Calendar.HOUR_OF_DAY);
			int inMinute = l.getDepTime().get(Calendar.MINUTE);
			
			gui.AvgarField.append(String.format("%02d", inHour)+ ":" + String.format("%02d", inMinute)+"\n");
		
		
			if(l.getDepTimeDeviation()==""){
				gui.ForseningField.append("\n");
			}else{
			gui.ForseningField.append(l.getDepTimeDeviation() +" min \n");
			
			}
	}
		 }
		try{ 
			   Thread.sleep(1000);
			   
		   }catch (InterruptedException ex){
			   
			}
		 }
	}
}