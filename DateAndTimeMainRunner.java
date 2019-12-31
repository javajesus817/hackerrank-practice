/* Created by: javajesus817
 * Created on: 12/31/19
 * Updated on: 
 * Version: 1.0
 * 
 * The Calendar class is an abstract class that provides methods for converting between a specific instant in time and a set of calendar fields
 * such as YEAR, MONTH, DAY_OF_MONTH, HOUR, and so on, and for manipulating the calendar fields, such as getting the date of the next week.
 * You are given a date. You just need to write the method, getDay, which returns the day on that date. To simplify your task, we have provided a portion of the code in the editor.
 * For example, if you are given the date August 14, 2017, the method should return Monday as the day on that date.
 * 
 * 
 * Input Format
 * A single line of input containing the space separated month, day and year, respectively, in MM DD YYYY format.
 * 
 * 
 * Constraints
 * 2000 < year < 3000
 * 
 * 
 * */

package dateAndTime;

public class DateAndTimeMainRunner {

	public static void main(String[] args) {
		System.out.println(DateAndTimeResult.findDay(8, 5, 2015));
	}

}
