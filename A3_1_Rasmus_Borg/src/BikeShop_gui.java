import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;


public class BikeShop_gui extends JFrame {

	private JPanel contentPane;
	private JTextField textColor;
	private JTextField textSize;
	private JTextField textPrice;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BikeShop_gui frame = new BikeShop_gui();
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
	public BikeShop_gui() {
		final BikeStore RasmusBikes=new BikeStore();
		RasmusBikes.addBike("green", "500", "6000");
		RasmusBikes.addBike("green", "2", "32000");
		RasmusBikes.addBike("red", "2", "32000");
		RasmusBikes.addBike("orange", "2", "32000");
		RasmusBikes.addBike("white", "2", "32000");
		RasmusBikes.addBike("green", "66", "666");
		System.out.println(RasmusBikes.getAllBikes());

		
		
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 341);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 38, 414, 186);
		contentPane.add(scrollPane);
		
		final JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		textArea.setText(RasmusBikes.getAllBikes());

		
		JButton btnNewButton = new JButton("Show Inventory");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textArea.setText(RasmusBikes.getAllBikes());
			}
		});
		btnNewButton.setBounds(20, 269, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnAddBike = new JButton("add bike");
		btnAddBike.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RasmusBikes.addBike(textColor.getText(), textSize.getText(), textPrice.getText());
				textArea.setText(RasmusBikes.getAllBikes());
			}
		});
		btnAddBike.setBounds(117, 269, 89, 23);
		contentPane.add(btnAddBike);
		
		textColor = new JTextField();
		textColor.setBounds(213, 270, 58, 20);
		contentPane.add(textColor);
		textColor.setColumns(10);
		
		textSize = new JTextField();
		textSize.setBounds(281, 270, 58, 20);
		contentPane.add(textSize);
		textSize.setColumns(10);
		
		textPrice = new JTextField();
		textPrice.setBounds(349, 270, 58, 20);
		contentPane.add(textPrice);
		textPrice.setColumns(10);
		
		JLabel lblHussamscyklar = new JLabel("Rasmus´s Bikes!!");
		lblHussamscyklar.setBounds(67, 11, 158, 14);
		contentPane.add(lblHussamscyklar);
		
		JLabel lblColor = new JLabel("Color");
		lblColor.setBounds(225, 253, 34, 14);
		contentPane.add(lblColor);
		
		JLabel lblSize = new JLabel("Size");
		lblSize.setBounds(297, 253, 34, 14);
		contentPane.add(lblSize);
		
		JLabel lblPrice = new JLabel("Price");
		lblPrice.setBounds(360, 253, 34, 14);
		contentPane.add(lblPrice);
	}
}
