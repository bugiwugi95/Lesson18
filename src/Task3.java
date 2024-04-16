import java.util.Locale;
import java.util.Scanner;

public class Task2 {
    //Напишите метод, который возвращает наиболее из двух дробных чисел
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        double first = sc.nextDouble();
        System.out.println("Введите число");
        double second = sc.nextDouble();
        double max = largestNumber(first, second);
        System.out.println("max number: " + max);
    }

    private static double largestNumber(double x, double y) {
        return Math.max(x, y);
    }
}