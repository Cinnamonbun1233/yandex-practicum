package cycles.while_cycle;

import java.util.Random;

public class Test_5 {
    public static void main(String[] args) {
        Random random = new Random();
        int secretCode;
        int pilotInput;

        while (true) {
            secretCode = random.nextInt(100);
            System.out.println("Ракета SpaceY на орбите!");
            pilotInput = random.nextInt(100);
            if (pilotInput == secretCode) {
                System.out.println("Пилот угадал число! Летим домой!");
                break;
            }
        }
    }
}