import javax.swing.JOptionPane;
public class Chapter3_5{
	public static void main(String [] args){
		String input;
		input = JOptionPane.showInputDialog("Enter role");
		switch (input){
		case "Administrator":
			JOptionPane.showMessageDialog(null, "Welcome " + input);
			break;
		case "Faculty":
			JOptionPane.showMessageDialog(null, "Welcome " + input);
			break;
		case "Staff":
			JOptionPane.showMessageDialog(null, "Welcome " + input);
			break;
		case "Student":
			JOptionPane.showMessageDialog(null, "Welcome " + input);
			break;
		case "Guest":
			JOptionPane.showMessageDialog(null, "Welcome " + input);
		        break;
		default:
			JOptionPane.showMessageDialog(null, "Invalid input");
			

		}
	}
}
