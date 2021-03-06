/*
 * Program.java        1.0 24/01/2013
 *
 * Models the program.
 *
 * Copyright 2013 BERNABE GONZALEZ GARCIA <bernagg@outlook.com>
 *                VICTOR SAN MARTIN <victor40000@hotmail.com>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

package edul;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Library with utilities for working with dates in European format.
 */
 
public class EuropeanDate {
     
    /**
     * Determines if a year is a leap year.
     * 
     * @param dateTime a String.
     * @return true if the year of the String is a leap year, false otherwise.
     */
    
    private static boolean isLeap ( String dateTime ) {
        //Take the year of the variable dateTime
        int yearint = getYear(dateTime);
        // Is a leap year ?
        boolean leap = false;
        if (yearint % 4 == 0) {
            if (yearint % 100 == 0 && yearint % 400 != 0) {
                leap = false; 
            } else {
                leap = true;
            }
        }  else  {
            leap = false;
        }
        return leap;
    }
    
    /**
     * Determines if a year is a leap year.
     * 
     * @param yearint an int.
     * @return true if yearint is a leap year, false otherwise.
     */
     
    private static boolean isLeap ( int yearint ) {
        // Is a leap year ?
        boolean leap = false;
        if (yearint % 4 == 0) {
            if (yearint % 100 == 0 && yearint % 400 != 0) {
                leap = false; 
            } else {
                leap = true;
            }
        }  else  {
            leap = false;
        }
        return leap;
    }
    
    
    /**
     * Converts the string into an array
     * 
     * @param dateTime a String
     * @return datecut, an array with the dates of dateTime.
     */
    
    private static String[] dateToArray (String dateTime) {  
        //Create the String date and where they had "/", we put ":"
        String date = dateTime.replace("/",":");
        //Where they had "-", we put ":"
        date = date.replace("-",":");
        //Create an array with the dates of dateTime.
        String datecut[] = date.split(":");
        return datecut;
    }
    
    /**
     * Converts the string into an array of ints.
     * 
     * @param dateTime a String
     * @return datecut, an array with the dates of dateTime.
     */
    
    private static int[] dateToArrayInt (String dateTime) {   
        //Create the String date and where they had "/", we put ":"
        String date = dateTime.replace("/",":");
        //Where they had "-", we put ":"
        date = date.replace("-",":");
        //Create an array with the dates of dateTime.
        String datecut[] = date.split(":");
        //Create an array with datecut length
        int datearr[] = new int [datecut.length];
        //Convert array datearr to an array of Ints
        for ( int i = 0; i < datearr.length; i++ ) {
            datearr[i] = Integer.parseInt(datecut[i]);
        }
        return datearr;
    }
    
    /**
     * Builds a string from an integer and fill the string with 0 until a specified length.
     * 
     * @param n a positive integer number
     * @param len the length of the final string
     * @return the formatted string
     */
    private static String fillWith0 (int n, int len){
        String s = String.valueOf(n);
        int numberOf0 = len - s.length();
        for (int i = 0; i < numberOf0; i++){
            s = "0" +s;
        }
        return s;
    }
    
    /**
     * Determines if dateTime1 and dateTime2 are equal.
     * 
     * @String dateTime1, dateTime2 a Strings.
     * @return boolean true if both valors are equals or false if both valos are not equals.
     */
    
    public static boolean areEqual(String dateTime1, String dateTime2) {
        return (dateTime1.equals(dateTime2));
    }
    
    /**
     * Determines if all datetimes in array dateTimes are equal.
     * 
     * @param dateTime[] a String array.
     * @return boolean true if valors of the string are equals.
     */
    
    public static boolean areEqual(String dateTime[] ) {
        //Create boolean variable equals.
        boolean equals = true;
        //For equals = true and i < dateTime.length().
        for ( int i = 0; i < dateTime.length - 1 && equals; i++ ) {
            equals = dateTime[0].equals(dateTime[i+1]);
        }
        return equals;
    }
    
    /**
     * Generates a string with the following format: dd/mm/yyyy-hh:mm:ss
     * 
     * @param dayOfMonth an int.
     * @param monthOfYear an int.
     * @param year an int.
     * @param hour an int.
     * @param minute an int.
     * @param second an int.
     * @return the datetime.
     */
    
