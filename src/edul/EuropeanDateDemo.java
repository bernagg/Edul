/*
 * EuropeanDateDemo.java        1.0 27/01/2013
 *
 * Demo of European Date Utils Library.
 *
 * Copyright 2013 Bernabe Gonzalez Garcia <bernagg@outlook.com>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

package edul;
import java.util.Scanner;

/**
 * Demo of European Date Utils Library.
 */

public class EuropeanDateDemo {

    /**
     * Demo.
     * @param args Not used.
     */
    
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int op = 666;
        while (op != 0) {
            switch (op) {
                case 666:
                    System.out.println("EUROPEAN DATE UTILS LIBRARY DEMO");
                    System.out.println("================================");
                    System.out.print("1. EuropeanDate.areEqual(String dateTime1, String dateTime2)\n   Determines if dateTime1 and dateTime2 are equal.\n");
                    System.out.print("2. EuropeanDate.areEqual(String[] dateTimes)\n   Determines if all datetimes in array dateTimes are equal.\n");
                    System.out.print("3. EuropeanDate.createDate(int dayOfMonth, int monthOfYear, int year)\n   Generates a string with the following format: dd/mm/yyyy-00:00:00\n");
                    System.out.print("4. EuropeanDate.createDate(int dayOfMonth, int monthOfYear, int year, int hour, int minutes)\n   Generates a string with the following format: dd/mm/yyyy-hh:mm:00\n");
                    System.out.print("5. EuropeanDate.createDate(int dayOfMonth, int monthOfYear, int year, int hour, int minutes, int seconds)\n   Generates a string with the following format: dd/mm/yyyy-hh:mm:ss\n");                  
                    System.out.print("6. EuropeanDate.compareTo(String dateTime1, String dateTime2)\n   Compares dateTime1 to dateTime2. Returns a negative integer,zero,or a positive integer as dateTime1 is before,equal to,or afterdateTime2.\n");
                    System.out.print("7. EuropeanDate.getCentury(String dateTime)\n   Get the centuri of dateTime.\n");
                    System.out.print("8. EuropeanDate.getDayOfMonth(String dateTime)\n   Get the day of month field.\n");
                    System.out.print("9. EuropeanDate.getDayOfWeek(String dateTime)\n   Get the day of week. Returns 0 if the day is a Sunday; 1 if it is a Monday, and so on through the week until 6 for a Saturday.\n");
                    System.out.print("10. EuropeanDate.getDayOfYear(String dateTime)\n    Get the day of year. Returns 1 if the date is January 1st, and so on through the year until 365 or 366 (for a leap year) for December 31st.\n");
                    System.out.print("11. EuropeanDate.getHourOfDay(String dateTime)\n    Get the hour of day field.\n");
                    System.out.print("12. EuropeanDate.getMinuteOfDay(String dateTime)\n    Get the minute of day. Returns 0 if time is 00:00 and so on through the day until 1439 if time is 23:59\n");
                    System.out.print("13. EuropeanDate.getMinuteOfHour(String dateTime)\n    Get the minute of hour field.\n");
                    System.out.print("14. EuropeanDate.getMonthOfYear(String dateTime)\n    Get the month of year field.\n");
                    System.out.print("15. EuropeanDate.getSecondOfDay(String dateTime)\n    Get the second of day. Returns 0 if time is 00:00:00 and so on through the day until 86399 if time is 23:59:59\n");
                    System.out.print("16. EuropeanDate.getSecondOfMinute(String dateTime)\n    Get the second of minute field.\n");
                    System.out.print("17. EuropeanDate.getYear(String dateTime)\n    Get the year field.\n");
                    System.out.print("18. EuropeanDate.isInPeriod(String dateTime, String dateTime1, String dateTime2)\n    Determines if dateTime is between dateTime1 and dateTime2. \n");
                    System.out.print("19. isAfter(String dateTime1, String dateTime2)\n    Determines if dateTime2 is after dateTime1.\n");
                    System.out.print("20. EuropeanDate.isAfterNow(String dateTime)\n    Determines if dateTime is after now.\n");
                    System.out.print("21. EuropeanDate.isBefore(String dateTime1, String dateTime2)\n    Determines if dateTime2 is before dateTime1.\n");
                    System.out.print("22. EuropeanDate.isBeforeNow(String dateTime1)\n    Determines if dateTime is before now.\n");
                    System.out.print("23. EuropeanDate.isValid(String dateTime)\n    Determines if dateTime format is a valid Europena date format: dd/mm/yyyy-hh:mm:ss\n");
                    System.out.print("24. EuropeanDate.minusDays(String dateTime, int days)\n    Returns a copy of this datetime minus the specified number of days.\n");
                    System.out.print("25. EuropeanDate.minusHours(String dateTime, int hours)\n    Returns a copy of this datetime minus the specified number of hours.\n");
                    System.out.print("26. EuropeanDate.minusMinutes(String dateTime, int minutes)\n    Returns a copy of this datetime minus the specified number of minutes.\n");
                    System.out.print("27. EuropeanDate.minusMonths(String dateTime, int months)\n    Returns a copy of this datetime minus the specified number of months.\n");
                    System.out.print("28. EuropeanDate.minusSeconds(String dateTime, int seconds)\n    Returns a copy of this datetime minus the specified number of seconds.\n");
                    System.out.print("29. EuropeanDate.minusWeeks(String dateTime, int weeks)\n    Returns a copy of this datetime minus the specified number of weeks.\n");
                    System.out.print("30. EuropeanDate.minusYears(String dateTime, int years)\n    Returns a copy of this datetime minus the specified number of years.\n");
                    System.out.print("31. EuropeanDate.now()\n    Returns a datetime with the current date.\n");
                    System.out.print("32. EuropeanDate.plusDays(String dateTime, int days)\n    Returns a copy of this datetime plus the specified number of days.\n");
                    System.out.print("33. EuropeanDate.plusHours(String dateTime, int hours)\n    Returns a copy of this datetime plus the specified number of hours.\n");
                    System.out.print("34. EuropeanDate.plusMinutes(String dateTime, int minutes)\n    Returns a copy of this datetime plus the specified number of minutes.\n");
                    System.out.print("35. EuropeanDate.plusMonths(String dateTime, int months)\n    Returns a copy of this datetime plus the specified number of months.\n");
                    System.out.print("36. EuropeanDate.plusSeconds(String dateTime, int seconds)\n    Returns a copy of this datetime plus the specified number of seconds.\n");
                    System.out.print("37. EuropeanDate.plusWeeks(String dateTime, int weeks)\n    Returns a copy of this datetime plus the specified number of weeks.\n");
                    System.out.print("38. EuropeanDate.plusYears(String dateTime, int years)\n    Returns a copy of this datetime plus the specified number of years.\n");
                    System.out.print("39. EuropeanDate.toAmericanFormat(String dateTime)\n    Converts dateTime to American format yyyy/mm/dd-hh:mm:ss.\n");
                    System.out.print("40. EuropeanDate.withDate(String dateTime, int year, int monthOfYear, int dayOfMonth)\n    Returns a copy of this datetime with the specified date, retaining the time fields.\n");
                    System.out.print("41. EuropeanDate.withDayOfMonth(String dateTime, int dayOfMonth)\n    Returns a copy of this datetime with the day of month field updated.\n");
                    System.out.print("42. EuropeanDate.withDayOfWeek(String dateTime, int dayOfWeek)\n    Returns a copy of this datetime with the day of week field updated.\n");
                    System.out.print("43. EuropeanDate.withDayOfYear(String dateTime, int dayOfYear)\n    Returns a copy of this datetime with the day of year field updated.\n");
                    System.out.print("44. EuropeanDate.withHourOfDay(String dateTime, int hour)\n    Returns a copy of this datetime with the hour of day field updated.\n");
                    System.out.print("45. EuropeanDate.withMinuteOfHour(String dateTime, int minute)\n    Returns a copy of this datetime with the minute of hour updated.\n");
                    System.out.print("46. EuropeanDate.withMonthOfYear(String dateTime, int monthOfYear)\n    Returns a copy of this datetime with the month of year field updated.\n");
                    System.out.print("47. EuropeanDate.withSecondOfMinute(String dateTime, int second)\n    Returns a copy of this datetime with the second of minute field updated.\n");
                    System.out.print("48. EuropeanDate.withTime(String dateTime, int hourOfDay, int minuteOfHour, int secondOfMinute)\n    Returns a copy of this datetime with the specified time, retaining the date fields.\n");
                    System.out.print("49. EuropeanDate.withTimeAtStartOfDay(String dateTime)\n    Returns a copy of this datetime with the time set to the start of the day.\n");
                    System.out.print("50. EuropeanDate.withYear(String dateTime, int year)\n    Returns a copy of this datetime with the year field updated.\n");
                    break;
                case 1:
                    System.out.print("\n\nEXEMPLE: EuropeanDate.areEquals(String dateTime1, String dateTime2)\n\n");
                    System.out.println("dateTime1 = 21/11/2013-21:23:23");
                    System.out.println("dateTime2 = 21/11/2013-21:23:23"); 
                    System.out.println("European.areEquals = " + EuropeanDate.areEqual("21/11/2013-21:23:23","21/11/2013-21:23:23"));
                    break;
                case 2:
                    System.out.print("\n\nEXEMPLE: EuropeanDate.areEquals(String dateTime[])\n\n");
                    System.out.println("dateTime [] = {\"11/01/2011-21:23:45\",\"11/01/2011-21:23:45\",\"11/01/2011-21:23:45}"); 
                    String a[] = {"11/01/2011-21:23:45","11/01/2011-21:23:45","11/01/2011-21:23:45"};
                    System.out.println("European.areEquals = " + EuropeanDate.areEqual(a));
                    break;
                case 3:
                    System.out.print("\n\nEXEMPLE: EuropeanDate.createDate(int dayOfMonth, int monthOfYear, int year)\n\n");
                    System.out.println("int dayOfMonth = 21 int monthOfYear = 05 int year = 2012");
                    System.out.println("European.createDate = " + EuropeanDate.createDate(21,05,2012));
                    break;
                case 4:
                    System.out.print("\n\nEXEMPLE: EuropeanDate.createDate(int dayOfMonth, int monthOfYear, int year, int hour, int minute)\n\n");
                    System.out.println("int dayOfMonth = 21 int monthOfYear = 05 int year = 2012 int hour = 12 int minute = 15");
                    System.out.println("European.createDate = " + EuropeanDate.createDate(21,05,2012,12,15));
                    break;
                case 5:
                    System.out.print("\n\nEXEMPLE: EuropeanDate.createDate(int dayOfMonth, int monthOfYear, int year, int hour, int minute, int second)\n\n");
                    System.out.println("int dayOfMonth = 21 int monthOfYear = 05 int year = 2012 int hour = 12 int minute = 15 int second = 18");
                    System.out.println("European.createDate = " + EuropeanDate.createDate(21,05,2012,12,15,18));
                    break;
                case 6:
                    System.out.print("\n\nEXEMPLE: EuropeanDate.compareTo(String dateTime1, String dateTime2)\n\n");
                    System.out.println("dateTime1 = 21/11/2013-21:23:22");
                    System.out.println("dateTime2 = 21/11/2013-21:23:23"); 
                    System.out.println("European.compareTo = " + EuropeanDate.compareTo("19/11/2013-21:23:22","21/11/2013-21:23:22"));
                    System.out.println("dateTime1 = 21/11/2013-21:23:23");
                    System.out.println("dateTime2 = 21/11/2013-21:23:23");
                    System.out.println("European.compareTo = " + EuropeanDate.compareTo("21/11/2013-21:23:22","21/11/2013-21:23:22"));
                    System.out.println("dateTime1 = 21/11/2013-21:23:23");
                    System.out.println("dateTime2 = 21/11/2013-21:23:23");
                    System.out.println("European.compareTo = " + EuropeanDate.compareTo("21/11/2013-21:25:22","21/11/2013-21:23:22"));
                    break;  
                case 7:
                    System.out.print("\n\nEXEMPLE: EuropeanDate.getCentury(String dateTime)\n\n");
                    System.out.println("dateTime = 21/11/2013-21:23:22");
                    System.out.println("European.getCentury = " + EuropeanDate.getCentury("21/11/2013-21:23:22")); 
                    break;
                case 8:
                    System.out.print("\n\nEXEMPLE: EuropeanDate.getDayOfMonth(String dateTime)\n\n");
                    System.out.println("dateTime = 21/11/2013-21:23:22");
                    System.out.println("European.getDayOfMonth = " + EuropeanDate.getDayOfMonth("21/11/2013-21:23:22"));
                    break;
                case 9:     
                    System.out.print("\n\nEXEMPLE: EuropeanDate.getDayOfWeek(String dateTime)\n\n");
                    System.out.println("dateTime = 21/11/2013-21:23:22");
                    System.out.println("European.getDayOfWeek = " + EuropeanDate.getDayOfWeek("21/11/2013-21:23:22")); 
                    break;
                case 10:
                    System.out.print("\n\nEXEMPLE: EuropeanDate.getDayOfYear(String dateTime)\n\n");
                    System.out.println("dateTime = 21/11/2013-21:23:22");
                    System.out.println("European.getDayOfYear = " + EuropeanDate.getDayOfYear("21/11/2013-21:23:22"));  
                    break;
                case 11:
                    System.out.print("\n\nEXEMPLE: EuropeanDate.getHourOfDay(String dateTime)\n\n");
                    System.out.println("dateTime = 21/11/2013-21:23:22");
                    System.out.println("European.getHourOfDay = " + EuropeanDate.getHourOfDay("21/11/2013-21:23:22")); 
                    break;
                case 12:
                    System.out.print("\n\nEXEMPLE: EuropeanDate.getMinuteOfDay(String dateTime)\n\n");
                    System.out.println("dateTime = 21/11/2013-21:23:22");
                    System.out.println("European.getMinuteOfDay = " + EuropeanDate.getMinuteOfDay("21/11/2013-21:23:22"));
                    break;
                case 13:
                    System.out.print("\n\nEXEMPLE: EuropeanDate.getMinuteOfHour(String dateTime)\n\n");
                    System.out.println("dateTime = 21/11/2013-21:23:22");
                    System.out.println("European.getMinuteOfHour = " + EuropeanDate.getMinuteOfHour("21/11/2013-21:23:22"));
                    break;
                case 14:
                    System.out.print("\n\nEXEMPLE: EuropeanDate.getMonthOfYear(String dateTime)\n\n");
                    System.out.println("dateTime = 21/11/2013-21:23:22");
                    System.out.println("European.getMonthOfYear = " + EuropeanDate.getMonthOfYear("21/11/2013-21:23:22"));
                    break;
                case 15:
                    System.out.print("\n\nEXEMPLE: EuropeanDate.getSecondOfDay(String dateTime)\n\n");
                    System.out.println("dateTime = 21/11/2013-21:23:22");
                    System.out.println("European.getSecondOfDay = " + EuropeanDate.getSecondOfDay("21/11/2013-21:23:22")); 
                    break;
                case 16:
                    System.out.print("\n\nEXEMPLE: EuropeanDate.getSecondOfMinute(String dateTime)\n\n");
                    System.out.println("dateTime = 21/11/2013-21:23:22");
                    System.out.println("European.getMonthOfYear = " + EuropeanDate.getMonthOfYear("21/11/2013-21:23:22"));                         
                    break; 
                case 17:
                    System.out.print("\n\nEXEMPLE: EuropeanDate.getYear(String dateTime)\n\n");
                    System.out.println("dateTime = 21/11/2013-21:23:22");
                    System.out.println("European.getYear = " + EuropeanDate.getYear("21/11/2013-21:23:22")); 
                    break;
                case 18:
                    System.out.print("\n\nEXEMPLE: EuropeanDate.isInPeriod(String dateTime, String dateTime1, String dateTime2)\n\n");
                    System.out.println("dateTime = 21/11/2013-21:23:22");
                    System.out.println("dateTime1 = 21/11/2013-21:23:21");
                    System.out.println("dateTime2 = 21/11/2013-21:23:23");                   
                    System.out.println("European.isInPeriod = " + EuropeanDate.isInPeriod("21/11/2013-21:23:22", "21/11/2013-21:23:21", "21/11/2013-21:23:23"));                         
                    System.out.println("dateTime = 21/11/2013-21:23:22");
                    System.out.println("dateTime1 = 21/11/2013-21:23:24");
                    System.out.println("dateTime2 = 21/11/2013-21:23:23");                   
                    System.out.println("European.isInPeriod = " + EuropeanDate.isInPeriod("21/11/2013-21:23:22", "21/11/2013-21:23:24", "21/11/2013-21:23:23"));       
                    break;  
                case 19:
                    System.out.print("\n\nEXEMPLE:  EuropeanDate.isAfter(String dateTime1, String dateTime2)\n\n");
                    System.out.println("dateTime1 = 21/11/2013-21:23:22");
                    System.out.println("dateTime2 = 22/11/2013-21:23:22");
                    System.out.println("European.isAfterNow = " + EuropeanDate.isAfter("21/11/2013-21:23:22","22/11/2013-21:23:22")); 
                    break;             
                case 20:
                    System.out.print("\n\nEXEMPLE:  EuropeanDate.isAfterNow(String dateTime)\n\n");
                    System.out.println("dateTime = 21/11/2013-21:23:22");
                    System.out.println("European.isAfterNow = " + EuropeanDate.isAfterNow("21/11/2013-21:23:22")); 
                    break; 
                case 21:
                    System.out.print("\n\nEXEMPLE: EuropeanDate.isBefore(String dateTime1, String dateTime2)\n\n");
                    System.out.println("dateTime1 = 21/11/2013-21:23:22");
                    System.out.println("dateTime2 = 20/11/2013-21:23:22");
                    System.out.println("European.getMinuteOfDay = " + EuropeanDate.isBefore("21/11/2013-21:23:22","20/11/2013-21:23:22")); 
                    break;            
                case 22:
                    System.out.print("\n\nEXEMPLE:  EuropeanDate.isBeforeNow(String dateTime)\n\n");
                    System.out.println("dateTime = 21/11/2013-21:23:22");
                    System.out.println("European.isBeforeNow = " + EuropeanDate.isBeforeNow("21/11/2013-21:23:22")); 
                    break;
                case 23:
                    System.out.print("\n\nEXEMPLE:  EuropeanDate.isValid(String dateTime)\n\n");
                    System.out.println("dateTime = 21/11/2013-21:23:22");
                    System.out.println("European.isValid = " + EuropeanDate.isValid("21/11/2013-21:23:22")); 
                    break;
                case 24:
                    System.out.print("\n\nEXEMPLE:  EuropeanDate.minusDays(String dateTime,int days)\n\n");
                    System.out.println("dateTime = 21/11/2013-21:23:22");
                    System.out.println("days = 15");
                    System.out.println("European.minusDays = " + EuropeanDate.minusDays("21/11/2013-21:23:22",15)); 
                    break;
                case 25:
                    System.out.print("\n\nEXEMPLE:  EuropeanDate.minusHours(String dateTime,int hours)\n\n");
                    System.out.println("dateTime = 21/11/2013-21:23:22");
                    System.out.println("hours = 15");
                    System.out.println("European.minusHours = " + EuropeanDate.minusHours("21/11/2013-21:23:22",15)); 
                    break;
                case 26:
                    System.out.print("\n\nEXEMPLE:  EuropeanDate.minusMinutes(String dateTime,int minutes)\n\n");
                    System.out.println("dateTime = 21/11/2013-21:23:22");
                    System.out.println("minutes = 15");
                    System.out.println("European.minusMinutes = " + EuropeanDate.minusMinutes("21/11/2013-21:23:22",15)); 
                    break;
                case 27:
                    System.out.print("\n\nEXEMPLE:  EuropeanDate.minusMonths(String dateTime,int months)\n\n");
                    System.out.println("dateTime = 21/11/2013-21:23:22");
                    System.out.println("months = 12");
                    System.out.println("European.minusMonths = " + EuropeanDate.minusMonths("21/11/2013-21:23:22",12)); 
                    break;  
                case 28:
                    System.out.print("\n\nEXEMPLE:  EuropeanDate.minusSeconds(String dateTime,int seconds)\n\n");
                    System.out.println("dateTime = 21/11/2013-21:23:22");
                    System.out.println("seconds = 12");
                    System.out.println("European.minusSeconds = " + EuropeanDate.minusSeconds("21/11/2013-21:23:22",12)); 
                    break;
                case 29:
                    System.out.print("\n\nEXEMPLE:  EuropeanDate.minusWeeks(String dateTime,int weeks)\n\n");
                    System.out.println("dateTime = 21/11/2013-21:23:22");
                    System.out.println("weeks = 12");
                    System.out.println("European.minusWeeks = " + EuropeanDate.minusWeeks("21/11/2013-21:23:22",12)); 
                    break;
                case 30:
                    System.out.print("\n\nEXEMPLE:  EuropeanDate.minusYears(String dateTime,int years)\n\n");
                    System.out.println("dateTime = 21/11/2013-21:23:22");
                    System.out.println("years = 12");
                    System.out.println("European.minusYears = " + EuropeanDate.minusYears("21/11/2013-21:23:22",12)); 
                    break; 
                case 31:
                    System.out.print("\n\nEXEMPLE:  EuropeanDate.now()\n\n");
                    System.out.println("European.now = " + EuropeanDate.now()); 
                    break; 
                case 32:                        
                    System.out.print("\n\nEXEMPLE:  EuropeanDate.plusDays(String dateTime,int days)\n\n");
                    System.out.println("dateTime = 21/11/2013-21:23:22");
                    System.out.println("days = 12");
                    System.out.println("European.plusDays = " + EuropeanDate.plusDays("21/11/2013-21:23:22",12)); 
                    break;
                case 33:                        
                    System.out.print("\n\nEXEMPLE:  EuropeanDate.plusHours(String dateTime,int hours)\n\n");
                    System.out.println("dateTime = 21/11/2013-21:23:22");
                    System.out.println("hours = 12");
                    System.out.println("European.plusHours = " + EuropeanDate.plusHours("21/11/2013-21:23:22",12)); 
                    break; 
                case 34:                        
                    System.out.print("\n\nEXEMPLE:  EuropeanDate.plusMinutes(String dateTime,int minutes)\n\n");
                    System.out.println("dateTime = 21/11/2013-21:23:22");
                    System.out.println("minutes = 12");
                    System.out.println("European.plusMinutes = " + EuropeanDate.plusMinutes("21/11/2013-21:23:22",12)); 
                    break;    
                case 35:                        
                    System.out.print("\n\nEXEMPLE:  EuropeanDate.plusMonths(String dateTime,int months)\n\n");
                    System.out.println("dateTime = 21/11/2013-21:23:22");
                    System.out.println("months = 12");
                    System.out.println("European.plusMonths = " + EuropeanDate.plusMonths("21/11/2013-21:23:22",12)); 
                    break; 
                case 36:                        
                    System.out.print("\n\nEXEMPLE:  EuropeanDate.plusSeconds(String dateTime,int seconds)\n\n");
                    System.out.println("dateTime = 21/11/2013-21:23:22");
                    System.out.println("seconds = 12");
                    System.out.println("European.plusSeconds = " + EuropeanDate.plusSeconds("21/11/2013-21:23:22",12)); 
                    break;    
                case 37:                        
                    System.out.print("\n\nEXEMPLE:  EuropeanDate.plusWeeks(String dateTime,int weeks)\n\n");
                    System.out.println("dateTime = 21/11/2013-21:23:22");
                    System.out.println("weeks = 12");
                    System.out.println("European.plusWeeks = " + EuropeanDate.plusWeeks("21/11/2013-21:23:22",12)); 
                    break;   
                case 38:                        
                    System.out.print("\n\nEXEMPLE:  EuropeanDate.plusYears(String dateTime,int years)\n\n");
                    System.out.println("dateTime = 21/11/2013-21:23:22");
                    System.out.println("years = 12");
                    System.out.println("European.plusYears = " + EuropeanDate.plusYears("21/11/2013-21:23:22",12)); 
                    break;    
                case 39:                        
                    System.out.print("\n\nEXEMPLE:  EuropeanDate.toAmericanFormat(String dateTime)\n\n");
                    System.out.println("dateTime = 21/11/213/21:23.22");
                    System.out.println("European.toAmericanFormat = " + EuropeanDate.toAmericanFormat("21/11/2013-21:23:22")); 
                    break; 
                case 40:                        
                    System.out.print("\n\nEXEMPLE:  EuropeanDate.withDate(String dateTime,int year, int monthOfYear, int dayOfMonth)\n\n");
                    System.out.println("dateTime = 21/11/2013-21:23:22");
                    System.out.println("year = 12");
                    System.out.println("monthOfYear = 11");
                    System.out.println("dayOfMonth = 22");
                    System.out.println("European.withDate = " + EuropeanDate.withDate("21/11/2013-21:23:22",12,11,22)); 
                    break;   
                case 41:                        
                    System.out.print("\n\nEXEMPLE:  EuropeanDate.withDayOfMonth(String dateTime,int dayOfMonth)\n\n");
                    System.out.println("dateTime = 21/11/2013-21:23:22");
                    System.out.println("dayOfMonth = 22");
                    System.out.println("European.withDayOfMonth = " + EuropeanDate.withDayOfMonth("21/11/2013-21:23:22",22)); 
                    break;   
                case 42:                        
                    System.out.print("\n\nEXEMPLE:  EuropeanDate.withDayOfWeek(String dateTime,int dayOfWeek)\n\n");
                    System.out.println("dateTime = 21/11/2013-21:23:22");
                    System.out.println("dayOfWeek = 3");
                    System.out.println("European.withDayOfWeek = " + EuropeanDate.withDayOfWeek("21/11/2013-21:23:22",3)); 
                    break;   
                case 43:                        
                    System.out.print("\n\nEXEMPLE:  EuropeanDate.withDayOfYear(String dateTime,int dayOfYear)\n\n");
                    System.out.println("dateTime = 21/11/2013-21:23:22");
                    System.out.println("dayOfYear = 3");
                    System.out.println("European.withDayOfYear = " + EuropeanDate.withDayOfYear("21/11/2013-21:23:22",3)); 
                    break; 
                case 44:                        
                    System.out.print("\n\nEXEMPLE:  EuropeanDate.withHourOfDay(String dateTime,int hour)\n\n");
                    System.out.println("dateTime = 21/11/2013-21:23:22");
                    System.out.println("hour = 3");
                    System.out.println("European.withHourOfDay = " + EuropeanDate.withHourOfDay("21/11/2013-21:23:22",3)); 
                    break;    
                case 45:                        
                    System.out.print("\n\nEXEMPLE:  EuropeanDate.withMinuteOfHour(String dateTime,int minute)\n\n");
                    System.out.println("dateTime = 21/11/2013-21:23:22");
                    System.out.println("minute = 23");
                    System.out.println("European.withMinuteOfHour = " + EuropeanDate.withMinuteOfHour("21/11/2013-21:23:22",23)); 
                    break;   
                case 46:                        
                    System.out.print("\n\nEXEMPLE:  EuropeanDate.withMonthOfYear(String dateTime,int year)\n\n");
                    System.out.println("dateTime = 21/11/2013-21:23:22");
                    System.out.println("year = 04");
                    System.out.println("European.withMonthOfYear = " + EuropeanDate.withMonthOfYear("21/11/2013-21:23:22",04)); 
                    break;   
                case 47:                        
                    System.out.print("\n\nEXEMPLE:  EuropeanDate.withSecondOfMinute(String dateTime,int second)\n\n");
                    System.out.println("dateTime = 21/11/2013-21:23:22");
                    System.out.println("second = 23");
                    System.out.println("European.withSecondOfMinute = " + EuropeanDate.withSecondOfMinute("21/11/2013-21:23:22",23)); 
                    break;    
                case 48:                        
                    System.out.print("\n\nEXEMPLE:  EuropeanDate.withTime(String dateTime,int hourOfDay, int minuteOfHour, int secondOfMinute)\n\n");
                    System.out.println("dateTime = 21/11/2013-21:23:22");
                    System.out.println("hourOfDay = 12");
                    System.out.println("minuteOfHour = 23");
                    System.out.println("secondOfMinute = 23");
                    System.out.println("European.withTime = " + EuropeanDate.withTime("21/11/2013-21:23:22",12,23,23)); 
                    break;    
                case 49:                        
                    System.out.print("\n\nEXEMPLE:  EuropeanDate.withTimeAtStartOfDay(String dateTime)\n\n");
                    System.out.println("dateTime = 21/11/2013-21:23:22");
                    System.out.println("European.withTimeAtStartOfDay = " + EuropeanDate.withTimeAtStartOfDay("21/11/2013-21:23:22")); 
                    break;  
                case 50:                        
                    System.out.print("\n\nEXEMPLE:  EuropeanDate.withYear(String dateTime, int year)\n\n");
                    System.out.println("dateTime = 21/11/2013-21:23:22");
                    System.out.println("year = 23");
                    System.out.println("European.withYear = " + EuropeanDate.withYear("21/11/2013-21:23:22",23)); 
                    break;   
                default:
                    System.out.println("\n\nError choice!!!!\n");
            }
            System.out.println();
            System.out.print("New select: number, Menu: 666, Exit: 0\n");
            op = sc.nextInt(); 
        }
    }
}


