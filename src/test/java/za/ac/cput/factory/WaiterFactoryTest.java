package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.entity.Waiter;

import static org.junit.jupiter.api.Assertions.*;
/*Warren Jaftha(Leader) -219005303
WaiterFactoryTest.java
27/03/2022
 */
class WaiterFactoryTest {
    @Test
    void createWaiter()
    {
        Waiter waiter=WaiterFactory.createWaiter("Damian","Jaftha","0731791829");
        System.out.println(waiter);
        assertNotNull(waiter);
    }
}