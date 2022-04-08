package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.entity.Receipt;

import static org.junit.jupiter.api.Assertions.*;

class ReceiptFactoryTest {

    @Test
    void createReceipt() {

        Receipt receipt = ReceiptFactory.createReceipt(150.00, "12/02/2022");
        System.out.println(receipt);
        assertNotNull(receipt);

    }
}