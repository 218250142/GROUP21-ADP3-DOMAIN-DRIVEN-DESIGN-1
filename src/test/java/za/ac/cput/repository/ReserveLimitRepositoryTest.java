package za.ac.cput.repository;
/*
Mpho Sefoloko
218336322
group 21
 */
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.entity.ReserveLimit;
import za.ac.cput.factory.ReserveLimitFactory;

import static org.junit.jupiter.api.Assertions.*;



    @TestMethodOrder(MethodOrderer.MethodName.class)
    class ReserveLimitRepositoryTest  {
        private static ReserveLimitRepository repository = ReserveLimitRepository.getRepository();

        private static ReserveLimit limit= ReserveLimitFactory.createReserveLimit(10,true);

        @Test
        void a_create() {
            ReserveLimit created= repository.create(limit);
            assertEquals(limit.getTotalLimit(),created.getTotalLimit());
            System.out.println("Create:" + created);
        }

        @Test
        void c_update() {
            ReserveLimit updated=new ReserveLimit.Builder().copy(limit).setTotalLimit(10)
                    .setAvailability(true)
                    .build();
            assertNotNull(repository.update(updated));
            System.out.println("Updated:" +updated);
        }

        @Test
        void e_delete() {
            boolean success=repository.delete(limit.getTotalLimit());
            assertTrue(success);
            System.out.println("Deleted: " +success);

        }

        @Test
        void d_getAll() {
            System.out.println("Show all:");
            System.out.println(repository.getAll());
        }

}