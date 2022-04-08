package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.entity.Payment;

import static org.junit.jupiter.api.Assertions.*;

class PaymentFactoryTest {

    @Test
    void createPayment() {

        Payment payment = PaymentFactory.createPayment("Cash", 150.00);
        System.out.println(payment);
        assertNotNull(payment);

    }
}