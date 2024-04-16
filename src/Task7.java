import java.util.Scanner;

public class Task6 {
    //Напишите метод, который возвращает входящую строку, делая ее ЗаБоРчИкОм
    public static void main(String[] args) {
        String str1 = enteringLines();
        String result = fenceLine(str1);
        System.out.println(result);

    }
    private static String enteringLines() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку");
        return sc.nextLine();
    }
    private static String fenceLine(String str) {
        char[] ch = str.toCharArray();
        int size = ch.length;
        String result;
        for (int i = 0; i < size; i++) {
            if (i % 2 == 0) {
                ch[i] = Character.toUpperCase(ch[i]);
            } else {
                ch[i] = Character.toLowerCase(ch[i]);
            }
        }

        result = String.valueOf(ch);
        return result;
    }
}