    public static String createDate(int dayOfMonth, int monthOfYear, int year, int hour, int minute, int second) {
        //If dayOfMonth only has one number, adds one 0 in left position
        String dayOfMonthS = fillWith0(dayOfMonth, 2);
        //If monthOfYear only has one number, adds one 0 in left position
        String monthOfYearS = fillWith0(monthOfYear, 2);
        //If year only has less than four numbers, adds one, two or three 0 in left position
        String yearS = fillWith0(year, 4);
        //If hour only has one number, adds one 0 in left position
        String hourS = fillWith0(hour, 2);
        //If minute only has one number, adds one 0 in left position
        String minuteS = fillWith0(minute, 2);
        //If second only has one number, adds one 0 in left position
        String secondS = fillWith0(second, 2); 
        //Create String with the following format: dd/mm/yyyy-hh:mm:ss
        return dayOfMonthS + "/" + monthOfYearS + "/" + yearS + "-" + hourS + ":" + minuteS + ":" + secondS;
    }
    
    /**
     * Generates a string with the following format: dd/mm/yyyy-00:00:00
     * 
     * @param dayOfMonth an int.
     * @param monthOfYear an int.
     * @param year an int.
     * @return the dateTime
     */
    
    public static String createDate(int dayOfMonth, int monthOfYear, int year){
        return createDate ( dayOfMonth, monthOfYear, year , 00, 00, 00);
    }
    
    /**
     * Generates a string with the following format: dd/mm/yyyy-hh:mm:00
     * 
     * @param dayOfMonth an int.
     * @param monthOfYear an int.
     * @param year an int.
     * @param hour an int.
     * @param minute an int.
     * @return the dateTime
     */
    
    public static String createDate(int dayOfMonth, int monthOfYear, int year, int hour, int minutes){
        return createDate ( dayOfMonth, monthOfYear, year , hour, minutes, 00);
    }
    
    /**
     * Compares dateTime1 to dateTime2. Returns a negative integer, zero, or a positive integer as dateTime1 is before, 
     * equal to, or after dateTime2.
     * 
     * @params dateTime1, dateTime2 strings.
     * @return int 1 if dateTime1 is after dateTime2, 0 if are equals, -1 if is before.
     */
    
    
    public static int compareTo(String dateTime1, String dateTime2) {    
        //Create an array with dates of String.
        String dat1[] = dateToArray(dateTime1);
        String dat2[] = dateToArray(dateTime2);
        int date1[] = new int [dat1.length];
        int date2[] = new int [dat1.length];
        // change to int-array.
        int temp = 0;
        for ( int i = 0; i < dat1.length; i++ ) {
            date1[i] = Integer.parseInt(dat1[i]);
        }
        // change year->day   day->year
        temp = date1[2];
        date1[2] = date1[0];
        date1[0] = temp;
        // the same.
        for ( int i = 0; i < dat1.length; i++ ) {
            date2[i] = Integer.parseInt(dat2[i]);
        }
        temp = date2[2];
        date2[2] = date2[0];
        date2[0] = temp;
        // cmon represents a flag.
        int end = 0;
        boolean cmon = true;
        // if the times are equals, flag close.
        if ( dateTime1.equals(dateTime2)) {
            cmon = false;
        }
        // a for, reads all the array.
        for ( int i = 0; i < date1.length && cmon; i++ ) {
            if ( date1[i] > date2[i] ) {
                end = 1;
                cmon = false;
            } else if ( date1[i] < date2[i] ) {
                end = -1;
                cmon = false;
            }
        }
        return end;
    }
    
    
    /**
     * Returns a datetime with the current date.
     * 
     * @return the current datetime.
     */
    
    public static String now() {
        Calendar c = new GregorianCalendar();
        int day = c.get(Calendar.DAY_OF_MONTH);
        int month = c.get(Calendar.MONTH) + 1;
        int year = c.get(Calendar.YEAR);
        int hour = c.get(Calendar.HOUR_OF_DAY);
        int minute = c.get(Calendar.MINUTE);
        int second = c.get(Calendar.SECOND);
        return createDate(day, month, year, hour, minute, second);
    }
    
