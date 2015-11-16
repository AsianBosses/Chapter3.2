import javax.swing.JOptionPane;

public class Chapter2_5 {
	public static double pennies  = 0.01;
	public static double nickels  = 0.05;
	public static double dimes    = 0.10;
	public static double quarters = 0.25;

	public static void main(String[] args){
		int bills; 
		double numPennies, numNickels, numDimes, numQuarters;

		bills = Integer.parseInt(JOptionPane.showInputDialog("Enter dollar bills 1, 5, or 10: "));

		numPennies  = bills / pennies;
		numNickels  = bills / nickels;
		numDimes    = bills / dimes;
		numQuarters = bills / quarters;

		JOptionPane.showMessageDialog(null, bills + " dollars is ");
		JOptionPane.showMessageDialog(null, (int) numPennies + " pennies");
		JOptionPane.showMessageDialog(null, (int) numDimes + " dimes");
		JOptionPane.showMessageDialog(null, (int) numNickels + " nickels");
		JOptionPane.showMessageDialog(null, (int) numQuarters + " quarters");
		}
	}
