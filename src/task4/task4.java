package task4;

public class task4 {
    public static void main(String[] args) {
        String input = "Share information about yourself by creating a profile";
        Pair[] pairs = new Pair[input.length()];
        int pairCount = 0;

        for (char c : input.toCharArray()) {
            boolean found = false;
            for (int i = 0; i < pairCount; i++) {
                if (pairs[i].symbol == c) {
                    pairs[i].count++;
                    found = true;
                    break;
                }
            }
            if (!found) {
                pairs[pairCount++] = new Pair(c, 1);
            }
        }

        for (int i = 0; i < pairCount; i++) {
            System.out.println(pairs[i]);
        }
    }
}
