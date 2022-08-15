import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Задание 1 и Задание 3
        int[] arr = generateRandomArray();
        int sumAll = 0;

        for (int n = 0; n < arr.length; n++) {
            sumAll = sumAll + arr[n];
        }
        System.out.println("Сумма трат за месяц составила " + sumAll + " рублей");
        System.out.println("Средняя сумма трат за месяц составила " + (double)sumAll/30.0 + " рублей");
        System.out.println();

        //Задание 2
        int minSpending = arr[0];
        int maxSpending = arr[0];

        for (int n = 0; n < arr.length; n++) {
            if (minSpending > arr[n]) {
                minSpending = arr[n];
            }
            if (maxSpending < arr[n]) {
                maxSpending = arr[n];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minSpending + " рублей. Максимальная сумма трат за день составила " + maxSpending + " рублей");
        System.out.println();

        //Задание 4
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for (int n = reverseFullName.length-1; n >= 0; n--) {
            System.out.print(reverseFullName[n]);
        }
        System.out.println();


        System.out.println();
        System.out.print("Массив для проверки заданий: " + Arrays.toString(arr));
    }



    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

}
