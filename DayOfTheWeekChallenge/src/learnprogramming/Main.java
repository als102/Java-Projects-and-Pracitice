package learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String day = "Monday";
        printDayOfTheWeek(-1);
        printDayOfTheWeek(0);
        printDayOfTheWeek(1);
        printDayOfTheWeek(2);
        printDayOfTheWeek(3);
        printDayOfTheWeek(4);
        printDayOfTheWeek(5);
        printDayOfTheWeek(6);
        printDayOfTheWeek(day);
        NumberInWord.printNumberInWord(5);

        System.out.println(NumberOfDaysInMonth.getDaysInMonth(1,-2020));

       // System.out.println(NumberOfDaysInMonth.isLeapYear(1600));
    }
    public static void printDayOfTheWeek(int day){
        int daysOfWeek = day;
        switch (daysOfWeek){
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid day");
        }
    }
    public static void printDayOfTheWeek(String  day) {
         String dayOfTheWeek = day;
        if (dayOfTheWeek == "Monday") {
            System.out.println("Monday");
        }else if (dayOfTheWeek == "Tuesday"){
            System.out.println("Tuesday");
        }else if (dayOfTheWeek == "Wed"){
            System.out.println("wed");
        } else if (dayOfTheWeek == "Thur"){
            System.out.println("Thursday");
        }else if(dayOfTheWeek== "Friday"){
            System.out.println("Friday");
        }else if (dayOfTheWeek== "Saturday"){
            System.out.println("Saturday");
        }else {
            System.out.println("Invalid day");
        }
    }


}
