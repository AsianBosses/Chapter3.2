import javax.swing.JOptionPane;

public class Chapter3_6{

	public enum month{January,February,March,April,May,June,July,August,September,October,November,December};

	public static void main(String [] args){
		month [] choice = {month.January, month.February, month.March, month.April, month.May, month.June, month.July, month.August, month.September, month.October, month.November, month.December};


	while(true){
		month select = (month)JOptionPane.showInputDialog(null, "pick a month", "Month", JOptionPane.INFORMATION_MESSAGE, null, choice, choice[0]);
		

		String Spring = "Happy Spring days!";
		String Summer = "It's summer time.";
		String Fall = "Welcome to the foliage season!";
		String Winter = "Do you want to build a snowman?";


		switch (select){
		case January:
			JOptionPane.showMessageDialog(null, Winter);
			break;
		
		case February:
			JOptionPane.showMessageDialog(null, Winter);
			break;

		case March:
			JOptionPane.showMessageDialog(null, Spring);
			break;

		case April:
			JOptionPane.showMessageDialog(null, Spring);
			break;

		case May:
			JOptionPane.showMessageDialog(null, Spring);
			break;

		case June:
			JOptionPane.showMessageDialog(null, Summer);
			break;

		case July:
			JOptionPane.showMessageDialog(null, Summer);
			break;

		case August:
			JOptionPane.showMessageDialog(null, Summer);
			break;

		case September:
			JOptionPane.showMessageDialog(null, Fall);
			break;

		case October:
			JOptionPane.showMessageDialog(null, Fall);
			break;

		case November:
			JOptionPane.showMessageDialog(null, Fall);
			break;

		case December:
			JOptionPane.showMessageDialog(null, Winter);
			break;

		default:
			JOptionPane.showMessageDialog(null, "Invalid Inmput");
			}

		}
	
	}

}
