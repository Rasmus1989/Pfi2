import java.awt.FlowLayout;

import javax.swing.*;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class calculator_gui implements ActionListener {

	JFrame frame = new JFrame("Calculator");
	JPanel panel = new JPanel();

	JTextArea text = new JTextArea(1, 20);
	JButton but1 = new JButton("1");
	JButton but2 = new JButton("2");
	JButton but3 = new JButton("3");
	JButton but4 = new JButton("4");
	JButton but5 = new JButton("5");
	JButton but6 = new JButton("6");
	JButton but7 = new JButton("7");
	JButton but8 = new JButton("8");
	JButton but9 = new JButton("9");
	JButton but0 = new JButton("0");

	JButton butplus = new JButton("+");
	JButton butminus = new JButton("-");
	JButton butmulti = new JButton("*");
	JButton butdiv = new JButton("/");
	JButton buteq = new JButton("=");

	JButton butclear = new JButton("c");

	Double number1, number2, result;
	int plusc = 0, minusc = 0, multic = 0, divc = 0;

	/**
	 * @wbp.parser.entryPoint
	 */
	public void gui() {
		frame.setVisible(true);
		frame.setSize(251, 257);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.getContentPane().add(panel);
		panel.setLayout(null);
		text.setBounds(5, 5, 240, 16);

		panel.add(text);
		but1.setBounds(7, 26, 75, 29);

		panel.add(but1);
		but2.setBounds(87, 26, 75, 29);
		panel.add(but2);
		but3.setBounds(167, 26, 75, 29);
		panel.add(but3);
		but4.setBounds(7, 60, 75, 29);
		panel.add(but4);
		but5.setBounds(87, 60, 75, 29);
		panel.add(but5);
		but6.setBounds(167, 60, 75, 29);
		panel.add(but6);
		but7.setBounds(7, 94, 75, 29);
		panel.add(but7);
		but8.setBounds(87, 94, 75, 29);
		panel.add(but8);
		but9.setBounds(167, 94, 75, 29);
		panel.add(but9);
		but0.setBounds(87, 128, 75, 29);
		panel.add(but0);
		butplus.setBounds(7, 128, 75, 29);

		panel.add(butplus);
		butminus.setBounds(167, 128, 75, 29);
		panel.add(butminus);
		butmulti.setBounds(7, 162, 75, 29);
		panel.add(butmulti);
		butdiv.setBounds(87, 162, 75, 29);
		panel.add(butdiv);
		buteq.setBounds(167, 162, 75, 29);
		panel.add(buteq);
		butclear.setBounds(87, 196, 75, 29);
		panel.add(butclear);

		but1.addActionListener(this);
		but2.addActionListener(this);
		but3.addActionListener(this);
		but4.addActionListener(this);
		but5.addActionListener(this);
		but6.addActionListener(this);
		but7.addActionListener(this);
		but8.addActionListener(this);
		but9.addActionListener(this);
		but0.addActionListener(this);

		butplus.addActionListener(this);
		butminus.addActionListener(this);
		butmulti.addActionListener(this);
		butdiv.addActionListener(this);
		buteq.addActionListener(this);
		butclear.addActionListener(this);

	}

	public void actionPerformed(ActionEvent e) {

		Object source = e.getSource();

		if (source == butclear) {
			number1 = 0.0;
			number2 = 0.0;
			text.setText("");
		}

		if (source == but1) {
			text.append("1");
		}

		if (source == but2) {
			text.append("2");
		}

		if (source == but3) {
			text.append("3");
		}

		if (source == but4) {
			text.append("4");
		}

		if (source == but5) {
			text.append("5");
		}

		if (source == but6) {
			text.append("6");
		}

		if (source == but7) {
			text.append("7");
		}

		if (source == but8) {
			text.append("8");
		}

		if (source == but9) {
			text.append("9");
		}

		if (source == but0) {
			text.append("0");

		}

		if (source == butplus) {

			number1 = number_reader1();
			// text.setText("+");
			text.setText("");
			plusc = 1;
			minusc = 0;
			multic = 0;
			divc = 0;
		}

		if (source == butminus) {

			number1 = number_reader1();
			// text.setText("-");
			text.setText("");
			plusc = 0;
			minusc = 1;
			multic = 0;
			divc = 0;
		}
		if (source == butmulti) {

			number1 = number_reader1();
			// text.setText("*");
			text.setText("");
			plusc = 0;
			minusc = 0;
			multic = 1;
			divc = 0;
		}
		if (source == butdiv) {

			number1 = number_reader1();
			// text.setText("/");
			text.setText("");
			plusc = 0;
			minusc = 0;
			multic = 0;
			divc = 1;
		}

		if (source == buteq) {

			number2 = number_reader1();

			if (plusc > 0) {
				result = number1 + number2;
				text.setText(Double.toString(result));
			}
			if (minusc > 0) {
				result = number2 - number1;
				text.setText(Double.toString(result));

			}
			if (multic > 0) {

				result = number1 * number2;
				text.setText(Double.toString(result));

			}
			if (divc > 0) {
				result = number1 / number2;
				text.setText(Double.toString(result));

			}
		}
	}

	public double number_reader1() {

		Double num1;
		String s;
		s = text.getText();
		num1 = Double.valueOf(s);

		return num1;

	}

}
