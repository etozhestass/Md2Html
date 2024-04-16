package hw9.md2html;

public class Counter<T> {
    private final T str;
    private int count;

    Counter(T str) {
        this.str = str;
        this.count = 0;
    }
    T getFirst() {
        return str;
    }
    int getSecond() {
        return count;
    }

    void plusCount() {
        count++;
    }
    void minusCount() {
        count--;
    }
    void zeroCount() {
        count = 0;
    }
}
