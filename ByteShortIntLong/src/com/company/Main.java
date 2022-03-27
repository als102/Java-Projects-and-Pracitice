package com.company;

public class Main {

    public static void main(String[] args) {

        int myValue = 10000;
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value "+myMinIntValue);
        System.out.println("Integer Max Value "+myMaxIntValue);
        System.out.println("Busted "+(myMaxIntValue + 1)); //overflow
        System.out.println("Busted Min: " +(myMinIntValue - 1)); //underflow

        int myMaxIntTest = 2_147_483_647;

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;

        System.out.println("My min Byte: "+ myMinByteValue);
        System.out.println("My max Byte: "+ myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;

        System.out.println("My max short: "+ myMaxShortValue);
        System.out.println("My min short: "+ myMinShortValue);

        long myLong = 1000L;

        long myMinlongValue = Long.MIN_VALUE;
        long myMaxlongValue = Long.MAX_VALUE;

        System.out.println("My min long: "+ myMinlongValue);
        System.out.println("My max long: "+ myMaxlongValue);

        long BigLong = 2_147_483_647123L;
        System.out.println(BigLong);

        int myTotal =(myMaxIntTest /2);

        byte newByteValue = (byte) (myMinByteValue /2);
        short newShortValue = (short) (myMinShortValue /2);

        byte myByte = 10;
        short myShort = 20;
        int  myInt = 50;
        long mySum = (myByte+myShort+myInt);
        long myLongOne = 50000L + (10L * mySum);
        short myShortTest = (short) (50000 + (10 * mySum));
        System.out.println(myLongOne);
        System.out.println(myShortTest);

    }
}
