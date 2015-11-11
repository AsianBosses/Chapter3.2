public class CW2_4{
	public static void main(String [] args){
		String fName = "CUONG";
		String lName = "dinh";
		String testName = "CUONG";
		String newName = "	CuOnG";

		// Print Character of string at index #
		System.out.println(fName.charAt(2));

		// Concatenates first string with second string
		System.out.println(fName.concat(lName));

		// Prints whether first string equals second string is True or False;
		System.out.println(fName.equals(lName));
		System.out.println(fName.equals(testName));

		// Print index number of a character in your string
		System.out.println(fName.indexOf('U'));

		// Print index number of a character in your string
		System.out.println(fName.lastIndexOf('N'));

		// Print string out in lower case
		System.out.println(fName.toLowerCase());

		// Print string out in upper case
		System.out.println(lName.toUpperCase());

		// Replaces a character in your string with a different character
		System.out.println(fName.replace('N','u'));

		// Print string out at index number
		System.out.println(fName.substring(2));

		// Print string out from first index number to second index number
		System.out.println(fName.subSequence(1,4));

		// Print string and gets rid of any white spaces
		System.out.println(newName.trim());
		}
	}
