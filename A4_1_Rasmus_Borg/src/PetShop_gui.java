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
public Dog dog;

	private JPanel contentPane;
	private JTextField txtRasmus;
	private JTextField txtMolly;
	private JPanel Panel;
	private JPanel panel_1;
	private JTextArea Info;
	private JTextArea textArea;
	

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
		Panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Error Message", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		Panel.setBounds(21, 141, 396, 63);
		contentPane.add(Panel);
		Panel.setLayout(null);
		
		
		
		panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Info", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(21, 201, 396, 66);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		

		Info = new JTextArea();
		Info.setBounds(6, 22, 384, 38);
		panel_1.add(Info);
	
		
		final JTextArea error = new JTextArea();
		error.setBounds(6, 20, 384, 37);
		Panel.add(error);
		
		
		

		
		JButton btnNewButton = new JButton("New Owner");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				if(txtRasmus.getText().length()<=3){
					error.setText("Name too short");
				}else{human = new Human(txtRasmus.getText());
				}
				
			}
		});
		btnNewButton.setBounds(27, 26, 117, 29);
		contentPane.add(btnNewButton);
		
	    
			
			
		
		
		JButton btnNewButton_1 = new JButton("New Dog");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dog = new Dog(txtMolly.getText());
				if (human==null){
					Info.setText("A dog need an owner fool!");
					}else{human.buyDog(new Dog(txtMolly.getText()));
						
					}
				
			}
		});
		btnNewButton_1.setBounds(27, 67, 117, 29);
		contentPane.add(btnNewButton_1);
		
		
		JButton btnNewButton_2 = new JButton("Print Info");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(human!=null){
				Info.setText("");
				error.setText("");
				
				
				Info.setText(human.getName() + " owns a dog called ");
				if(human.dog==null){
					error.setText("there´s no dog");
				}else{
				Info.append(human.dog.name);
				}
				if(dog==null){
					Info.setText("can't find this dog");
					
				}
				
				}
			}
		});
		btnNewButton_2.setBounds(27, 108, 117, 29);
		contentPane.add(btnNewButton_2);
	

		
	}
}
