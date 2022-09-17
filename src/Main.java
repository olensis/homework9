import javax.swing.*;

public class Main {

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = generateRandomArray();

        // Задание 1
        int sum =0;
        for (int element : arr) {
            sum = element;
            System.out.println("сумма трат за месяц " + sum);
        }

            // Задание 2

        {

            int maxSum = -1;
            int minSum = 1000000;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > maxSum) {
                    maxSum = arr[i];
                    System.out.println(" максимальная сумма" + maxSum);
                }
            }
        }



    }

}