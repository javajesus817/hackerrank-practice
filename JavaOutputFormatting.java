package hackrankpractice;

/* Created by: James McCoy
 * Created on: 12/1/2019
 * Updated on: 
 * Version: 1.0
 * 
 * Requirements:
 * 
 * Java's System.out.printf function can be used to print formatted output. The purpose of this exercise is to test your understanding of formatting output using printf.
 * 
 * To get you started, a portion of the solution is provided for you in the editor; you must format and print the input to complete the solution.
 * 
 * Input Format
 * 
 * Every line of input will contain a String followed by an integer.
 * Each String will have a maximum of  alphabetic characters, and each integer will be in the inclusive range from  to .
 * 
 * Output Format
 * 
 * In each line of output there should be two columns:
 * The first column contains the String and is left justified using exactly  characters.
 * The second column contains the integer, expressed in exactly  digits; if the original input has less than three digits, you must pad your output's leading digits with zeroes.
 * 
 * 
 * 
 * */

import java.util.Scanner;

public class JavaOutputFormatting {
	static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int i;
		
		for(i = 0; i < 3; i++) {
			String word = sc.next();
			int num = sc.nextInt();
			System.out.printf("%-15s", word);
			System.out.printf("%03d", num);
			System.out.println();
		}
		
		sc.close();

	}

}