    /**
     * Get the day of dateTime.
     * 
     * @param dateTime a String.
     * @param return an int represents a day.
     */
    
    private static int getDay ( String dateTime ) {
        //Create String variable dateB, this String contains the day.
        String dateB = dateTime.substring(0,2);
        return Integer.parseInt(dateB);
    }
    
    /**
     * Get the month of dateTime.
     * 
     * @param dateTime a String.
     * @param return an int represents a month.
     */
    
    private static int getMonth ( String dateTime ) {
        //Create String variable dateB, this String contains the Month.
        String dateB = dateTime.substring(3,5);
        return Integer.parseInt(dateB);
    }
    
    /**
     *  Get the century of dateTime. (dateTime would be like this: "21/12/1992-21:21:00" or this too "21/12/1992")
     * 
     * @param dateTime a String.
     * @return the century of dateTime.
     */
    
    public static int getCentury ( String dateTime ) {
        //Create String variable dateB, this String contains the year.
        String dateB = dateTime.substring(6,10);
        //Create String variable dateB, this String contains the day.
        String dateC = dateB.substring(0,2);
        int intNumber = Integer.parseInt(dateC);
        intNumber++;
        return intNumber;
    }
    
    /**
     * Get the day of month field. (dateTime same than getCentury needs).
     * 
     * @param dateTime a String.
     * @return the day of month field.
     */
    
    public static int getDayOfMonth ( String dateTime ) {
        String dateB = dateTime.substring(0,2);
        return Integer.parseInt(dateB);
    }
    
    /**
     * Get the day of week. Returns 0 if the day is a Sunday; 1 if it is a Monday, and so on through the week until 6 for a Saturday.
     * 
     * @param dateTime a String.
     * @return the day of week. 
     */
    
    public static int getDayOfWeek ( String dateTime ) {
        // Get d=day  m=month y=year
        int d = getDay (dateTime);
        int m = getMonth (dateTime);
        int y = getYear (dateTime);
        int t[] = {0, 3, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4};
        if ( m < 3 ) {
            y--;
        }
        return (y + y/4 - y/100 + y/400 + t[m-1] + d) % 7;
    }
    
    /**
     * Get the day of year. Returns 1 if the date is January 1st, and so on through the year until 365 or 366 (for a leap year) for December 31st.
     * 
     * @param dateTime a String.
     * @return the number of days contains dateTime.
     */
    
    public static int getDayOfYear(String dateTime) {   
        int yearint = getYear(dateTime);
        // arays, contains months and monthsleap days.
        int months[] =  {31,28,31,30,31,30,31,31,30,31,30,31};
        int monthsleap[] = {31,29,31,30,31,30,31,31,30,31,30,31};
        boolean leap = isLeap(dateTime);
        int end = 0;
        if ( !leap ) {
            for ( int y = getDay(dateTime); y > 0; y-- ) {
                end ++;
            }
            for ( int i = getMonth(dateTime) - 1; i >= 1; i-- ) {
                for ( int z = 0; z < months[i-1]; z++ ) {
                    end++;
                }
            }
        }  else {
            for ( int y = getDay(dateTime); y > 0; y-- ) {
                end ++;
            }
            for ( int i = getMonth(dateTime) - 1; i >= 1; i-- ) {
                for ( int z = 0; z < monthsleap[i-1]; z++ ) {
                    end++;
                }
            }
        }
        return end;
    }
   
    /*
     * Get the hour of day field.
     * 
     * @param dateTime a String.
     * @return int hour of dateTime.
     */
    
    public static int getHourOfDay(String dateTime) {
        String dateb = dateTime.substring(11,13);
        return Integer.parseInt(dateb);
    }
    
    
    /**
     * Get the minute of day. Returns 0 if time is 00:00 and so on through the day until 1439 if time is 23:59
     * 
     * @param dateTime a String.
     * @return minute of day.
     */
    
    public static int getMinuteOfDay(String dateTime) {
        String dateA = dateTime.substring(14,16);
        String dateB = dateTime.substring(11,13);
        int minute = Integer.parseInt(dateA);
        int hour = Integer.parseInt(dateB);
        int minuteOfHour = hour * 60 + minute;
        return minuteOfHour;
    }
    
