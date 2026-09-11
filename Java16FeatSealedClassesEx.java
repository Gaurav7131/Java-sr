public class Java16FeatSealedClassesEx {

    // Jep 397:Sealed interface explicitly permitting only CreditCard and Upi
    public sealed interface PaymentMethod permits CreditCard, Upi {
    }

    // PaymentMethod:CreditCard
    public static final class CreditCard implements PaymentMethod {
        public String getCardNumber() {
            return "4111-XXXX-XXXX-1111";
        }
    }

    // PaymentMethod:UPI
    public static final class Upi implements PaymentMethod {
        public String getVpa() {
            return "gt@axis";
        }
    }

    public static void processPayment(PaymentMethod method) {
        if (method instanceof CreditCard cc) {
            System.out.println("Processing Card: " + cc.getCardNumber());
        } else if (method instanceof Upi upi) {
            System.out.println("Processing UPI : " + upi.getVpa());
        }
    }

    public static void main(String[] args) {
        PaymentMethod paymentMode = new Upi();// UPI
        processPayment(paymentMode);

        /*
         * If users chose CC
         * paymentMode = new CreditCard();
         * processPayment(paymentMode);
         */

    }
}