/**
*
* @author cqd2292 this program shows you how to use %f, %s and more
*
*/

public class Chapter3_1{
	/**
	* Main method
	* @param args
	*/
	public static void main (String [] args){
		double number1, number2, number3, average;
		number1 = 2.0;
		number2 = 7.0;
		number3 = 1.0;
		int amount = 3;
		String item = "Gas";
		double price = 3.33;
		char sym = 'A';
		double pi = 3.14159;
		// find average of three numbers
		average = (number1 + number2 + number3)/3;
		System.out.printf("%s is ver expensive these days. ", item);
		System.out.printf("\n" + "%c <- that was a char. ", sym);
		System.out.printf("\n" + "%e <- tat was a percent e", pi);
		/*
		* The following logic is using if else java statement if the statement
		* is true, then the program will print out with format. Otherwise, the 
		* program will print out without using format.
		*/

		if(true){
			System.out.printf("\n" + "The average price per gallon of gas is %2.2f.", average);
			System.out.printf("\n" + "%2d gallons costs about $%.2f", amount, amount*price);

		}else{
			System.out.println("The averagve is " + average);
		}

	}
}
