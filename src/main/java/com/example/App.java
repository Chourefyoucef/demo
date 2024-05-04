package com.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        double[] numbers = {5.5, 10.0, 15.5, 20.0}; // يمكنك استبدال هذه القيم بالأرقام التي ترغب في حساب متوسطها
        
        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }
        
        double average = sum / numbers.length;
        System.out.println("Average: " + average);
    }
}

