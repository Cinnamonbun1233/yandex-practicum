package cycles.while_cycle;

import java.util.Scanner;

public class Test_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Оцените работу приложения Зеленоглазое-Такси по шкале от 1 до 3");

        while (true) {
            int x = scanner.nextInt();
            if (x == 1) {
                System.out.println("Спасибо за вашу оценку. Мы станем лучше!");
                break;
            }
            if (x == 2) {
                System.out.println("Спасибо за вашу оценку. Есть куда расти!");
                break;
            }
            if (x == 3) {
                System.out.println("Спасибо за высокую оценку! Рады, что вы выбрали нас!");
                break;
            }
            System.out.println("Ваша оценка должна быть в диапазоне от 1 до 3");
        }
    }
}