    /**
     * Get the minute of hour field.
     * 
     * @param dateTime a String.
     * @return minute.
     */
    
    public static int getMinuteOfHour(String dateTime){
        String dateB = dateTime.substring(14,16);
        int minute = Integer.parseInt(dateB);
        return minute;
    }
    
    /**
     * Get the month of year field.
     * 
     * @param dateTime a String.
     * @return month.
     */
    
    public static int getMonthOfYear(String dateTime) {
        String dateA = dateTime.substring(3,5);
        int month = Integer.parseInt(dateA);
        return month;
    }
    
    /**
     * Get the second of day. Returns 0 if time is 00:00:00 and so on through the day until 86399 if time is 23:59:59
     *
     * @param dateTime a String.
     * @return seconds.
     */
    
    public static int getSecondOfDay(String dateTime) {
        String dateA = dateTime.substring(14,16);
        String dateB = dateTime.substring(17,19);
        String dateC = dateTime.substring(11,13);
        int seconds = Integer.parseInt(dateB);
        int minute = Integer.parseInt(dateA);
        int hour = Integer.parseInt(dateC);   
        int secondsOfDay = hour * 3600 + minute * 60 + seconds;
        return secondsOfDay;
    }
    
    /**
     * Get the second of minute field.
     * 
     * @param dateTime a String
     * @return seconds.
     */
    
    public static int getSecondOfMinute(String dateTime) {
        String dateA = dateTime.substring(17,19);
      int second = Integer.parseInt(dateA);
      return second;
    }
    
    /**
     * Get the year of dateTime.
     * 
     * @param dateTime a String.
     * @param return an int represents a year.
     */
    
    public static int getYear ( String dateTime ) {
        String dateB = dateTime.substring(6,10);
        return Integer.parseInt(dateB);
    }    
    
    /**
     * Determines if dateTime is between dateTime1 and dateTime2.
     * 
     * @param dateTime a String.
     * @param dateTime1 a String.
     * @param dateTime2 a String.
     * @return boolean.
     */
    public static boolean isInPeriod(String dateTime, String dateTime1, String dateTime2){
        boolean between = false;
        if (compareTo(dateTime,dateTime1) == 1 && compareTo(dateTime,dateTime2) == -1){ 
            between = true;
        } 
        return between;
    }
    
    /**
     * Determines if dateTime2 is after dateTime1.
     * 
     * @param dateTime1 a String.
     * @param dateTime2 a String.
     * @return boolean.
     */
    
    public static boolean isAfter(String dateTime1, String dateTime2) {
        return compareTo(dateTime1,dateTime2) == -1;
    }
    
    /**
     * Determines if dateTime is after now.
     * 
     * @param dateTime1 a String.
     * @return boolean.
     */
    
    public static boolean isAfterNow(String dateTime) {
        String dateTime1 = now();
        return compareTo(dateTime,dateTime1) == 1;
    }
    
    /** 
     * Determines if dateTime2 is before dateTime1.
     * 
     * @param dateTime1 a String.
     * @param dateTime2 a String.
     * @return boolean.
     */
    
    public static boolean isBefore(String dateTime1, String dateTime2) {
        return compareTo(dateTime1,dateTime2) == 1;
    }
    
    /**
     * Determines if dateTime is before now.
     * 
     * @param dateTime1 string.
     * @param return a boolean.
     */
    public static boolean isBeforeNow(String dateTime1) {
        return compareTo(dateTime1,now()) == -1;
    }
    
    /**
     * Determines if dateTime format is a valid Europena date format: dd/mm/yyyy-hh:mm:ss
     * 
     * @param dateTime a String.
     * @return boolean true if is valid.
     */
    
