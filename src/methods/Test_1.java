package methods;

import java.util.Scanner;

public class Test_1 {
    public static void main(String[] args) {
        System.out.println("Робот-помощник v1.0.");
        welcomeUserByName();
        sayHelloByTime();
        printSuccess();
    }

    private static void welcomeUserByName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Как вас зовут?");
        String name = scanner.nextLine();
        System.out.println("Рад познакомиться, " + name + "!");
    }

    private static void sayHelloByTime() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Который час?");
        int currentHour = scanner.nextInt();
        if (currentHour >= 6 && currentHour < 12) {
            System.out.println("Доброе утро!");
        } else if (currentHour >= 12 && currentHour < 18) {
            System.out.println("Добрый день!");
        } else if (currentHour >= 18 && currentHour < 22) {
            System.out.println("Добрый вечер!");
        } else if (currentHour >= 22 && currentHour <= 24 || currentHour >= 0 && currentHour < 6) {
            System.out.println("Доброй ночи!");
        }
    }

    public static void printSuccess() {
        System.out.println("У вас уже неплохо получается программировать!");
    }
}