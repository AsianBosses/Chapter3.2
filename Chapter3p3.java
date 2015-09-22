import java.util.Scanner;

/** 
 * This program takes in the username and password from the user.
 * If the username and password matches, then the console will print out Welcome * Username! 
 * If the username and password doesn't matches, then the console will print out * Wrong password or username;
 * @author Cuong Dinh
 */


public class Chapter3p3{
	/**
	 * Main method
	 * @param args
	 */
public static void main (String [] args){
		String username = "csc200";
		String password = "Password1";

		String eusername, epass;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your username" );
		eusername = scan.nextLine();
		System.out.println("Enter your password" );
		epass = scan.nextLine();

		if(eusername.equals(username) && epass.equals(password)){
			System.out.println("Welcome " + username + "!");
		}else{
			System.out.println("Wrong password or username!");	
		}
		
	
	}

}

