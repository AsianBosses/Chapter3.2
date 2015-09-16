import java.util.Scanner;
public class Rectangle{
	public static void main (String [] args){
		Scanner scan = new Scanner(System.in);
		double width, height, perimeter, area;

		System.out.println("Enter width: ");
		width = scan.nextDouble();
		System.out.println("Enter height: ");
		height = scan.nextDouble();
		
		perimeter = 2*(height+width);
		area = width*height;
		
		System.out.println("The perimeter of the rectangle is: " + perimeter);
		System.out.println("The area of the rectangle is " + area);

	}
	}
