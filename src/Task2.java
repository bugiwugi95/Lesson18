import java.util.Scanner;

public class Task1 {
    //Напишите метод, который возвращает наиболее из двух целых чисел
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        int first = sc.nextInt();
        System.out.println("Введите число");
        int second = sc.nextInt();
        int max = largestNumber(first, second);
        System.out.println("max number: " + max);
    }

    private static int largestNumber(int x, int y) {
        return Math.max(x, y);
    }
}