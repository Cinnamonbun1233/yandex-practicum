package arrays;

public class Test_2 {
    public static void main(String[] args) {
        double[] expenses = {100.50, 500.00, 10.00, 0.0, 640.60, 370.20, 200.00};
        expenses[2] = expenses[2] + 115;
        System.out.println("Новое значение расходов за среду: " + expenses[2] + " рублей.");
        double sum = expenses[1] + expenses[4] + expenses[5];
        System.out.println("Самые большие расходы были во вторник, пятницу и субботу.");
        System.out.println("Всего вы потратили в эти дни: " + sum + " рублей.");
    }
}