package dateAndTime;

import java.util.Calendar;

public class DateAndTimeResult {
	
    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    protected static String findDay(int month, int day, int year) {
    	Calendar anyDay = Calendar.getInstance();
    	
    	anyDay.set(year, month-1, day);
    	int dayOfWeek = anyDay.get(Calendar.DAY_OF_WEEK);
    	
    	String dayOfWeekString = "";
    	do {
        	switch (dayOfWeek) {
    		case 1:
    			dayOfWeekString = "Sunday";
    			break;
    		case 2:
    			dayOfWeekString = "Monday";
    			break;
    		case 3:
    			dayOfWeekString = "Tuesday";
    			break;
    		case 4:
    			dayOfWeekString = "Wednesday";
    			break;
    		case 5:
    			dayOfWeekString = "Thursday";
    			break;
    		case 6:
    			dayOfWeekString = "Friday";
    			break;
    		case 7:
    			dayOfWeekString = "Saturday";			
    			break;
    		default:
    			break;
    		}
		} while (year <= 2000 || year >= 3000);
    	
    	
    	return dayOfWeekString.toUpperCase();
    }

}
