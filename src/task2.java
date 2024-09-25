import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {

        try {
            final Scanner sc = new Scanner(System.in);
            System.out.println("Enter example: ");
            String input = sc.nextLine();
            input = input.replaceAll(" ", "");
            System.out.println(parseStr(input));
        } catch (Exception e) {
           System.err.println("Wrong input");
        }
    }

    private static double parseStr(String s){
        String n1 = "";
        String oper = "";
        String n2 = "";

        int i = 0;

        while (i < s.length() && !Character.isDigit(s.charAt(i))) {
            i++;
        }

        while (i < s.length() && Character.isDigit(s.charAt(i))) {
            n1 += s.charAt(i);
            i++;
        }

        while (i < s.length() && !Character.isDigit(s.charAt(i))) {
            oper += s.charAt(i);
            i++;
        }


        while (i < s.length() && Character.isDigit(s.charAt(i))) {
            n2 += s.charAt(i);
            i++;
        }

        double number1 = Double.parseDouble(n1);
        double number2 = Double.parseDouble(n2);

        return calc(number1, oper, number2);
    }

    private static double calc(double n1, String oper, double n2) {
        return switch (oper) {
            case "+" -> n1 + n2;
            case "-" -> n1 - n2;
            case "*" -> n1 * n2;
            case "/" -> {
                if (n2 == 0) {
                    throw new ArithmeticException();
                }
                yield   n1 / n2;
            }
            default -> throw new IllegalArgumentException();
        };

    }
}


