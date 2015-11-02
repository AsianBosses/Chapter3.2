import java.util.Scanner;
/*
author: Cuong Dinh
date: 11/31/2015
contact information: phoboi1@gmail.com

this program takes in ten numbers separated with a comma
then calcuates the average of the ten numbers.

*/

public class CW2_1{
	public static void main(String [] args){
		String s1,s2,s3,s4,s5,s6,s7,s8,s9,s10;

		Scanner scan = new Scanner(System.in);
		scan.useDelimiter(",");

		double d1,d2,d3,d4,d5,d6,d7,d8,d9,d10;
		double average, total;
		
		System.out.println("Enter ten numbers separated with a ,");
		s1 = scan.next();
		s2 = scan.next();
		s3 = scan.next();
		s4 = scan.next();
		s5 = scan.next();
		s6 = scan.next();
		s7 = scan.next();
		s8 = scan.next();
		s9 = scan.next();
		s10 = scan.next();
		
		d1 = Double.parseDouble(s1);
		d2 = Double.parseDouble(s2);
		d3 = Double.parseDouble(s3);
		d4 = Double.parseDouble(s4);
		d5 = Double.parseDouble(s5);
		d6 = Double.parseDouble(s6);
		d7 = Double.parseDouble(s7);
		d8 = Double.parseDouble(s8);
		d9 = Double.parseDouble(s9);
		d10 = Double.parseDouble(s10);

		total = d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 +d9 + d10;
		average = total / 10;
		System.out.println("The numbers you have entered are \n\t" + d1 + "\n\t" + d2+ "\n\t" + d3+ "\n\t" + d4+ "\n\t" + d5+ "\n\t" + d6+ "\n\t" + d7+ "\n\t" + d8+ "\n\t" + d9+ "\n\t" + d10);

		System.out.println("\"Average\" is " + average);
		}
	}