    public static boolean isValid(String dateTime) {     
        String dates[] = dateToArray(dateTime);
        boolean cmon = true;
        // are valids integers.
        for ( int i = 0; i < dates.length && cmon; i++ ) {
            if ( dates[i].length() != 2 && i == 0 ) {
                cmon = false;
            } else if ( dates[i].length() != 2 && i == 1 ) {
                cmon = false;
            } else if ( dates[i].length() != 4 && i == 2 ) {
                cmon = false;
            } else if ( dates[i].length() != 2 && i == 3 ) {
                cmon = false;
            } else if ( dates[i].length() != 2 && i == 4 ) {
                cmon = false;
            } else if ( dates[i].length() != 2 && i == 5 ) {
                cmon = false;
            }
        }
        // If integers are valids, review "/" ":" "-"
        if ( cmon ) {
            if ( !dateTime.substring(2,3).equals("/") ) {
                cmon = false;
            } else if ( !dateTime.substring(5,6).equals("/") ) {
                cmon = false;
            } else if ( !dateTime.substring(10,11).equals("-") ) {
                cmon = false;
            } else if ( !dateTime.substring(13,14).equals(":") ) {
                cmon = false;
            } else if ( !dateTime.substring(16,17).equals(":") ) {
                cmon = false;
            }
        }
        return cmon;
    }
    
    /**
     * 
     * Returns a copy of this datetime minus the specified number of days.
     * 
     * @param dateTime a string, days an integer.
     * @return dateTime without days.
     */
    
    public static String minusDays(String dateTime, int days) {
        int dates[] = dateToArrayInt(dateTime);
        long daysx = calculeX (dates[2],dates[1],dates[0]);
        daysx = daysx - days;
        long end[] = calculateXX(daysx);
        return createDate((int) end[2],(int) end[1],(int) end[0],dates[3],dates[4],dates[5]);
    }
    
    /**
     * Returns a copy of this datetime minus the specified number of hours.
     * 
     * @param datetime a string, hours an integer.
     * @return a string minus hours.
     */
    
    public static String minusHours(String dateTime, int hours){
        return minusSeconds(dateTime,hours*60*60);
    }
    
    /**
     * Returns a copy of this datetime minus the specified number of minutes.
     * 
     * @param dateTime a String.
     * @param minutes an int.
     * @return String.
     */
    
    public static String minusMinutes(String dateTime, int minutes) {
        return minusSeconds(dateTime,minutes*60);
    }
    
    /**
     * Returns a copy of this datetime minus the specified number of months.
     * 
     * @param dateTime a String.
     * @param months an int.
     * @return String.
     */
    
    public static String minusMonths(String dateTime, int months) {
        int date[] = dateToArrayInt(dateTime);
        int dat = date[1];
        int leap = 0;
        int notleap = 0;
        for ( int i = 0 ; i < months ; i++) {
            dat += 1;
            if ( !isLeap(date[2]) ) {
                notleap++;
            } else {
                leap++;
            }
        }
        leap = leap * 29;
        notleap = notleap * 28;
        long monthsx = calculeX (date[2] -(months/12) ,date[1] - months ,date[0]);
        long end[] = calculateXX(monthsx);
        return createDate((int) end[2],(int) end[1],(int) end[0],date[3],date[4],date[5]);   
    }
    
    /**
     * Returns a copy of this datetime minus the specified number of seconds.
     * 
     * @param dateTime a String.
     * @param seconds an int.
     * @return String.
     */
    public static String minusSeconds(String dateTime, int seconds) {
        int date[] = dateToArrayInt(dateTime); 
        long torest[] = s2dhms(seconds);
        long finsec = 0;
        long finhor = 0;
        long finmin = 0;
        int minplus = 0;
        int hourplus = 0;
        int dayplus = 0;
        if ( date[5] < torest[3] ) {
            finsec = 60 + date[5] - torest[3];
            minplus++;
        } else {
            finsec = date[5] - torest[3];
        }
        torest[2] += minplus;
        if ( date[4] < torest[2] ) {
            finmin = 60 + date[4] - torest[2];
            hourplus++;
        } else {
            finmin = date[4] - torest[2];
        }
        torest[1] += hourplus;
        if ( date[3] < torest[1] ) {
            finhor = 24 + date[3] - torest[1];
            dayplus++; 
        } else {
            finhor = date[3] - torest[1];
        }
        long days = torest[0] + dayplus;
        long daysx = calculeX (date[2],date[1],date[0]);
        daysx = daysx - days;
        long dateend[] = calculateXX (daysx);
        return createDate((int) dateend[2], (int) dateend[1], (int) dateend[0],(int) finhor, (int)  finmin, 
                          (int) finsec);
    } 
    
    
    /**
     * Returns a copy of this datetime minus the specified number of weeks.
     * 
     * @param dateTime a String.
     * @param weeks an int
     * @return String.
     */
    
