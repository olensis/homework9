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

                } else if (arr[i] < minSum) {
                    minSum = arr[i];
                }
            }
            {
                System.out.println(" минимальная сумма " + minSum + " максимальная сумма " + maxSum);
            }

            // Задание 3
            var average = 0;
            if (arr.length > 0) {
                var sum1 = 0;
                for (int i = 0; i < arr.length; i++) {
                    sum1 += arr[i];
                }
                average = sum1 / arr.length;
            }
            System.out.println(" Средняя сумма затрат составила " + average);

            // Задание 4

            {
                char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
                for (int i = reverseFullName.length - 1; i >= 0; i--) {
                    String oldString = "navI vonavI";
                    String newString = oldString.replace("navI vonavI", "Ivanov Ivan");
                    {
                        System.out.println(newString);
                    }
                }

            }







        }

    }

}