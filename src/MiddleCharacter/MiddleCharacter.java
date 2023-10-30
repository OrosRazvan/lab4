package MiddleCharacter;

import java.util.Scanner;

public class MiddleCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti cuvantul: ");
        String cuv = scanner.next();
        scanner.close();

        if(cuv.length() % 2 != 0) {
            System.out.println("Caracterul afisat este " + cuv.charAt(cuv.length() / 2));
        }
        else {
            System.out.println(cuv.charAt(cuv.length() / 2 - 1) + " " + cuv.charAt(cuv.length() / 2));
        }
    }
}
