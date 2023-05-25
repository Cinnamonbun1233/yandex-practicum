package if_else;

public class Test_2 {
    public static void main(String[] args) {
        double rateUSD = 50;
        double rubles = 14356.5;

        if (rateUSD < 70) {
            System.out.println("Отличный курс доллара — рекомендую купить!");
        }

        System.out.println("Ваши сбережения в долларах: " + rubles / rateUSD);
    }
}