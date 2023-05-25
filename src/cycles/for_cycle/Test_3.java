package cycles.for_cycle;

public class Test_3 {
    public static void main(String[] args) {
        System.out.println("Это первый этаж дома, который построил Джек.");

        for (int i = 2; i <= 10; i++) {
            System.out.println("А это " + i + " этаж, он на один выше, чем этаж " + (i - 1));
        }
    }
}