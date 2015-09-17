import java.util.Arrays;
import java.util.Scanner; 

public class Assignment2{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		double a,b,c,d,e, sum, ave;
		double ma1, ma2, ma3, ma4;
		double mi1, mi2, mi3, mi4;

		System.out.println("Enter first number: ");
		a = scan.nextDouble();
		System.out.println("Enter second number: ");
		b = scan.nextDouble();
		System.out.println("Enter third number: ");
		c = scan.nextDouble();
		System.out.println("Enter fourth number: ");
		d = scan.nextDouble();
		System.out.println("Enter fifth number: ");
		e = scan.nextDouble();

		sum = a + b + c + d + e;
		ave = (a + b + c + d + e)/5;

		// Find max
		ma1 = Math.max(a,b);
		ma2 = Math.max(ma1,c);
		ma3 = Math.max(ma2,d);
		ma4 = Math.max(ma3,e);
		
		// Find min 
		mi1 = Math.min(a,b);
		mi2 = Math.min(mi1,c);
		mi3 = Math.min(mi2,d);
		mi4 = Math.min(mi3,e);

		// sort the number
		double [] med = new double [] {a,b,c,d,e};
		Arrays.sort(med);

		System.out.println("Numbers entered: " + a + ", " + b + ", " + c + ", " + d + ", " + e);
		System.out.println("The sum of the numbers you entered is " + sum);
		System.out.println("The average of the five numbers is " + ave);
		System.out.println("The maximum value is " + ma4);
		System.out.println("The minimum value is " + mi4);
		System.out.println("The median value is " + med[2]);
	
	
	
	
	
	}
}
