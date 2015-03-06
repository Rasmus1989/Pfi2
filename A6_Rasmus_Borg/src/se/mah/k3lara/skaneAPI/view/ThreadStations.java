package se.mah.k3lara.skaneAPI.view;
import java.util.ArrayList;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;

import se.mah.k3lara.skaneAPI.control.Constants;
import se.mah.k3lara.skaneAPI.model.Journey;
import se.mah.k3lara.skaneAPI.model.Journeys;
import se.mah.k3lara.skaneAPI.model.Station;
import se.mah.k3lara.skaneAPI.xmlparser.Parser;




public class ThreadStations extends Thread{
	private GUI gui;	
	private Parser parser;

		
		public ThreadStations(Parser p, GUI g){
		this.parser = p;
		this.gui = g;
		

}	
	
	public ThreadStations(){
		
		
	}
	
	public void run(){

	    gui.ResultField.setText("Loading...");
	    
		ArrayList <Station> myList = new ArrayList <Station>();
		
		myList.addAll(Parser.getStationsFromURL(gui.SearchFieldFran.getText()));
		gui.ResultField.setText(null);
		
		
		for (Station station : myList){
			gui.ResultField.append(station.getStationName()+ " number: "
		   + station.getStationNbr()+"\n");
		
			
		}
	}
	
	
	
}
