package nix;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world! From Mykola");
        Main main = new Main();
        main.printLuckyNumber();
    }

    public void printLuckyNumber() {
        System.out.println("Your lucky number is " + new Random().nextInt(10));
    }

}