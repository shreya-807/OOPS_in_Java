import java.util.HashMap;

public class PaymentService {
    // storing payment methid
    // display the payment method
    HashMap<String, PaymentMethod> PaymentMethods;

    PaymentService() {
        PaymentMethods = new HashMap<>();
    }

    public void AddPaymentMethod(String name, PaymentMethod pm) {
        PaymentMethods.put(name, pm);
    }

    public void MakePaymentMethod(String name) {
        PaymentMethod pm = PaymentMethods.get(name);
        pm.pay();
    }
}
