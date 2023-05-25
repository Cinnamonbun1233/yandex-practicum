package cycles.while_cycle;

import java.util.Scanner;

public class Test_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Сколько денег у вас сейчас: ");
        double balance = scanner.nextDouble();
        int years = 0;
        double percent = 1.05;

        while (balance < 1000000) {
            balance = balance * percent;
            years = years + 1;
        }

        System.out.println("Через " + years + " лет у вас будет миллион!");
    }
}