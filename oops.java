// Interface (Abstraction)
interface PaymentMode {
    void pay(double amount);
}
// Encapsulation
class Order {
    private final double amount;

    public Order(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}

class Upi implements PaymentMode {
    @Override
    public void pay(double amt) {
        System.out.println("Paid " + amt + " via UPI");
    }
}

class Card implements PaymentMode {
    @Override
    public void pay(double amt) {
        System.out.println("Paid " + amt + " via Card");
    }
}

public class oops {
    public static void main(String[] args) {

        Order order = new Order(1500.00);

        PaymentMode payment = new Upi();
        payment.pay(order.getAmount());

        PaymentMode cardPayment = new Card();
        cardPayment.pay(order.getAmount());
    }
}
