package arrays;

import java.util.Scanner;

public class Test_7 {
    public static void main(String[] args) {
        String[] dishes = {"Ризотто", "Тартар", "Шурпа", "Панна-котта", "Сашими"};
        System.out.println("Вы продегустировали пять блюд.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите индекс блюда, которое хотите переместить:");
        System.out.println("0-Ризотто");
        System.out.println("1-Тартар");
        System.out.println("2-Шурпа");
        System.out.println("3-Панна-котта");
        System.out.println("4-Сашими");
        int firstIndex = scanner.nextInt();
        System.out.println("Введите позицию, на которую хотите его переместить, от 0 до 4:");
        int secondIndex = scanner.nextInt();
        String swap = dishes[firstIndex];
        dishes[firstIndex] = dishes[secondIndex];
        dishes[secondIndex] = swap;
        System.out.println("Ваш рейтинг блюд:");
        System.out.println(dishes[0]);
        System.out.println(dishes[1]);
        System.out.println(dishes[2]);
        System.out.println(dishes[3]);
        System.out.println(dishes[4]);
    }
}