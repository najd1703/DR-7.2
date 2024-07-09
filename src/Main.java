import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("Массивы. Урок 2.");
        System.out.println("Задача 1.");
        int[] expenses = {5000, 10000, 15000, 20000, 25000};
        int sum = Arrays.stream(expenses).sum();
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");


        System.out.println("Задача 2.");

        int[] expensesOne = {5000, 10000, 15000, 20000, 25000};

        int min = Arrays.stream(expensesOne).min().getAsInt();
        int max = Arrays.stream(expensesOne).max().getAsInt();

        System.out.println("Минимальная сумма трат за месяц составила " + min + " рублей.Максимальная сумма трат за месяц составила " + max + " рублей");

        System.out.println("Задача 3.");

        int[] expensesTwo = {5300, 10400, 15170, 20159, 22110};
        double average = Arrays.stream(expensesTwo).average().getAsDouble();
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей");

        System.out.println("Задача 4.");

        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        char a = 0;
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            a += reverseFullName[i];

            System.out.print(reverseFullName[i]);
    }
}}