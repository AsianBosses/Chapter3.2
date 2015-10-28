import javax.swing.JOptionPane;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.GridePane;
import javafx.stage.Stage;

public class Chapter4_1 extends Application {
	public enum AccountType{
		Admin, Staff, Student};

	public static void main(String [] args){
		launch(args);
		}

	@overide
	public void start(Stage primaryStage){
		final String user = "csc200";
		final String password = "pw1";
		Label userLbl = new Label("Username");
		final TextField userTxt = new TextField();
		Label passLbl = new Label("Password");
		final PasswordField passFd = new PasswordField();
		Button loginbtn = new Button("Login");
		loginbtn.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent arg0) {
				String euser;
				String epassword;
				int attempt = 2; 
				euser = userTxt.getText();
				epass = passFd.getText();
				int i = 0;
				AccountType [] accounts = { AccountType.Admin, AccountType.Staff, AccountType.Student};

				for(int k = 0; k < attempt; k++){
					if (euser.equals(user) && epassword.equals(password)){
						found = true;
						JOptionPane.showMessageDialog(null, "Welcome " + euser + "!");
					do {
						AccountType select = (AccountType) JOptionPane.showInputDialog(null, "select account type", "Account Type", JOptionPane.INFORMATION_MESSAGE, null, accounts, accounts[0]);
						switch(select){
						case Admin:
							JOptionPane.showMessageDialog(null, "Welcome Admin!");
							System.exit(0);
						case Staff:
							JOtionPane.showMessageDialog(null, "Incorrect account");
							i++;
							break;
						case Student:
							JOptionPane.showMessageDialog(null, "Incorrect account");
							i++;
							break;
						}
					} while (i < 3 );
						break;
				} else { 
					JOptionPane.showMessageDialog(null, "Incorrect password or username.");
					}
				}
			});

				GridePane grid = new GridePane();
				grid.setAlignment(Pos.CENTER);
				grid.setHgap(10);
				grid.setVgap(10);
				grid.add(userLbl, 0, 0);
				grid.add(userTxt, 1, 0);
				grid.add(passLbl, 0, 1);
				grid.add(passFd, 1, 1;)
				grid.add(loginbtn, 1, 2);
				Scene scene = new Scene(grid, 500, 500);
				primaryStage.setScene(scene);
				primaryStage.show();
			}
		}
