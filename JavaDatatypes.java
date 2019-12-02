/* Created by: James McCoy
 * Created on: 12/1/2019
 * Updated on: 
 * Version: 1.0
 * 
 * Requirements:
 * 
 * Java has 8 primitive data types; char, boolean, byte, short, int, long, float, and double. For this exercise, we'll work with the primitives used to hold integer values (byte, short, int, and long):
 * 
 * A byte is an 8-bit signed integer.
 * A short is a 16-bit signed integer.
 * An int is a 32-bit signed integer.
 * A long is a 64-bit signed integer.
 * Given an input integer, you must determine which primitive data types are capable of properly storing that input.
 * 
 * To get you started, a portion of the solution is provided for you in the editor.
 * 
 * */

package hackrankpractice;

import java.util.Scanner;

public class JavaDatatypes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter quantity of test cases: ");
		int t = sc.nextInt();
		int i;
		
		for(i = 0; i < t; i++) {
			try {
				System.out.println("Enter a number for test case " + (i + 1) + " of " + t + ":");
				long x = sc.nextLong();
				System.out.println(x + " can be fitted in: ");
				if(x >= -128 && x <= 127) {
					System.out.println(" *byte");
				}
				if(x >= -32768 && x <= 32767) {
					System.out.println(" *short");
				}
				if(x >= Math.pow(-2,31) && x <= (Math.pow(2,31)-1)) {
					System.out.println(" *int");
				}
				if(x >= Math.pow(-2,63) && x <= (Math.pow(2,63)-1)) {
					System.out.println(" *long");
				}
			} catch (Exception e) {
				System.out.println(sc.next() + " can't be fitted anywhere.");
			}
		}
		sc.close();
	}

}
