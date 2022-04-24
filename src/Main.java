public class Main {
    public static void main(String[] args) {

        int replenishment = 8020; // пополнение баланса
        int coefficente = 100; // коэффицент

        int balance;
        if (replenishment > 1000) {
            balance = replenishment / 100 + replenishment;
        } else {
            balance = replenishment;
        }
        System.out.println("Баланс : " + balance);
    }

}
