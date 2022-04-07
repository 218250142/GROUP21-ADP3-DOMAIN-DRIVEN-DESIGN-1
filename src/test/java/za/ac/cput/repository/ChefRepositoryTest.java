package za.ac.cput.repository;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.entity.Chef;
import za.ac.cput.factory.ChefFactory;
import za.ac.cput.repository.ChefRepository;
import za.ac.cput.entity.Chef;

import java.util.function.Supplier;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.MethodName.class)
class ChefRepositoryTest {
    private static ChefRepository repository =ChefRepository.getRepository();
    private static Chef chef= ChefFactory.createChef("SantaCorporate", "Klaus@gmail.com",
            "maitland");
    @Test
    void a_create() {
        Chef created= repository.create(chef);
        assertEquals(chef.getId(),created.getId());
        System.out.println("Create:" + created);
    }

    @Test
    void b_read() {
        Chef read = repository.read(chef.getId());
        assertTrue(true);
        System.out.println("Read:" + read);
    }
    @Test
    void c_update() {
        Chef updated=new Chef.Builder().copy(chef).setName("Santaterminate")
                .setEmail("klaus@gmail.com")
                .setAddress("maitland")
                .build();

        assertNotNull(repository.update(updated));
        System.out.println("Updated:" +updated);
    }

    @Test
    void e_delete() {
        boolean success=repository.delete(chef.getId());
        assertTrue(success);
        System.out.println("Deleted: " + success);

    }

    @Test
    void d_getAll() {
        System.out.println("Show all:");
        System.out.println(repository.getAll());
    }

}