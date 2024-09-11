package main.practice.first;

import java.util.Scanner;

public class Main {
    private static void splitFiveNumber(int num) {
        System.out.printf("%d%n%d%n%d%n%d%n%d%n", num / 10_000, num / 1_000 % 10, num / 100 % 10, num / 10 % 10,
                num % 10);
    }

    private static void triangleSquareBySides(double[] sides) {
        double p = (sides[0] + sides[1] + sides[2]) / 2;
        double square = Math.sqrt(p * (p - sides[0]) * (p - sides[1]) * (p - sides[2]));

        System.out.printf("%.2f%n", square);
    }

    private static void circleLengthByRadius() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of circle: ");
        double radius = scanner.nextDouble();
        double circleLength = 2 * Math.PI * radius;

        System.out.printf("%.2f%n", circleLength);
    }

    public static void main(String[] args) {
        splitFiveNumber(54689);

        System.out.println();

        triangleSquareBySides(new double[]{3, 4, 5});

        System.out.println();

        circleLengthByRadius();
    }
}
