
/* Supplier java
        RepositoryTest for Supplier
        Author: Aristoteles Pascoal (218290276)
        Date: 29 March 2022
        */





package za.ac.cput.repository;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.entity.Supplier;
import za.ac.cput.factory.SupplierFactory;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.MethodName.class)
class SupplierRepositoryTest {
    private static SupplierRepository repository =SupplierRepository.getRepository();
    private static Supplier supplier= SupplierFactory.createSupplier("SantaCorporate", "Klaus@gmail.com",
            "maitland");
    @Test
    void a_create() {
        Supplier created= repository.create(supplier);
        assertEquals(supplier.getId(),created.getId());
        System.out.println("Create:" + created);
    }

    @Test
    void b_read() {
        Supplier read = repository.read(supplier.getId());
        assertNotNull(read);
        System.out.println("Read:" +read);
    }
    @Test
    void c_update() {
        Supplier updated=new Supplier.Builder().copy(supplier).setNameCompany("Santa")
                .setEmail("klaus@gmail.com")
                .setAddress("maitland")
                .build();

        assertNotNull(repository.update(updated));
        System.out.println("Updated:" +updated);
    }

    @Test
    void e_delete() {
        boolean success=repository.delete(supplier.getId());
        assertTrue(success);
        System.out.println("Deleted: " + success);

    }

    @Test
    void d_getAll() {
        System.out.println("Show all:");
        System.out.println(repository.getAll());
    }
}

