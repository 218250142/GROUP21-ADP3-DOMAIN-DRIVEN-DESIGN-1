package za.ac.cput.repository;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.entity.Receipt;
import za.ac.cput.factory.ReceiptFactory;
import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)

class ReceiptRepositoryTest {

    private static ReceiptRepository repository = ReceiptRepository.getRepository();

    private static Receipt receipt = ReceiptFactory.createReceipt(150.00, "12/03/2022");

    @Test
    void a_create() {
        Receipt created = repository.create(receipt);
        assertEquals(receipt.getReceiptID(), created.getReceiptID());
        System.out.println("Create:" + created);
    }

    @Test
    void b_read() {
        Receipt read = repository.read(receipt.getReceiptID());
        assertNotNull(read);
        System.out.println("Read:" + read);
    }

    @Test
    void c_update() {
        Receipt updated = new Receipt.Builder().copy(receipt).setAmount(180.00)
                .setDate("12/08/2022")
                .build();
        assertNotNull(repository.update(updated));
        System.out.println("Updated:" + updated);

    }

    @Test
    void d_delete() {
        boolean success = repository.delete(receipt.getReceiptID());
        assertTrue(success);
        System.out.println("Deleted: " + success);
    }

    @Test
    void e_getAll() {
        System.out.println("Show all documentation:");
        System.out.println(repository.getAll());
    }
}