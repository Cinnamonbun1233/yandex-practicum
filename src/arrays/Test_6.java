package arrays;

import java.util.Scanner;

public class Test_6 {
    public static void main(String[] args) {
        double[] expenses = {100.50, 500.00, 10.00, 0.0, 40.60, 500.10, 200.00};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Расходы за неделю хранятся под индексами от 0 (пн) до 6 (вс).");
        System.out.println("Введите индекс дня, траты за который вы хотите отредактировать:");
        int index = scanner.nextInt();
        System.out.println("Введите новую сумму трат за этот день:");
        double newExpenses = scanner.nextDouble();
        expenses[index] = newExpenses;
        System.out.println("За день с индексом " + index + " размер трат теперь " + newExpenses);
    }
}