package se.mah.k3lara.skaneAPI.view;

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

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JScrollPane;



public final class GUI extends JFrame {

	private JPanel contentPane;
	 JTextField SearchFieldFran;

	 JTextField Fran_search;
	 JTextField Till_search;
	GUI g = this;
	private Parser p = new Parser();
	JTextArea resultFieldStation = new JTextArea();
	JTextArea ResultField = new JTextArea();
    Thread t2 = new ThreadJourney(p, this);
    Thread t1 = new ThreadStations(p, this);
		
		
	

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
		setBounds(100, 100, 546, 448);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 546, 520);
		contentPane.add(panel);
		panel.setLayout(null);
		
		SearchFieldFran = new JTextField();
		SearchFieldFran.setBounds(6, 68, 175, 22);
		panel.add(SearchFieldFran);
		SearchFieldFran.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(6, 134, 250, 270);
		panel.add(scrollPane);
		
	
		scrollPane.setViewportView(ResultField);
		ResultField.setText("");
		ResultField.setColumns(10);
		
		JButton SearchButton = new JButton("Sök Resa");
		SearchButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Thread t1 = new ThreadStations(p, g);
				t1.start();
				
				
				
				
			
			}
		});
				
			
		
		
		SearchButton.setBounds(0, 93, 201, 29);
		panel.add(SearchButton);
		
		
		
		JLabel lblNewLabel = new JLabel("Station");
		lblNewLabel.setBounds(6, 34, 121, 22);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Från");
		lblNewLabel_1.setBounds(286, 37, 72, 16);
		panel.add(lblNewLabel_1);
		
		Fran_search = new JTextField();
		Fran_search.setBounds(285, 62, 88, 28);
		panel.add(Fran_search);
		Fran_search.setColumns(10);
		
		JLabel HeadLabel = new JLabel("Rasmus Skånetrafik App");
		HeadLabel.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		HeadLabel.setBounds(172, 6, 201, 28);
		panel.add(HeadLabel);
		
		Till_search = new JTextField();
		Till_search.setBounds(380, 62, 102, 28);
		panel.add(Till_search);
		Till_search.setColumns(10);
		
		JLabel lblStation = new JLabel("Till");
		lblStation.setBounds(383, 37, 81, 16);
		panel.add(lblStation);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(268, 134, 259, 270);
		panel.add(scrollPane_1);
		
				scrollPane_1.setViewportView(resultFieldStation);
		
		JButton SearchButtonStation = new JButton("Sök Stationer");
		SearchButtonStation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Thread t2 = new ThreadJourney(p, g);
				t2.start();
			}
		});
		SearchButtonStation.setBounds(286, 93, 196, 29);
		panel.add(SearchButtonStation);
		
		
		
		
		
		
		
		
				
		
       }
	}



		
	
				
