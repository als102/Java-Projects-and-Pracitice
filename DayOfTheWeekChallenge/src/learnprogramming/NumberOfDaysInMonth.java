package learnprogramming;

public class NumberOfDaysInMonth {
    public static boolean isLeapYear(int year) {
        if (year >= 1 && year <= 9999) {
            if (year % 4 == 0)
                return year % 400 == 0 || year % 100 != 0; //divisible give me the % operator
        } else {
            return false;
        }
        return false;
    }
    public static int getDaysInMonth(int month,int year){

        if (month < 1 || month > 12 || year < 1 || year > 9999){
            return -1;
        } if (month == 2 && isLeapYear(year)){
            return 29;
        }
        int daysInMonth = 0;
        switch (month){
            case 1:
            case 8:
            case 5:
            case 3:
            case 7:
            case 10:
            case 12:
                daysInMonth = 31 ;
                break;
            case 2:
                daysInMonth = 28;
                break;
            case 4:
            case 9:
            case 11:
            case 6:
                daysInMonth = 30;
                break;
            default:
                daysInMonth =-1;
                break;
        }
        return daysInMonth;
    }
}
