/*																																											//Klassen
Rasmus Nilsson Borg
11/02-15
IDK14
*/

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;


public class PetShop_gui extends JFrame {
public Human human;

	private JPanel contentPane;
	private JTextField txtRasmus;
	private JTextField txtMolly;
	private JPanel Panel;
	private JPanel panel_1;
	private JTextArea textArea_1;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PetShop_gui frame = new PetShop_gui();
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
	public PetShop_gui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("New Human");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				human = new Human(txtRasmus.getText());
			}
		});
		btnNewButton.setBounds(27, 26, 117, 29);
		contentPane.add(btnNewButton);
		
	    
			
			
		
		
		JButton btnNewButton_1 = new JButton("New Dog");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			human.buyDog(new Dog(txtMolly.getText()));
			}
		});
		btnNewButton_1.setBounds(27, 67, 117, 29);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Print Info");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea_1.setText(human.getName() + " owns a dog called: ");
				textArea_1.append(human.dog.name);
				
			
			}
		});
		btnNewButton_2.setBounds(27, 108, 117, 29);
		contentPane.add(btnNewButton_2);
	
		
		txtRasmus = new JTextField();
		txtRasmus.setText("Rasmus");
		txtRasmus.setBounds(172, 25, 134, 28);
		contentPane.add(txtRasmus);
		txtRasmus.setColumns(10);
		
		txtMolly = new JTextField();
		txtMolly.setText("Molly");
		txtMolly.setBounds(172, 66, 134, 28);
		contentPane.add(txtMolly);
		txtMolly.setColumns(10);
		
		Panel = new JPanel();
		Panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Info", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		Panel.setBounds(21, 141, 396, 63);
		contentPane.add(Panel);
		Panel.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(6, 20, 384, 37);
		Panel.add(textArea);
		
		panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Error Message", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(21, 201, 396, 66);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		textArea_1 = new JTextArea();
		textArea_1.setBounds(6, 22, 384, 38);
		panel_1.add(textArea_1);
	}
}
