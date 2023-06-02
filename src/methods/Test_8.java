package methods;

import java.util.Scanner;

public class Test_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Какую зарплату вы получите в этом месяце?");
        int salary = scanner.nextInt();
        System.out.println("Сколько планируете потратить на транспорт?");
        int transportMoney = scanner.nextInt();
        System.out.println("Сколько запланировано на супермаркеты?");
        int foodMoney = scanner.nextInt();
        System.out.println("Какую сумму хотите отложить?");
        int savings = scanner.nextInt();
        correctExpenses(salary, transportMoney, foodMoney, savings);
        System.out.println("Вы планировали потратить: транспорт — " + transportMoney + ", "
                + "еда — " + foodMoney + ", сбережения — " + savings + ".");
    }

    public static void correctExpenses(int salary, int transportMoney, int foodMoney, int savings) {
        int expensesSum = transportMoney + foodMoney + savings;
        int lackMoney = expensesSum - salary;
        int leftMoney = salary - expensesSum;
        if (expensesSum > salary) {
            while ((salary - foodMoney) < transportMoney) {
                foodMoney = foodMoney - 100;
            }
            if (transportMoney + foodMoney + savings > salary) {
                savings = 0;
            }
            System.out.println("Придётся пересмотреть планы, вам не хватает " + lackMoney);
            System.out.println("Рекомендуемые траты: еда — " + foodMoney + ", сбережения — " + savings + ".");
        } else {
            System.out.println("В этом месяце дебет с кредитом сошлись!");
            System.out.println("Свободных средств " + leftMoney);
        }
    }
}