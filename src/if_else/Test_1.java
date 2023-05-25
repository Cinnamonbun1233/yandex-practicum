package if_else;

public class Test_1 {
    public static void main(String[] args) {
        boolean condition = true;
        double rateUSD = 78.8;

        if (condition) {
            System.out.println("Внутри блока курс доллара виден. Он равен " + rateUSD);
        }

        System.out.println("Вне блока курс доллара не виден. Должен быть " + rateUSD);
    }
}