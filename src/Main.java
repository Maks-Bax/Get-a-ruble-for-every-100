public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int money = 1100;
        int bonus = money / 100;
        if (money < 1000) {
            bonus = 0;
        }
        int sum = balance + money + bonus;
        System.out.println("Ваш бонус " + bonus);
        System.out.println("Сумма на счету " + sum);
    }
}
