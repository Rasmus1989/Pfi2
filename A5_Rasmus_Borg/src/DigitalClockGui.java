import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.ImageIcon;
import javax.swing.border.BevelBorder;
import javax.swing.JTextField;
 
public class DigitalClockGui extends JFrame {
	
 
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
     
    private String time;
    private String _hours;
    private String _minutes;
    private String _seconds;
     
    private String myHour;
    private String myMin;
    private String mySec;
     
    int alarmHour;
    int alarmMinute;
    int alarmSecond ;
     
    private ClockLogic myClock;
    public JTextArea eventText;
    private JTextField SetTimeButton;
    private JTextField HourSet;
    private JTextField MinuteSet;
    private JTextField SecondSet;
    public JTextField TimeDisplay;
   

     
 
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
    	setResizable(false);
        myClock = new ClockLogic(DigitalClockGui.this);
        myClock.execute();//execute the Clock 
         
        setTitle("Alarm Clock");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 548, 486);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(0, 0, 128));
        contentPane.setForeground(Color.WHITE);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        JButton SetAlarmButton = new JButton("Set Alarm");
        SetAlarmButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        SetAlarmButton.setFont(new Font("American Typewriter", Font.BOLD, 17));
        SetAlarmButton.setBounds(94, 302, 271, 80);
        contentPane.add(SetAlarmButton);
        
        SetTimeButton = new JTextField();
        SetTimeButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        SetTimeButton.setBackground(new Color(176, 196, 222));
        SetTimeButton.setHorizontalAlignment(SwingConstants.CENTER);
        SetTimeButton.setFont(new Font("American Typewriter", Font.BOLD, 18));
        SetTimeButton.setText("Set Your Time...");
        SetTimeButton.setBounds(94, 58, 271, 86);
        contentPane.add(SetTimeButton);
        SetTimeButton.setColumns(10);
        
        HourSet = new JTextField();
        HourSet.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        HourSet.setBackground(new Color(255, 255, 255));
        HourSet.setBounds(94, 231, 71, 54);
        contentPane.add(HourSet);
        HourSet.setColumns(10);
        
        MinuteSet = new JTextField();
        MinuteSet.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        MinuteSet.setBackground(new Color(255, 255, 255));
        MinuteSet.setBounds(177, 231, 71, 54);
        contentPane.add(MinuteSet);
        MinuteSet.setColumns(10);
        
        SecondSet = new JTextField();
        SecondSet.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        SecondSet.setBackground(new Color(255, 255, 255));
        SecondSet.setBounds(260, 231, 71, 54);
        contentPane.add(SecondSet);
        SecondSet.setColumns(10);
        
        JButton HButton = new JButton("H");
        HButton.setFont(new Font("American Typewriter", Font.BOLD, 13));
        HButton.setBounds(94, 190, 71, 29);
        contentPane.add(HButton);
        
        JButton MButton = new JButton("M");
        MButton.setFont(new Font("American Typewriter", Font.BOLD, 13));
        MButton.setBounds(177, 190, 71, 29);
        contentPane.add(MButton);
        
        JButton SButton = new JButton("S");
        SButton.setFont(new Font("American Typewriter", Font.BOLD, 13));
        SButton.setBounds(260, 190, 65, 29);
        contentPane.add(SButton);
        
        JButton ClearButton = new JButton("Clear Alarm");
        ClearButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        ClearButton.setFont(new Font("American Typewriter", Font.BOLD, 16));
        ClearButton.setBounds(94, 404, 271, 29);
        contentPane.add(ClearButton);
        
        TimeDisplay = new JTextField("sdrsd");
        TimeDisplay.setText("hejsan");
        
        
        	
        	
    
        TimeDisplay.setFont(new Font("American Typewriter", Font.BOLD, 16));
        TimeDisplay.setBounds(389, 189, 134, 96);
        contentPane.add(TimeDisplay);
        TimeDisplay.setColumns(10);
        
        
    }
     
    public void invokeAlarm(){
    
    }
    
    
    public void setTime(int hour, int minutes, int seconds){
         
        /**
         * this method makes the clock work on the ClockLabel
         */
         
        _hours=Integer.toString(hour);
        _minutes=Integer.toString(minutes);
        _seconds=Integer.toString(seconds);
         
        /**
         * the if help to put a 0 if it is necessary
         */
         
        if(hour < 10){
                
               _hours = "0" + _hours;
           }
            
           if(minutes < 10)
           {
               _minutes = "0" + _minutes;
           }
           if(seconds < 10)
           {
               _seconds = "0" + _seconds;
           }
         
        time = _hours + ":" +   _minutes + ":" + _seconds;
         
       
         
    }
     
}