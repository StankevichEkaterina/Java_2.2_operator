public class Main {
    public static void main(String[] args) {

        // входные данные
        int startingAmount = 100;
        int replenishmentAmount = 2200;
        boolean bonus = replenishmentAmount >= 1000;

        // логика программы

        if (bonus) {
            int sumBonus = replenishmentAmount / 100;
            int sum = sumBonus + startingAmount + replenishmentAmount;

            System.out.println("Начисленные бонусы: " + sumBonus + (" Итоговый баланс: " + sum));
        } else {
            int sumBalance = startingAmount + replenishmentAmount;

            System.out.println("Итоговый баланс: " + sumBalance);
        }

    }
}
