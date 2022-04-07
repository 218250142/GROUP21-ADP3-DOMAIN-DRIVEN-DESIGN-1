
/* SupplierFactoryTest java
        FactoryTest for Supplier
        Author: Aristoteles Pascoal (218290276)
        Date: 15 March 2022
        */
package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.entity.Supplier;

import static org.junit.jupiter.api.Assertions.*;

class SupplierFactoryTest {

    @Test
    void createSupplier(){
        Supplier supplier = SupplierFactory.createSupplier("Danny","dany@gmail,com","maitland");
        System.out.println(supplier);
        assertNotNull(supplier);
    }

}