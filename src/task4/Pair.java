package task4;

class Pair {
    char symbol;
    int count;

    Pair(char symbol, int count) {
        this.symbol = symbol;
        this.count = count;
    }

    @Override
    public String toString() {
        return "'" + symbol + "' - " + count;
    }
}
