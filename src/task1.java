import java.util.Scanner;

public class task1 {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        System.out.println("Enter INT: ");
        final int n = sc.nextInt();
        System.out.println("Binary: " + toBinary(n));
    }

    private static String toBinary (int number) {
        String binary = "";

        if (number == 0) {
            return "0";
        }

        while (number > 0) {
            binary = number % 2 + binary;
            number /= 2;
        }

        return binary;
        }
    }
