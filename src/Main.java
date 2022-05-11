public class Main {
    public static void main(String[] args) {
        int balance = 150;
        int money = 500;
        int bonus = money / 100;
        if (money < 100) {
            bonus = 0;
        }
        int sum = balance + money + bonus;
        System.out.println("Ваш бонус" + " " + bonus);
        System.out.println("Сумма на счету" + " " + sum);
    }
}
