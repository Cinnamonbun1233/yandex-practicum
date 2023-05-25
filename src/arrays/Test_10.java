package arrays;

import java.util.Scanner;

public class Test_10 {
    public static void main(String[] args) {
        double[] expenses = new double[7];
        double expense = 50;

        for (int i = 0; i < expenses.length; i++) {
            expenses[i] = expense;
            expense = expense + 100;
        }

        System.out.println("Расходы за неделю успешно занесены в приложение!");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Расходы за какой день вы хотите проверить. Выберите значение от 0 (пн) до 6 (вс).");
            int index = scanner.nextInt();

            if (index < 0) {
                System.out.println("Выбрано неверное значение! Минимальное значение - 0");
            } else if (index > expenses.length - 1) {
                System.out.println("Выбрано неверное значение! Максимальное значение - " + (expenses.length - 1));
            } else {
                System.out.println("Потрачено " + expenses[index] + " рублей");
                break;
            }
        }
    }
}