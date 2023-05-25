package cycles.for_cycle;

public class Test_6 {
    public static void main(String[] args) {
        int money = 500;
        int foodPerDay = 100;
        int days = 0;

        for (int i = 3; money >= foodPerDay; i = i + 3) {
            days = i;
            money = money - foodPerDay;
            System.out.println("На " + i + "-й день останется " + money + " рублей.");
        }

        System.out.println("Денег хватит на " + days + " дней.");
    }
}