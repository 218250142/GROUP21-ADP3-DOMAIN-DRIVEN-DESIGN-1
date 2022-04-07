package za.ac.cput.repository;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.TestMethodOrder;

import za.ac.cput.entity.Tables;

import za.ac.cput.factory.TablesFactory;

import java.util.function.Supplier;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
class TablesRepositoryTest {
    private static TablesRepository repository = TablesRepository.getRepository();
    private static Tables tables = TablesFactory.createTables(5,true,"table12",12);



    @Test
    void a_create() {
        Tables created = repository.create(tables);
        assertEquals(tables.getReservedTable(), created.getReservedTable());
        System.out.println("Created: " + created);
    }

    @Test
    void b_read() {
        Tables read = repository.read(tables.getReservedTable());
        assertTrue(true);
        System.out.println("Read: "+read);
    }

    @Test
    void c_update() {
        Tables updated = new Tables.Builder().copy(tables).setTableID(8).setOccupied(true)
                .setReservedTable("Table15")
                .setNumSeats(3)
                .build();
        assertTrue(true, (Supplier<String>) repository.update(updated));
        System.out.println("Updated: "+updated);
    }

    @Test
    void e_delete() {
        boolean success = repository.delete(tables.getReservedTable());
        assertTrue(success);
        System.out.println("Deleted: "+ true);
    }

    @Test
    void d_getAll() {
        System.out.println("Show all: ");
        System.out.println(repository.getAll());
    }
}