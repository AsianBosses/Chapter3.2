import java.util.Scanner;

public class Chapter3p3{
	public static void main (String [] args){
		String password = "Password1";
		String username, epass;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your username" );
		username = scan.nextLine();
		System.out.println("Enter your password" );
		epass = scan.nextLine();

		if(epass.equals(password)){
			System.out.println("Welcome " + username + "!");
		}else{
			System.out.println("Wrong password or username!");	
		}
		
	
	}

}

