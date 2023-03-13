package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int first, second = 50;
        boolean isTrue = false;
        System.out.println("Enter first num: ");
        first = num.nextInt();

        isTrue = first == 51;

        if (first >= second && isTrue) {
            System.out.println("Num is 10");
            System.out.println("\n");
        } else if (first == 45)
            System.out.println("Nim is equal 45");
        else {
            System.out.println("Num is lower than " + second);
        }

        switch (first) {
            case 51:
                System.out.println("Num is equal 51");
                break;
            case 48:
                System.out.println("Num is equal 48");
                break;
            case 57:
                System.out.println("Num is equal 57");
                break;
            default:
                System.out.println("Num is equal something");
        }
    }
}