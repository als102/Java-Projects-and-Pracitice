package learnprogramming;

public class Main {

    public static void main(String[] args) {
	String  myString = "My string";
        System.out.println("myString is equal to " +myString);
        myString = myString + " \u00A9 2022";
        System.out.println(myString);

        String numberString = "20.55";
        numberString = numberString + "49.95";
        System.out.println(numberString);

    }
}
