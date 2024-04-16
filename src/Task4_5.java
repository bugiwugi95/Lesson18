import java.util.Scanner;

public class Task4 {
    //Напишите метод, который возвращает самую длинную из трех строк
    //
    public static void main(String[] args) {

        String str1 = enteringLines();
        String str2 = enteringLines();
        String str3 = enteringLines();
        String lineMax = longLine(str1, str2, str3);
        System.out.println("max string: " + lineMax);
    }
   private static String enteringLines(){
       Scanner sc = new Scanner(System.in);
       System.out.println("Введите строку");
       return sc.nextLine();
   }
    private static String longLine(String x, String y, String c) {
        String length;
        if (x.length() > y.length() && x.length() > c.length()) {
            length = x;
        } else if (y.length() > x.length() && y.length() > c.length()) {
            length = y;
        } else {
            length = c;
        }
        return length;
    }
}