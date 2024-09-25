package task6;

public class convertCurrency {



    public static double conCurrency(double amount, String cur1, String cur2) {
        double rate = getExchangeRate(cur1, cur2);
        if (rate == -1) {
            return -1;
        }
        return amount * rate;
    }

    private static double getExchangeRate(String cur1, String cur2) {
        return switch (cur1 + "-" + cur2) {
            case "UAH-USD" -> 0.024;
            case "USD-UAH" -> 41.24;
            case "UAH-CAD" -> 0.033;
            case "CAD-UAH" -> 30.68;
            case "UAH-EUR" -> 0.022;
            case "EUR-UAH" -> 46.14;
            case "USD-CAD" -> 1.34;
            case "CAD-USD" -> 0.74;
            case "USD-EUR" -> 0.89;
            case "EUR-USD" -> 1.12;
            case "CAD-EUR" -> 0.67;
            case "EUR-CAD" -> 1.50;
            default -> -1;
        };
    }
}
