import java.util.Scanner;
import javax.swing.JOptionPane;
public class Chapter2_2{
	public static void main(String[]args){
		Scanner scan = new Scanner (System.in);
		int x;
		byte a;
		float b;
		double c; 
		char d;
		boolean e;
		short f;
		long g;

		System.out.println("Enter an integer value: ");
		x = scan.nextInt();
		
		System.out.println("Enter a byte value: ");
		a = scan.nextByte();
		
		System.out.println("Enter a float value: ");
		b = scan.nextFloat();
		
		System.out.println("Enter a double value: ");
		c = scan.nextDouble();
		
		System.out.println("Enter a character value: ");
		d = scan.next().charAt(0);
		
		System.out.println("Enter a boolean value, true or false: ");
		e = scan.nextBoolean();
		
		System.out.println("Enter a short value: ");
		f = scan.nextShort();
		
		System.out.println("Enter a long value: ");
		g = scan.nextLong();
		
		JOptionPane.showMessageDialog(null, "The integer value you entered is " + x);
		JOptionPane.showMessageDialog(null,"The byte value you entered is " + a);
		JOptionPane.showMessageDialog(null,"The float value you entered is " + b);
		JOptionPane.showMessageDialog(null,"The double value you entered is " + c);
		JOptionPane.showMessageDialog(null,"The char value you entered is " + d);
		JOptionPane.showMessageDialog(null,"The boolean value you entered is " + e);
		JOptionPane.showMessageDialog(null,"The short value you entered is " +f);
		JOptionPane.showMessageDialog(null,"The long value you entered is " + g);
		}
	}
