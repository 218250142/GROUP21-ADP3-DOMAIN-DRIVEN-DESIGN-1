package za.ac.cput.factory;

import za.ac.cput.entity.Payment;
import za.ac.cput.util.ZelinoHelper;

public class PaymentFactory {
    public static Payment createPayment (String paymentOption, double orderAmount) {

        String payment1 = ZelinoHelper.payment1();

        Payment payment = new
                Payment.Builder().setPaymentID(payment1)
                .setPaymentOption(paymentOption)
                .setOrderAmount(orderAmount)
                .build();
        return payment;

    }
}

