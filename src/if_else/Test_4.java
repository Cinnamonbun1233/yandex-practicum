package if_else;

public class Test_4 {
    public static void main(String[] args) {
        double moneyBeforeSalary = 9000.0;

        if (moneyBeforeSalary < 3000) {
            System.out.println("Сегодня лучше поесть дома. Экономьте, и вы дотянете до зарплаты!");
        } else if (moneyBeforeSalary < 10000) {
            System.out.println("Окей, пора в Макдак!");
        } else {
            System.out.println("Класс! Заказывайте крабов!");
        }
    }
}