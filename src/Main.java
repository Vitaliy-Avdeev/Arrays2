import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        var taskOne = ("Задача №1");
        System.out.println(taskOne);
        int[] arrayOne = new int[]{15000, 12000, 18000, 16000, 15000};
        int sum = Arrays.stream(arrayOne).sum();
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

        var taskTwo = ("Задача №2");
        System.out.println(taskTwo);
        int[] arrayTwo = new int[]{6000, 5000, 2000, 8000, 3000};
        int maxArrayTwo = arrayTwo[0];
        for (final int current : arrayTwo) {
            if (current > maxArrayTwo) {
                maxArrayTwo = current;
            }
        }
        System.out.println("Максимальная сумма трат за неделю составила " + maxArrayTwo + " рублей");
        int minArrayTwo = arrayTwo[0];
        for (final int current : arrayTwo) {
            if (current < minArrayTwo) {
                minArrayTwo = current;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minArrayTwo + " рублей");

        var taskFree = ("Задача №3");
        System.out.println(taskFree);
        int[] arrayFree = new int[]{6000, 5000, 2000, 8000, 3000};
        double sum2 = Arrays.stream(arrayFree).sum();
        int length = arrayFree.length;
        double averageAmount = sum2 / length;
        System.out.println("Средняя сумма трат за месяц составила " + averageAmount + " рублей");

        var taskFour = ("Задача №4");
        System.out.println(taskFour);
        char[] reverseFullName = new char[]{'n', 'a', 'v', 'i', ' ', 'v', 'o', 'n', 'a', 'v', 'i'};
        for (int i = 0; i < reverseFullName.length / 2; i++) {
            char temp = reverseFullName[i];
            reverseFullName[i] = reverseFullName[reverseFullName.length - 1 - i];
            reverseFullName[reverseFullName.length - 1 - i] = temp;
        }
        for (int i = 0; i < reverseFullName.length; i++)
            System.out.print(reverseFullName[i] + "");

    }
}