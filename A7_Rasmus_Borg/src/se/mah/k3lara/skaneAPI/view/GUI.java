package se.mah.k3lara.skaneAPI.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JLabel;

import se.mah.k3lara.skaneAPI.model.Line;
import se.mah.k3lara.skaneAPI.model.Lines;
import se.mah.k3lara.skaneAPI.model.Station;
import se.mah.k3lara.skaneAPI.xmlparser.Parser;

import java.util.ArrayList;
import java.util.Calendar;
import java.lang.Thread;
import java.awt.Font;
import java.awt.Color;

public class GUI extends JFrame {

	// Skapar arraylisten searchStations av typen Station.
	public ArrayList<Station> searchStations = new ArrayList<Station>();
	public ArrayList<Station> fromArray = new ArrayList<Station>();
	public ArrayList<Station> toArray = new ArrayList<Station>();

	private JPanel contentPane;
	private JPanel panel_1;
	public JTextArea AvgarField = new JTextArea();
	public JTextArea LinjeField = new JTextArea();
	public JTextArea DestinationField = new JTextArea();
	public JTextArea ForseningField = new JTextArea();
	

	GUI g = this;

	
	
	Thread tJ = new Update(this);
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
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
		Thread tJ = new Update(this);
		tJ.start();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 911, 454);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		panel_1 = new JPanel();
		panel_1.setBackground(Color.DARK_GRAY);
		panel_1.setBounds(6, 6, 897, 420);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		//LinjeField = new JTextArea();
		LinjeField.setEditable(false);
		LinjeField.setForeground(Color.YELLOW);
		LinjeField.setBackground(Color.DARK_GRAY);
		LinjeField.setFont(new Font("LiHei Pro", Font.PLAIN, 18));
		LinjeField.setBounds(19, 135, 59, 233);
		panel_1.add(LinjeField);
		
		//DestinationField = new JTextArea();
		DestinationField.setEditable(false);
		DestinationField.setForeground(Color.YELLOW);
		DestinationField.setBackground(Color.DARK_GRAY);
		DestinationField.setFont(new Font("LiHei Pro", Font.PLAIN, 18));
		DestinationField.setBounds(219, 135, 393, 233);
		panel_1.add(DestinationField);
		
		//AvgarField = new JTextArea();
		AvgarField.setEditable(false);
		AvgarField.setForeground(Color.YELLOW);
		AvgarField.setBackground(Color.DARK_GRAY);
		AvgarField.setFont(new Font("LiHei Pro", Font.PLAIN, 18));
		AvgarField.setBounds(660, 135, 107, 233);
		panel_1.add(AvgarField);
		
		JLabel lblNewLabel = new JLabel("Ubåtshallen");
		lblNewLabel.setForeground(Color.YELLOW);
		lblNewLabel.setFont(new Font("LiHei Pro", Font.BOLD, 40));
		lblNewLabel.setBounds(315, 34, 286, 64);
		panel_1.add(lblNewLabel);
		
		JLabel lblLinje = new JLabel("Linje");
		lblLinje.setForeground(Color.YELLOW);
		lblLinje.setFont(new Font("LiHei Pro", Font.BOLD, 20));
		lblLinje.setBounds(19, 98, 69, 32);
		panel_1.add(lblLinje);
		
		JLabel lblDestination = new JLabel("Destination\n");
		lblDestination.setForeground(Color.YELLOW);
		lblDestination.setFont(new Font("LiHei Pro", Font.BOLD, 20));
		lblDestination.setBounds(376, 82, 133, 64);
		panel_1.add(lblDestination);
		
		JLabel lblAvgr = new JLabel("Försening");
		lblAvgr.setForeground(Color.YELLOW);
		lblAvgr.setFont(new Font("LiHei Pro", Font.BOLD, 20));
		lblAvgr.setBounds(791, 82, 100, 64);
		panel_1.add(lblAvgr);
		
		JLabel label = new JLabel("Avgår");
		label.setForeground(Color.YELLOW);
		label.setFont(new Font("LiHei Pro", Font.BOLD, 20));
		label.setBounds(698, 82, 81, 64);
		panel_1.add(label);
		
		//ForseningField = new JTextArea();
		ForseningField.setEditable(false);
		ForseningField.setFont(new Font("LiHei Pro", Font.PLAIN, 18));
		ForseningField.setBackground(Color.DARK_GRAY);
		ForseningField.setForeground(Color.YELLOW);
		ForseningField.setBounds(801, 134, 90, 237);
		panel_1.add(ForseningField);

				
	}


public void test(){
	Lines lines = Parser.getStationResults(new Station("80046"));
	//DestinationField.setText(lines.getLines().get(0).getLine());
	for (Line l : lines.getLines()) {
		

		if(l.getStopPoint().equals("B")){
				LinjeField.append(l.getLineName()+"\n");
				DestinationField.append(l.getTowards()+"\n");
				
				int inHour = l.getDepTime().get(Calendar.HOUR_OF_DAY);
				int inMinute = l.getDepTime().get(Calendar.MINUTE);
				
				AvgarField.append(String.format("%02d", inHour)+ ":" + String.format("%02d", inMinute)+"\n");
			
			
				if(l.getDepTimeDeviation()==""){
					ForseningField.append("\n");
				}else{
				ForseningField.append(l.getDepTimeDeviation() +" min \n");
				
				}
		}
			 }

}}