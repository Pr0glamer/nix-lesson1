package nix;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;



public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world! From Mykola");
        //evenNumbers();
        //printDayOfWeek();
        isPrime(13);
    }

    public void printLuckyNumber() {
        System.out.println("Your lucky number is " + new Random().nextInt(10));
    }

    public static void evenNumbers() {
        int[] numbers = {1,2,3,4,5,6,7,8,9};
        for(int i : numbers) {
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }
    public static boolean isPrime(int num, int dev) {
        if(num == 1 || num == dev) {
            return true;
        }
        if(num % dev == 0) {
            return false;
        }
        return isPrime(num, ++dev);
    }

    public static void isPrime(int num) {
        System.out.println(isPrime(num, 2) ? String.valueOf(num) + " is prime" : String.valueOf(num) + " is not prime");
    }

    public static void printDayOfWeek() {
        DaysOfWeek day = DaysOfWeek.FRIDAY;
        switch (day) {
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> System.out.println("Weekday");
            case SUNDAY, SATURDAY -> System.out.println("Weekend");
        }
    }

}