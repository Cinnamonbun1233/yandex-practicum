package arrays;

public class Test_11 {
    public static void main(String[] args) {
        double[] expenses = new double[7];
        expenses[0] = 50;

        for (int i = 1; i < expenses.length; i++) {
            expenses[i] = expenses[i - 1] + 100;
        }

        System.out.println("Ошибок нет. Все расходы успешно занесены в приложение!");
    }
}