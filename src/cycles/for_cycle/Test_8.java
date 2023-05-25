package cycles.for_cycle;

public class Test_8 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Круг " + i);
            if (i % 2 == 0) {
                for (int j = 1; j <= 5; j++) {
                    System.out.println("  Приседаем " + j);
                }
            } else {
                for (int j = 1; j <= 3; j++) {
                    System.out.println("  Отжимаемся " + j);
                }
            }
            for (int j = 1; j <= 7; j++) {
                System.out.println("  Качаем пресс " + j);
            }
            System.out.println("Хороший темп, так держать!");
        }
        System.out.println("Отлично позанимались сегодня! Вы - молодец!");
    }
}