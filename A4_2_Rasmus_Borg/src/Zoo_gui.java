import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JTextArea;


public class Zoo_gui extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Zoo_gui frame = new Zoo_gui();
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
	public Zoo_gui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 526, 310);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		 ArrayList<Animal> zoo = new ArrayList<Animal>();
			
			zoo.add(new Dog ("canis lupus", 4, true));
		    zoo.add(new Dog ("canis lupus", 4, false, "Rex"));
		    Cat cat = new Cat("lynx lynx ", 3, 9);
		    cat.setFriendlyName("Figaro");
		    zoo.add(cat);
		    zoo.add(new Snake ("boa konstriktor", false));
		    Snake snake = new Snake ("boa", false);
		    snake.setFriendlyName("Ka");
		    zoo.add(snake);
		    
			
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Zoo", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(0, 18, 520, 264);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(6, 18, 510, 238);
		panel.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		textArea.setToolTipText("");
		scrollPane.setViewportView(textArea);
		for (Animal animal : zoo){
			textArea.append(animal.getInfo()+"\n");
		}
	}

}
