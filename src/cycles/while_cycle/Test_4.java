package cycles.while_cycle;

import java.util.Scanner;

public class Test_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int input = -1;

        while (input != 0) {
            input = scanner.nextInt();
            sum = sum + input;
        }
        System.out.println("Сумма введённых чисел: " + sum);
    }
}