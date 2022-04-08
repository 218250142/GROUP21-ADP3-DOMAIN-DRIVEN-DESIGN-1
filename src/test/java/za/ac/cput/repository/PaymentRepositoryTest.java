package za.ac.cput.repository;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.entity.Payment;
import za.ac.cput.factory.PaymentFactory;
import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)

class PaymentRepositoryTest {
    private static PaymentRepository repository = PaymentRepository.getRepository();

    private static Payment payment = PaymentFactory.createPayment("Cash", 200.00);

    @Test
    void a_create () {
        Payment created= repository.create(payment);
        assertEquals(payment.getPaymentID(),created.getPaymentID());
        System.out.println("Create:" + created);
    }

    @Test
    void b_read() {
        Payment read = repository.read(payment.getPaymentID());
        assertNotNull(read);
        System.out.println("Read:" +read);
    }

    @Test
    void c_update() {
        Payment updated=new Payment.Builder().copy(payment).setOrderAmount(180.00)
                .setPaymentOption("Card")
                .build();
        assertNotNull(repository.update(updated));
        System.out.println("Updated:" +updated);

    }

    @Test
    void d_delete() {
        boolean success=repository.delete(payment.getPaymentID());
        assertTrue(success);
        System.out.println("Deleted: " +success);

    }

    @Test
    void e_getAll() {
        System.out.println("Show all documentation:");
        System.out.println(repository.getAll());

    }
}