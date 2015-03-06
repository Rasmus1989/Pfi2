package se.mah.k3lara.skaneAPI.view;

import java.util.Calendar;

import se.mah.k3lara.skaneAPI.control.Constants;
import se.mah.k3lara.skaneAPI.model.Journey;
import se.mah.k3lara.skaneAPI.model.Journeys;
import se.mah.k3lara.skaneAPI.xmlparser.Parser;

public class ThreadJourney extends Thread {

	public Parser parser;
	public GUI gui;

	public ThreadJourney(Parser p, GUI g) {
		this.parser = p;
		this.gui = g;
	}

	@Override
	public void run() {
		

		gui.resultFieldStation.setText(null);
		gui.resultFieldStation.setText("Loading...");

		String searchURL = Constants.getURL(gui.Fran_search.getText(),
				gui.Till_search.getText(), 1);
		Journeys journeys = Parser.getJourneys(searchURL);
		for (Journey journey : journeys.getJourneys()) {

			gui.resultFieldStation.setText("");
			String time = journey.getDepDateTime().get(Calendar.HOUR_OF_DAY)
					+ ":" + journey.getDepDateTime().get(Calendar.MINUTE);
			gui.resultFieldStation.append(journey.getStartStation() + " - "
					+ journey.getEndStation() + " ");
		
			String zero = journey.getDepTimeDeviation();
		
		
			if (zero.contentEquals("0")) {
				gui.resultFieldStation.append(" Avgår " + time + ", det är om "
						+ journey.getTimeToDeparture()
						+ " minuter, inga förseningar.");
			} else {
				gui.resultFieldStation.append(" Avgår " + time + ", det är om "
						+ journey.getTimeToDeparture()
						+ " minuter. Avresan är "
						+ journey.getDepTimeDeviation() + " min sen.");
			}

		}
	}
}
