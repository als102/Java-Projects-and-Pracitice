package learnprogramming;

public class Main {

    public static void main(String[] args) {
	String numberAsString = "2018.125";
        System.out.println("numberAsString= " +numberAsString);
        //convert string into a number
        // Wrapper class Integer
        double number = Double.parseDouble(numberAsString);
        System.out.println("Number = "+ number);
        numberAsString += 1;
        number +=1;
        System.out.println("numberAsString = "+ numberAsString);
        System.out.println("number = "+ number);

       boolean flour = FlourPacker.canPack(1,0,4);
        System.out.println(flour);
        int prime = LargestPrime.getLargestPrime(392832);
        System.out.println("largest Prime is "+ prime);
    }
}
