import javax.swing.JOptionPane;

public class Assignment3{
	public enum AccountType{ Admin, Staff, Student};

	public static void main(String[] args){
		String [] userNames = {"cqd2292", "csc200", "csc201"};
		String [] passwords = {"pass1", "pass2", "pass3"};
		AccountType [] account = {AccountType.Admin, AccountType.Staff, AccountType.Student};
		boolean foundUsername = false;
		boolean foundPassword = false;

		// input username
		String userStr = JOptionPane.showInputDialog("Enter Username");
		int limit = 1;
		int i = 0;
	
		//limit 3 times for entering username
		while(limit < 3) {
			// check string array username
			while(i < 3) {
				if(userStr.equals(userNames[i])){
					foundUsername = true;
					break;
				}
				i++;
			}

			// if username is found we check for password
			if(foundUsername){
				// input password
				String passStr = JOptionPane.showInputDialog("Enter Password");
				while(i < 3){
					limit = 0;
					if(passStr.equals(passwords[i])){
						foundPassword = true;
						break;
					}
					i++;
				}
				if(foundPassword){
					JOptionPane.showMessageDialog(null, "Welcome " + userNames[i]);
					AccountType input = (AccountType) JOptionPane.showInputDialog(null, "Select account type", "Account Type", JOptionPane.INFORMATION_MESSAGE, null, account, account[0]);
					switch(input){
						case Admin:
							JOptionPane.showMessageDialog(null, "Welcome Admin! You can update and read file.");
							System.exit(0);
						case Staff:
							JOptionPane.showMessageDialog(null, "Welcome Staff! You can update, read, add, and delete file.");
							System.exit(0);
						case Student:
							JOptionPane.showMessageDialog(null, "Welcome Student! You can only read file.");
							System.exit(0);
						default: 
							break;
				}
			} else {
				JOptionPane.showMessageDialog(null, "Invalid Password");
				limit++;
				}
			}else{
			JOptionPane.showMessageDialog(null, "Invalid Username");
			userStr = JOptionPane.showInputDialog("Enter Username");
			limit ++;
			}
		}
		JOptionPane.showMessageDialog(null, "Account is locked. Please contact administrator.");
	}
}
