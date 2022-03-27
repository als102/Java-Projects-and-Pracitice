package learnprogramming;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
	/* switch statement can be a BYTE SHORT CHAR or INT
	* */
        int switchValue = 5;
        switch (switchValue){
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
                // any other case
            case 3: case 4: case 5:
                System.out.println("Was a 3, 4, or 5");
                System.out.println("It was actually a "+switchValue);
                break;
            default:
                System.out.println("Was not 1 or 2");
        }
        char charValue = 'A';
        switch (charValue){
            case 'A':
                System.out.println('A');
                break;
            case 'B':
                System.out.println('B');
            case 'C':
                System.out.println('C');
                break;
            case 'D':
                System.out.println('D');
                break;
            case 'E':
                System.out.println('E');
                break;
            default:
                System.out.println("Not found");
                break;
        }

        String month = "March";

        switch(month.toUpperCase()){
            case "January":
                System.out.println("January");
                break;
            case "Feb":
                System.out.println("Feb");
                break;
            case "March":
                System.out.println("March");
                break;
            default:
                System.out.println("All other months");
                break;
        }
    }
}
