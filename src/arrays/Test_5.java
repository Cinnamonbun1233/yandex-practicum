package arrays;

import java.util.Scanner;

public class Test_5 {
    public static void main(String[] args) {
        String[] currencies = {"USD", "EUR", "JPY", "RUB"};
        System.out.println("Валюты в вашем портфеле:");
        System.out.println(currencies[0] + " - индекс 0");
        System.out.println(currencies[1] + " - индекс 1");
        System.out.println(currencies[2] + " - индекс 2");
        System.out.println(currencies[3] + " - индекс 3");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите индекс валюты, которую хотите поменять:");
        int index = scanner.nextInt();
        System.out.println("Выберите новую валюту:");
        String currency = scanner.next();
        String previousCurrency = currencies[index];
        currencies[index] = currency;
        System.out.println("Мы заменили " + previousCurrency + " на: " + currencies[index]);
        System.out.println("Теперь в вашем портфеле такие валюты:");
        System.out.println(currencies[0]);
        System.out.println(currencies[1]);
        System.out.println(currencies[2]);
        System.out.println(currencies[3]);
    }
}