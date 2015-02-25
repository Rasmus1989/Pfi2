
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;

import se.mah.k3lara.skaneAPI.control.Constants;
import se.mah.k3lara.skaneAPI.model.Journey;

import se.mah.k3lara.skaneAPI.model.Journeys;
import se.mah.k3lara.skaneAPI.model.Station;
import se.mah.k3lara.skaneAPI.xmlparser.Parser;



public final class GUI extends JFrame {

	private JPanel contentPane;
	private JTextField SearchField;
	private JTextField ResultField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI frame = new GUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 450, 272);
		contentPane.add(panel);
		panel.setLayout(null);
		
		SearchField = new JTextField();
		SearchField.setBounds(6, 6, 424, 22);
		panel.add(SearchField);
		SearchField.setColumns(10);
		
		JButton SearchButton = new JButton("Search Journey");
		SearchButton.setBounds(6, 27, 424, 29);
		panel.add(SearchButton);
		
		ResultField = new JTextField();
		ResultField.setBounds(6, 56, 438, 210);
		panel.add(ResultField);
		ResultField.setColumns(10);
		
		String text=SearchField.getText();// sparar i textvariabel
		System.out.println(text);
		String myString=Constants.getURL(text,"81216", 20); //Hämtar info om sökningen och får en väldigt lång adress
		Journeys journeys = Parser.getJourneys(myString); // UML // lägg i skånetrafiken API få ut resor översatt från xlm
		System.out.println("hejhej");
		//journeys //innehåller data i olika variabler
		
		
		for (Journey journey : journeys.getJourneys()){
			ResultField.setText("Hejsan hoppsan Lillebror");
			ResultField.append(String.valueOf(journey.getStartStation()));
			ResultField.append(String.valueOf(journey.getEndStation()));
			ResultField.append(String.valueOf(journey.getDepDateTime()));
			ResultField.append(String.valueOf(journey.getDepDateTime().get(Calendar.MINUTE)));
			
			System.out.println("blablablablabla");
			System.out.print(journey.getStartStation());
			System.out.print(journey.getEndStation());
			String time = journey.getDepDateTime().get(Calendar.HOUR_OF_DAY)+":" + journey.getDepDateTime().get(Calendar.MINUTE)));
			System.out.println(" Departs " + time +"that is in"+journey.getTimeToDeparture() 
			                   + "minutes. And it is " + journey.getDepTimeDeviation()+ " min late");
			
			
		}
		
		
		
	}
	
	
}
