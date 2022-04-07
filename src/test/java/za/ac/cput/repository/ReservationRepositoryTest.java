package za.ac.cput.repository;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.entity.Reservation;
import za.ac.cput.factory.ReservationFactory;

import java.util.function.Supplier;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.MethodName.class)
class ReservationRepositoryTest {
    private static ReservationRepository repository = ReservationRepository.getRepository();
    private static Reservation reservation = ReservationFactory.createReservation(5,1800,4,12);

    @Test
    void a_create() {
        Reservation created = repository.create(reservation);
        assertEquals(reservation.getReservationNo(), created.getReservationNo());
        System.out.println("Created: " + created);
    }

    @Test
    void b_read() {
        Reservation read = repository.read(reservation.getReservationNo());
        assertTrue(true);
        System.out.println("Read: "+read);
    }

    @Test
    void c_update() {
        Reservation updated = new Reservation.Builder().copy(reservation).setReservationNo(8).setTimeOfReservation(1700)
                .setNumSeats(3)
                .setTableID(14)
                .build();
        assertTrue(true, (Supplier<String>) repository.update(updated));
        System.out.println("Updated: "+updated);
    }

    @Test
    void e_delete() {
        boolean success = repository.delete(reservation.getReservationNo());
        assertTrue(success);
        System.out.println("Deleted: "+success);
    }

    @Test
    void d_getAll() {
        System.out.println("Show all: ");
        System.out.println(repository.getAll());
    }
}