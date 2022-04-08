package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.entity.ReserveLimit;

import static org.junit.jupiter.api.Assertions.*;

class ReserveLimitFactoryTest {

    @Test
    public void createReserveLimit(){

        ReserveLimit limit = ReserveLimitFactory.createReserveLimit(5,true);
        System.out.println(limit);
        assertNotNull(limit);
    }

}