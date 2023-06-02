package methods;

public class Test_5 {
    public static void main(String[] args) {
        System.out.println("Наибольшее из чисел 3 и 5 = " + findMax(3, 5));
        System.out.println("Наибольшее из чисел 16 и 5 = " + findMax(16, 5));
        System.out.println("Наибольшее из чисел -1 и -7 = " + findMax(-1, -7));
    }

    public static int findMax(int a, int b) {
        if (a > b) {
            return a;
        }
        return b;
    }
}