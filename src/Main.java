import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("Массивы. Урок 2.");
        System.out.println("Задача 1.");
        int[] expenses = {5000, 10000, 15000, 20000, 25000};
        int sum=0;
        for (int i = 0; i < expenses.length; i++) {
            sum = sum + expenses[i];}
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");


        System.out.println("Задача 2.");

        int[] expensesOne = {5000, 10000, 15000, 20000, 25000};
        int max = expensesOne[0];
        int min = expensesOne[0];
        for(int i = 1; i < expensesOne.length; i++) {
            if(expensesOne[i] > min)min = expensesOne[i];
            else if (expensesOne[i] < max)max = expensesOne[i];
        }

        System.out.println("Минимальная сумма трат за месяц составила " + max + " рублей.Максимальная сумма трат за месяц составила " + min + " рублей");

        System.out.println("Задача 3.");

        int[] expensesTwo = {5300, 10400, 15170, 20159, 22110};
        double average = 0;
        if (expensesTwo.length > 0)
        {
            int summ = 0;
            for (int i = 0; i < expensesTwo.length; i++) {
                summ += expensesTwo[i]; }

             average = summ / expensesTwo.length;
        }
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей");

        System.out.println("Задача 4.");

        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        char a = 0;
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            a += reverseFullName[i];

            System.out.print(reverseFullName[i]);
    }
}}