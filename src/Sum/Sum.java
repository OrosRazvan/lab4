package Sum;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti numarul: ");
        int n = scanner.nextInt();
        scanner.close();

        int sum = 0, ultim = 0;
        while(n != 0){
            ultim = n % 10;
            sum += ultim;
            n = n/10;
        }
        System.out.println("Suma = " + sum);
    }
}
