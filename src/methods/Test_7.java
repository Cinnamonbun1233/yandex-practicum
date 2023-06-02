package methods;

import java.util.Scanner;

public class Test_7 {
    public static void main(String[] args) {
        int balls = 15;
        System.out.println("У Пикселя " + balls + " мячиков");
        playPixel(balls);
        System.out.println("Пиксель вернул все мячики");
        System.out.println("Их снова " + balls);
    }

    public static void playPixel(int balls) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Сколько мячиков он спрятал?");
        int hiddenBalls = scanner.nextInt();
        balls = balls - hiddenBalls;
        System.out.println("Осталось " + balls);
    }
}