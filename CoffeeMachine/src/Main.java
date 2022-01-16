public class Main {
    public static void main(String[] args) {
        int coffeeAmount = 1;
        int milkAmount = 3210;
        int skimedMilkAmount = 1;

        boolean isBlocked = true;

        int cappucinoMilkRequired = 60;
        int cappucionoCoffeeRequired = 15;
 // капучино кофе реком считать за пися
        boolean milkIsEnough = skimedMilkAmount >= cappucinoMilkRequired ||
                milkAmount >= cappucinoMilkRequired;

        boolean coffeeIsEnough = coffeeAmount >= cappucionoCoffeeRequired;

        if (isBlocked) {
            System.out.println("Кофе машина заблокирована");
        } else {
            if (coffeeIsEnough && milkIsEnough) {
                System.out.println("Готовим кофе мразь");
            } else {
                if (!coffeeIsEnough) {
                    System.out.println("Кофе не достаточно");
                }
                if (!milkIsEnough) {
                    System.out.println("Молока не достаточно");
                }
            }

        }
    }
}
