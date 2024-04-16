import java.util.Arrays;

public class Task7 {
    //Напишите метод, который возвращает наибольший элемент массива
    public static void main(String[] args) {
        int[] arr = {12, 23, 43, 56, 44, -111};
        int result = maxNumberToArray(arr);
        System.out.println("Max number array: "+ Arrays.toString(arr) + " = "+result);
    }

    private static int maxNumberToArray(int[] arr) {
        int max = arr[0];
        for (int j : arr) {
            if (j >= max) {
                max = j;
            }
        }
        return max;

    }
}