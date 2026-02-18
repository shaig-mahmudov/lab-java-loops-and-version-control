package org.example;
public class Main {
    public static void main(String[] args) {
        int[] testArray = {10,20,30,40,50};
        int result = differenceBetweenLargestAndSmallest(testArray);
        System.out.println("Difference Between Largest and Smallest: " + result);

        findSmallestAndSecondSmallest(testArray);

        mathematicalExpression(5,5);

    }
    public static int differenceBetweenLargestAndSmallest(int[] numbers){
        if (numbers.length < 1){
            throw new IllegalArgumentException();
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
            if (number < min) {
                min = number;
            }
        }
        return max - min;
    }
    public static void findSmallestAndSecondSmallest(int[] numbers){
        if (numbers.length < 2) {
            throw new IllegalArgumentException("Array must contain at least two elements.");
        }

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int num : numbers) {
            if (num < smallest) {
                secondSmallest = smallest;
                smallest = num;
            } else if (num < secondSmallest && num > smallest) {
                secondSmallest = num;
            }
        }

        System.out.println("Smallest: " + smallest + "\nSecond Smallest: " + secondSmallest);
    }
    public static void mathematicalExpression(int x, int y){
        int result = x*x + ((4*y/5) - x)*((4*y/5) - x);
        System.out.println("Result" + result) ;
    }
}