package main.practice.first;

public class Main {
    private static void splitFiveNumber(int num) {
        System.out.printf("%d%n%d%n%d%n%d%n%d", num / 10_000, num / 1_000 % 10, num / 100 % 10, num / 10 % 10, num % 10);
    }

    public static void main(String[] args) {
        splitFiveNumber(54689);

    }
}
