import javax.swing.JOptionPane;
public class Chapter3_4{
	public static void main(String[] args){
		int numPeople, groupSize, numPlayers, teamSize;
		numPeople = Integer.parseInt(JOptionPane.showInputDialog("Enter number of people"));
		numPlayers = Integer.parseInt(JOptionPane.showInputDialog("Enter number of players"));

		if(numPeople > 10){
			groupSize = numPeople/2;
			JOptionPane.showMessageDialog(null, "Number of people: " + numPeople + "\n" + "Group size: " + groupSize);
			
		}else if (numPeople > 3 && numPeople < 10){
			groupSize = numPeople/3;
			JOptionPane.showMessageDialog(null, "Number of people: " + numPeople + "\n" + "Group size: " + groupSize);
		}else{
			JOptionPane.showMessageDialog(null, "Number of people have to be at least 3.");
		}

		if(numPlayers > 11 && numPlayers < 55){
			teamSize = numPlayers/11;
			JOptionPane.showMessageDialog(null, "Number of players: " + numPlayers + "\n" + "Team Size: " + teamSize);
		} else {
			teamSize = 1;
			JOptionPane.showMessageDialog(null, "Team size = 1");
		}
	}
}