    public static String minusWeeks(String dateTime, int weeks) {
        int dates[] = dateToArrayInt(dateTime);
        long daysx = calculeX (dates[2],dates[1],dates[0]);
        daysx = daysx - weeks*7;
        long end[] = calculateXX(daysx);
        return createDate((int) end[2],(int) end[1],(int) end[0],dates[3],dates[4],dates[5]);   
    }
    
    /**
     * Returns a copy of this datetime minus the specified number of years.
     * 
     * @param dateTime a String.
     * @param years an int.
     * @return String.
     */
    
    public static String minusYears(String dateTime, int years) {
        int date[] = dateToArrayInt(dateTime);
        // take the year.
        int dat = date[2];
        // counters for leap or not leap years.
        int leap = 0;
        int notleap = 0;
        for ( int i = 0; i < years; i++ ) {
            dat += 1;
            // is not leap.
            if ( !isLeap(dat) ) {
                notleap++;
            } else {
                leap++;
            }
        }
        // now calcule days for agree.
        leap = leap * 366;
        notleap = notleap * 365;
        long daysx = calculeX (date[2],date[1],date[0]);
        daysx = daysx - leap - notleap;
        long end[] = calculateXX(daysx);
        return createDate ((int) end[2],(int) end[1],(int) end[0],date[3],date[4],date[5]);
    }
    
    /**
     * Returns a copy of this datetime plus the specified number of days.
     * 
     * @param dateTime a String.
     * @param days an int.
     * @return String.
     */
    
    public static String plusDays(String dateTime, int days) {
        int dates[] = dateToArrayInt(dateTime);
        long daysx = calculeX (dates[2],dates[1],dates[0]);
        daysx = daysx + days;
        long end[] = calculateXX(daysx);
        return createDate((int) end[2],(int) end[1],(int) end[0],dates[3],dates[4],dates[5]);   
    }
    
    /**
     * Returns a copy of this datetime plus the specified number of hours.
     * 
     * @param dateTime a String.
     * @param hours an int.
     * @return String.
     */
    
    public static String plusHours(String dateTime, int hours) {
        return plusSeconds(dateTime,hours*3600);
    }
    
    /**
     * Returns a copy of this datetime plus the specified number of minutes.
     * 
     * @aram dateTime a String.
     * @param minutes an int.
     * @return String.
     */
    
    public static String plusMinutes(String dateTime, int minutes) {
        return plusSeconds(dateTime,minutes*60);
    }
    
    /**
     * Returns a copy of this datetime plus the specified number of months.
     * 
     * @param dateTime a String.
     * @param months an int.
     * @return String.
     */
    
    public static String plusMonths(String dateTime, int months) {
        int date[] = dateToArrayInt(dateTime);
        int dat = date[1];
        int leap = 0;
        int notleap = 0;
        for ( int i = 0 ; i < months ; i++) {
            dat += 1;
            if ( !isLeap(date[2]) ) {
                notleap++;
            } else {
                leap++;
            }
        }
        leap = leap * 29;
        notleap = notleap * 28;
        long monthsx = calculeX (date[2] +(months/12) ,date[1] + months ,date[0]);
        long end[] = calculateXX(monthsx);
        return createDate((int) end[2],(int) end[1],(int) end[0],date[3],date[4],date[5]);   
    }
    
    /**
     * Returns a copy of this datetime plus the specified number of seconds.
     * 
     * @param dateTime an String, seconds an integer.
     * @return String with plus seconds.
     */
    
    public static String plusSeconds(String dateTime, int seconds){
        int date[] = dateToArrayInt(dateTime);
        long totalsec = date[5] + date[4] * 60 + date[3] * 60 * 60 + seconds;
        long date2[] = s2dhms(totalsec);
        long days = date2[0];
        long daysx = calculeX (date[2],date[1],date[0]);
        daysx = daysx + days;
        long dateend[] = calculateXX (daysx);
        return createDate((int) dateend[2], (int) dateend[1], (int) dateend[0],(int) date2[1], (int) date2[2], (int) date2[3]);
    }
    
