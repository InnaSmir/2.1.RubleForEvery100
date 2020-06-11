public class Ruble {
    public static void main(String[]args) {
        int customerAmount = 2600;
        int minLimit = 1000;
        int bonus = 1;
        if (customerAmount >= minLimit) {
            bonus = 1;
        } else {
            bonus = 0;
        }
        int totalBonus = customerAmount / 100 * bonus;
        System.out.println(totalBonus);
    }
}
