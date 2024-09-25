package task6;

import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number and currency(100 USD into UAH):");
        String input = scanner.nextLine();
        String[] parts = input.split(" ");

        double amount = Double.parseDouble(parts[0]);
        String cur1 = parts[1];
        String cur2 = parts[3];

        double result = convertCurrency.conCurrency(amount, cur1, cur2);
        if (result == -1) {
            System.out.println("Wrong input!");
        } else {
            System.out.println(result);
        }
    }

}