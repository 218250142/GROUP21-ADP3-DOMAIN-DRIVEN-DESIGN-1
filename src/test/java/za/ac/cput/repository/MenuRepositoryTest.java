package za.ac.cput.repository;
/*
Mpho Sefoloko
218336322
group 21
March
 */
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.factory.MenuFactory;

import static org.junit.jupiter.api.Assertions.*;
import za.ac.cput.entity.Menu;



    @TestMethodOrder(MethodOrderer.MethodName.class)
    class MenuRepositoryTest {
        private static MenuRepository repository =MenuRepository.getRepository();
        private static Menu menu= MenuFactory.createMenu("burger",99.99,100.00);

        @Test
        void a_create() {
            Menu created= repository.create(menu);
            assertEquals(menu.getItemId(),created.getItemId());
            System.out.println("Create:" + created);
        }

        @Test
        void b_read() {
            Menu read = repository.read(menu.getItemId());
            assertNotNull(read);
            System.out.println("Read:" +read);
        }

        @Test
        void c_update() {
            Menu updated=new Menu.Builder().copy(menu).setItemName("fish")
                    .setItemPrice(100.00)
                    .build();
            assertNotNull(repository.update(updated));
            System.out.println("Updated:" +updated);
        }

        @Test
        void e_delete() {
            boolean success=repository.delete(menu.getItemId());
            assertTrue(success);
            System.out.println("Deleted: " +success);

        }

        @Test
        void d_getAll() {
            System.out.println("Show all:");
            System.out.println(repository.getAll());
        }
    }


