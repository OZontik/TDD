public class Main {
    public static void main(String[] args) {
        int credit = 200000;
        double percent = 12;
        int period = 24;
        CreditСalculation creditСalculation = new CreditСalculation(credit, percent, period);

        int payment = creditСalculation.myPayment();
        System.out.println(payment);

        int sum = creditСalculation.refundAmount(payment);
        System.out.println("общая сумма к возврату в банк: " + sum);

        int overpayment = creditСalculation.myOverpayment(sum);
        System.out.println("переплата за весь период: " + overpayment);
    }
}
