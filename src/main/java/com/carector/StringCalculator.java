package com.carector;

public class StringCalculator {

    public static int add(String numbers) throws Exception {
        int returnValue=0;
        String[] numbersArray = numbers.split(",|\n");
        if (numbersArray.length > 2) {
            throw new RuntimeException("Up to 2 numbers separated by comma (,) are allowed");
        } else {
            for (String number : numbersArray) {
                if (!number.trim().isEmpty()) {
                    int value = Integer.parseInt(number.trim());
                    if(value < 0)
                        throw new Exception("Negatives not allowed.");
                    else if(value < 1000)
                        returnValue+=value; // If it is not a number, parseInt will throw an exception
                }
            }
        }
        return returnValue;
    }
}