    /**
     * Returns a copy of this datetime plus the specified number of weeks.
     * 
     * @param dateTime an String, weeks an integer.
     * @return String with plus weeks.
     */
    
    public static String plusWeeks(String dateTime, int weeks) {
        int dates[] = dateToArrayInt(dateTime);
        long daysx = calculeX (dates[2],dates[1],dates[0]);
        daysx = daysx + weeks*7;
        long end[] = calculateXX(daysx);
        return createDate((int) end[2],(int) end[1],(int) end[0],dates[3],dates[4],dates[5]);   
    }
    
    
    /**
     * Returns a copy of this datetime plus the specified number of years.
     * 
     * @param dateTime a string, years an integer.
     * return@ String with plusyears.
     */
    
    public static String plusYears(String dateTime, int years) {
        int date[] = dateToArrayInt(dateTime);
        // take the year.
        int dat = date[2];
        // counters for leap or not leap years.
        int leap = 0;
        int notleap = 0;
        for ( int i = 0; i < years; i++ ) {
            dat += 1;
            // is not leap.
            if ( !isLeap(dat) ) {
                notleap++;
            } else {
                leap++;
            }
        }
        // now calcule days for agree.
        leap = leap * 366;
        notleap = notleap * 365;
        long daysx = calculeX (date[2],date[1],date[0]);
        daysx = daysx + leap + notleap;
        long end[] = calculateXX(daysx);
        return createDate ((int) end[2],(int) end[1],(int) end[0],date[3],date[4],date[5]);
    }
    
    /**
     * Converts dateTime to American format yyyy/mm/dd-hh:mm:ss
     * 
     * @param dateTime a String.
     * @return a String.
     */
    
    public static String toAmericanFormat ( String dateTime ) { 
        int date[] = dateToArrayInt(dateTime);
        return date[2]+"/"+date[1]+"/"+date[0]+"-"+date[3]+":"+date[4]+":"+date[5];
    }
    
    /**
     * Returns a copy of this datetime with the specified date, retaining the time fields.
     * 
     * @param dateTime a string.
     * @param year an integer.
     * @param monthOfYear and integer.
     * @param dayOfMonth and integer.
     * @return a copy modificating date.
     */
    
    
    public static String withDate(String dateTime, int year, int monthOfYear, int dayOfMonth) {   
        int date[] = dateToArrayInt(dateTime);
        return createDate (dayOfMonth,monthOfYear,year,date[3],date[4],date[5]);
    }
    
    /**
     * Returns a copy of this datetime with the day of month field updated.
     * 
     * @param dateTime a string, dayOfMonth an integer.
     * @return a copy updated of datetime.
     */
    
    public static String withDayOfMonth(String dateTime, int dayOfMonth) {
        int date[] = dateToArrayInt(dateTime);
        return createDate (dayOfMonth, date[1], date[2], date[3], date[4], date[5]);
    }
    
    /**
     * Returns a copy of this datetime with the day of week field updated.
     * 
     * @param dateTime a string, dayOfWeek an integer.
     * @return a copy updated of datetime.
     */
    
    public static String withDayOfWeek(String dateTime, int dayOfWeek) {
        int date[] = dateToArrayInt(dateTime);
        return createDate (date[0], dayOfWeek, date[2], date[3], date[4], date[5]);
    }
    
    /**
     * Returns a copy of this datetime with the day of year field updated.
     * 
     * @param dateTime a string, dayOfYear an integer.
     * @return a copy updated of datetime.
     */
    
    public static String withDayOfYear(String dateTime, int dayOfYear) {
        int date[] = dateToArrayInt(dateTime);
        return createDate (date[0], date[1], dayOfYear, date[3], date[4], date[5]);
    }
    
    /**
     * Returns a copy of this datetime with the hour of day field updated.
     * 
     * @param dateTime a String.
     * @param hour an int.
     * @return a String.
     */
    
    public static String withHourOfDay(String dateTime, int hour) {
        int date[] = dateToArrayInt(dateTime);
        return createDate (date[0], date[1], date[2], hour, date[4], date[5]);
    }
    
    /**
     * Returns a copy of this datetime with the minute of hour updated.
     * 
     * @param dateTime a String.
     * @param minute an int.
     * @return a String.
     */
    
