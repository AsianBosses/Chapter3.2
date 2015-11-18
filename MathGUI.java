import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/*
* Create an application having two text fields for user to input two numbers with a button to find the total of the two numbers.
*/

public class MathGUI extends JFrame implements ActionListener{
	// Instance variables will use in any methods
	private double resultNum = 0;
	private JTextField num1Txt;
	private JTextField num2Txt;
	private JTextField totalTxt;

	public static void main(String[] args){
		MathGUI math1 = new MathGUI();
		math1.setVisible(true);
	}

	public MathGUI(){
		setTitle("Math GUI");
		setSize(800, 150);
		Container content = getContentPane();
		content.setLayout(new GridLayout(4,2));

		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new GridLayout(1,5));

		// Buttons

		JButton addBtn = new JButton("Add");
		addBtn.addActionListener(this);
		buttonPanel.add(addBtn);


		JButton subBtn = new JButton("Subtract");
                subBtn.addActionListener(this);
		buttonPanel.add(subBtn);
		
		JButton multBtn = new JButton("Multiply");
		multBtn.addActionListener(this);
		buttonPanel.add(multBtn);

		JButton divideBtn = new JButton("Divide");
                divideBtn.addActionListener(this);
		buttonPanel.add(divideBtn);

		JButton resetBtn = new JButton("Reset");
                resetBtn.addActionListener(this);
		buttonPanel.add(resetBtn);

		JPanel textPanel = new JPanel();

		// TextFields and Labels
		JLabel num1Lbl = new JLabel("First number: ");
		num1Txt = new JTextField(15);
		JLabel num2Lbl = new JLabel("Second number: ");
		num2Txt = new JTextField(15);
		JLabel totalLbl = new JLabel("Restult: ");
		totalTxt = new JTextField(15);

		content.add(num1Lbl);
		content.add(num1Txt);

		content.add(num2Lbl);
		content.add(num2Txt);

		content.add(totalLbl);
		content.add(totalTxt);

		content.add(textPanel, BorderLayout.EAST);
		content.add(buttonPanel, BorderLayout.CENTER);
	}

	public void actionPerformed(ActionEvent e) {
		DecimalFormat dFormat = new DecimalFormat("0.00");
		        if (e.getActionCommand().equals("Add")) {
			    resultNum = (Double.parseDouble(num1Txt.getText()) + Double.parseDouble(num2Txt.getText()));
                            totalTxt.setText(Double.toString(resultNum));
			} else if (e.getActionCommand().equals("Subtract")){
			resultNum = (Double.parseDouble(num1Txt.getText()) - Double.parseDouble(num2Txt.getText()));
			totalTxt.setText(Double.toString(resultNum));
			} else if (e.getActionCommand().equals("Multiply")) {
			resultNum = (Double.parseDouble(num1Txt.getText()) * Double.parseDouble(num2Txt.getText()));								        totalTxt.setText(Double.toString(resultNum));
			} else if (e.getActionCommand().equals("Divide")) {
			resultNum = (Double.parseDouble(num1Txt.getText()) / Double.parseDouble(num2Txt.getText()));
			String resultNumStr = dFormat.format(resultNum);
			totalTxt.setText((resultNumStr));
			} else if (e.getActionCommand().equals("Reset")) {
				resultNum = 0;
				num1Txt.setText("");
				num2Txt.setText("");
				totalTxt.setText("");																	 }
																						}

																					}
