import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Chapter2_3{
	public static void main(String[] args){

		DecimalFormat format = new DecimalFormat("0.00");
		int height;
		double feet, inch;

		height = Integer.parseInt(JOptionPane.showInputDialog("Enter your height in inches"));
		inch = height * 0.39;
		feet = inch / 12;

		JOptionPane.showMessageDialog(null, "Your height in inches is " + format.format(inch));
		JOptionPane.showMessageDialog(null, "Your height in feet is " + format.format(feet));
		}
	}
