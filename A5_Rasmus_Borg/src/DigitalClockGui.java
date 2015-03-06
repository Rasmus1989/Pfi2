

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;



import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.util.Arrays;
import java.awt.Color;
import java.awt.Toolkit;

public class DigitalClockGui extends JFrame {

	private JPanel contentPane;
	public JLabel timeLabel;
	public JLabel alarmTime;
	private ClockLogic clockLogic;
	public String time = "";
	public String setTheAlarm = "";
	private JTextField alarmHour;
	private JTextField alarmMinute;
public boolean alarmIsOn=false;
public boolean alarmIsSet=false;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DigitalClockGui frame = new DigitalClockGui();
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

	public DigitalClockGui() {
		setTitle("Alarm Clock");
		

		final ClockLogic klocka = new ClockLogic(this);

		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 411, 300);
		contentPane = new JPanel();
		
		contentPane.setBackground(Color.BLUE);
		
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		

		final JLabel timeLabel = new JLabel("The time is now...");
		timeLabel.setForeground(Color.GRAY);
		timeLabel.setFont(new Font("Futura", Font.PLAIN, 36));

		timeLabel.setBounds(21, 28, 366, 49);
		contentPane.add(timeLabel);

		
		
		this.timeLabel = timeLabel;

		final JLabel alarmTime = new JLabel("No Alarm Set!");
		alarmTime.setForeground(Color.GRAY);
		alarmTime.setFont(new Font("Futura", Font.PLAIN, 14));
		alarmTime.setBounds(153, 234, 91, 20);
		contentPane.add(alarmTime);

		this.alarmTime = alarmTime;
		
		JButton btnHour = new JButton("Set Alarm");
		btnHour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if ((Arrays.asList(Constants.ALARMHOURS).contains(alarmHour.getText())) && (Arrays.asList(Constants.ALARMMINUTES).contains(alarmMinute.getText()))){
				
					String setHour = alarmHour.getText();
					String setMinute = alarmMinute.getText();
					// klocka.setAlarm(13, 23);
					// klocka.setAlarm(23, 23);
					klocka.setAlarm(Integer.valueOf(setHour), (Integer.valueOf(setMinute)));
					alarmIsSet=true;
					// Integer.valueOf(setMinute));
					contentPane.setBackground(Color.MAGENTA);	
				}else{
					System.out.println("Alarm Hour must be 00-23, Alarm minute must be 00-59");
				}
				
			}
		});
		btnHour.setBounds(270, 175, 117, 20);
		contentPane.add(btnHour);

		alarmHour = new JTextField();
		alarmHour.setBounds(46, 175, 69, 20);
		contentPane.add(alarmHour);
		alarmHour.setColumns(10);

		alarmMinute = new JTextField();
		alarmMinute.setBounds(189, 175, 69, 20);
		contentPane.add(alarmMinute);
		alarmMinute.setColumns(10);
		
		JLabel lblHour = new JLabel("Hour");
		lblHour.setFont(new Font("Futura", Font.PLAIN, 13));
		lblHour.setForeground(Color.GRAY);
		lblHour.setBounds(6, 175, 61, 20);
		contentPane.add(lblHour);
		
		JLabel lblMinute = new JLabel("Minute");
		lblMinute.setFont(new Font("Futura", Font.PLAIN, 13));
		lblMinute.setForeground(Color.GRAY);
		lblMinute.setBounds(134, 175, 43, 20);
		contentPane.add(lblMinute);
		
		JButton btnClearAlarm = new JButton("Clear Alarm");
		btnClearAlarm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				klocka.clearAlarm();
				alarmIsSet=false;
				
			}
		});
		btnClearAlarm.setBounds(270, 234, 117, 20);
		contentPane.add(btnClearAlarm);
		
		JLabel lblAlarmSetTo = new JLabel("Alarm at:");
		lblAlarmSetTo.setFont(new Font("Futura", Font.PLAIN, 13));
		lblAlarmSetTo.setForeground(Color.GRAY);
		lblAlarmSetTo.setBounds(81, 234, 61, 20);
		contentPane.add(lblAlarmSetTo);

	}

	public void setTimeOnLabel(String time) {
		timeLabel.setText(time);

	}

	public void setAlarm(String setTheAlarm) {
		System.out.println("Alarm Set to" +" " + setTheAlarm);
alarmTime.setText(setTheAlarm);
	}
	public void clear() {
		System.out.println("Alarm Cleared");
alarmTime.setText("No Alarm");
contentPane.setBackground(Color.CYAN);
alarmIsOn=false;

	}
	public void alarm(boolean activateAlarmIn){
		if(activateAlarmIn==true)
			alarmIsOn=true;
		
	}
	public void soundAlarm(){
		
		contentPane.setBackground(Color.RED);
	}
}