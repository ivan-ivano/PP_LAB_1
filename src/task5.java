public class task5 {

    private static final String[][] MATRIX = {
            {"Ukraine", "Poland", "Germany"},
            {"France", "Denmark", "Italy"},
            {"Spain", "UK", "Portugal"}
    };
    private static final String SUBSTRING = "al";

    public static void main(String[] args) {
        int count = countSubstring();
        System.out.println("Number of SUBSTRING '" + SUBSTRING + "' in MATRIX: " + count);
    }
    private static int countSubstring() {
        int count = 0;
        for (int i = 0; i < MATRIX.length; i++) {
            for (int j = 0; j < MATRIX[i].length; j++) {
                if (MATRIX[i][j].contains(SUBSTRING)) {
                    count++;
                }
            }
        }
        return count;
    }
}
