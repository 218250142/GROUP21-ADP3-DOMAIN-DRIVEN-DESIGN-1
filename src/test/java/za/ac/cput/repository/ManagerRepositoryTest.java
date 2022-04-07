package za.ac.cput.repository;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.Test;
import za.ac.cput.entity.Manager;
import za.ac.cput.factory.ManagerFactory;

import static org.junit.jupiter.api.Assertions.*;

/* ManagerRepositoryTest.java
   Test for the ManagerRepositoryTest
   Author: Nawaaz Amien (219099839)
   Date: 7 April 2022
 */


@TestMethodOrder(MethodOrderer.MethodName.class)
class ManagerRepositoryTest {

    private static ManagerRepository managerRepository =ManagerRepository.getRepository();
    private static Manager manager= ManagerFactory.createManager("Nawaaz","Amien","8 Rockhill Way, Retreat", 0001);

    //Test to Create
    @Test
    void manager_create() {
        Manager created= managerRepository.create(manager);
        assertEquals(manager.getManagerId(),created.getManagerId());
        System.out.println("Create:" + created);
    }

    //Test to Read
    @Test
    void manager_read() {
        Manager read = managerRepository.read(manager.getManagerId());
        assertNotNull(read);
        System.out.println("Read:" +read);
    }

    //Test to Update
    @Test
    void manager_update() {
        Manager updated= new Manager.Builder().copy(manager).setFirstName("Nawaaz")
                .setLastName("Amien")
                .setAddress("8 Rockhill Way, Retreat")
                .setEmployee_number(0001)
                .build();
        assertNotNull(managerRepository.update(updated));
        System.out.println("Updated:" + updated);
    }

    //Test to Delete
    @Test
    void manager_delete() {
        boolean success=managerRepository.delete(manager.getManagerId());
        assertTrue(success);
        System.out.println("Deleted: " + true);

    }

    //Test to Get all
    @Test
    void manager_getAll() {
        System.out.println("Show all:");
        System.out.println(managerRepository.getAll());
    }
}