    public static String withMinuteOfHour(String dateTime, int minute){
        int date[] = dateToArrayInt(dateTime);
        return createDate (date[0], date[1], date[2], date[3], minute, date[5]);
    }
    
    /**
     * Returns a copy of this datetime with the month of year field updated.
     * 
     * @param dateTime a String.
     * @param monthOfYear an int.
     * @return a String.
     */
    
    public static String withMonthOfYear(String dateTime, int monthOfYear) {
        int date[] = dateToArrayInt (dateTime);
        return createDate (date[0], monthOfYear, date[2], date[3], date[4], date[5]);            
    }
    
    /**
     * Returns a copy of this datetime with the specified time, retaining the date fields.
     * 
     * @param dateTime a String.
     * @param second an int.
     * @return a String.
     */
    
    public static String withSecondOfMinute(String dateTime, int second) {
        int date[] = dateToArrayInt(dateTime);
        return createDate (date[0], date[1], date[2], date[3], date[4], second);
    }
    
    /**
     * Returns a copy of this datetime with the specified time, retaining the date fields.
     * 
     * @param dateTime a String.
     * @param hourOfDay an int.
     * @param minuteOfHour an int.
     * @param secondOfMinute an int.
     * @return a String.
     */
    
    public static String withTime(String dateTime, int hourOfDay, int minuteOfHour, int secondOfMinute) {
        String hours = fillWith0(hourOfDay,2);
        String minutes = fillWith0(minuteOfHour,2);
        String seconds = fillWith0(secondOfMinute,2);
        int date[] = dateToArrayInt (dateTime);
        return createDate (date[0], date[1], date[2],Integer.parseInt(hours),Integer.parseInt(minutes),Integer.parseInt(seconds));   
    }
    
    /**
     * Returns a copy of this datetime with the time set to the start of the day.
     * 
     * @param dateTime a string.
     * @return string reset day.
     */
    
    public static String withTimeAtStartOfDay(String dateTime) {
        int dates[] = dateToArrayInt (dateTime);
        return createDate ( dates[0], dates[1], dates[2], 00,00,00 );
    }
    
    /**
     * Returns a copy of this datetime with the year field updated.
     * 
     * @param dateTime a String.
     * @param second an int.
     * @return a String.
     */
    
    public static String withYear(String dateTime, int year) {
        int date [] = dateToArrayInt(dateTime);
        return createDate (date[0], date[1], year,date[3], date[4], date[5]);
    }
    
    
    
    /**
     * Converts X date (year,month,day) to X days after 1970.
     * @param y, m, d a long number.
     * @return long.
     */
    
    public static long calculeX ( long y, long m, long d ) {
        m = (m + 9) % 12;
        y = y - m/10;
        return 365*y + y/4 - y/100 + y/400 + (m*306 + 5)/10 + ( d - 1 );
    }
    
    /**
     * Convers X days after 1970 to real date in array of longs.
     * @param g long number.
     * @return dates an array long.
     */
    
    public static long[] calculateXX ( long g) {
        long y = (10000*g + 14780)/3652425;
        long ddd = g - (365*y + y/4 - y/100 + y/400);
        if (ddd < 0) {
            y = y - 1;
            ddd = g - (365*y + y/4 - y/100 + y/400);
        }
        long mi = (100*ddd + 52)/3060;
        long mm = (mi + 2)%12 + 1;
        y = y + (mi + 2)/12;
        long dd = ddd - (mi*306 + 5)/10 + 1;
        String date = y + ":" + mm + ":" + dd;
        long dates[] = {y,mm,dd};
        return dates;
    }
    
    /**
     * Converts from seconds to days, hour, minutes and seconds in array of long.
     * 
     * @param s a long number (seconds).
     * @return an array of long.
     */
    
    private static long[] s2dhms(long s) {
        long d, h, rs, m;
        d = s / (24 * 3600); // Entire days
        rs = s % (24 * 3600); // Rest of seconds
        h = rs / 3600; // Entire hours
        rs = rs % 3600; // Rest of seconds
        m = rs / 60; // Entire minutes
        rs = rs % 60; // Rest of seconds
        long a[] = {d, h, m,rs};
        return a;
    }
}
