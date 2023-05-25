package cycles.while_cycle;

import java.util.Random;
import java.util.Scanner;

public class Test_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int randomInt = new Random().nextInt(1000);
        int userInput = -1;
        System.out.println("Я загадал число от 0 до 1000.");
        System.out.println("Ваш ход:");

        while (userInput != randomInt) {
            userInput = scanner.nextInt();
            if (userInput > randomInt) {
                System.out.println("Меньше");
            } else if (userInput < randomInt) {
                System.out.println("Больше");
            }
        }
        System.out.println("Вы великолепны! Именно это я загадал.");
    }
}