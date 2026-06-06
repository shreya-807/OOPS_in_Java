public class Client {
    public static void main(String[] args) {
        PaymentService ps = new PaymentService();
        ps.AddPaymentMethod("ShreyaHDFC", new DebitCard("123", "ShreyaSinghal"));
        ps.AddPaymentMethod("ShreyaICICI", new CreditCard("5678", "ShreyaSinghal"));
        ps.MakePaymentMethod("ShreyaHDFC");
        ps.MakePaymentMethod("ShreyaICICI");
    }

}
