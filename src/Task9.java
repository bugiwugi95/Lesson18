import java.util.Arrays;

public class Task8 {
    //Напишите метод, который принимает три массива, а возвращает массив, сумма элементов которого самая большая
    public static void main(String[] args) {
        int[] arr1 = {12, 23, 43, 756, 44, -111};
        int[] arr2 = {-12, 123, 143, 33, 555, -111};
        int[] arr3 = {67, 88, 90, -1, 777, -111};
        String result = maxSumToArray(arr1, arr2, arr3);
        System.out.println(result);
    }

    private static String maxSumToArray(int[] arr1, int[] arr2, int[] arr3) {
        String res;
        int max;
        int sum1 = 0;
        for (int i = 0; i < arr1.length; i++) {
            sum1 = sum1 + arr1[i];
        }
        int sum2 = 0;
        for (int i = 0; i < arr2.length; i++) {
            sum2 = sum2 + arr2[i];
        }
        int sum3 = 0;
        for (int i = 0; i < arr3.length; i++) {
            sum3 = sum3 + arr3[i];
        }
        if (sum1 > sum2 && sum1 > sum3) {
            max = sum1;
            res = Arrays.toString(arr1) + " = " + max;
        } else if (sum2 > sum3 && sum2 > sum1) {
            max = sum2;
            res = Arrays.toString(arr2) + " = " + max;
        } else {
            max = sum3;
            res = Arrays.toString(arr3) + " = " + max;
        }

        return res;

    }
}