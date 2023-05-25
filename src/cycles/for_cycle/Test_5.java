package cycles.for_cycle;

public class Test_5 {
    public static void main(String[] args) {
        int days = 5;
        int moneyPerDay = 200;
        int sum = 0;

        for (int i = 1; i <= days; i++) {
            sum = sum + moneyPerDay;
            System.out.println("День " + i + ". Уже " + sum + " руб.");
        }
    }
}