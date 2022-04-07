
/* ChefFactoryTest java
        FactoryTest for Chef
        Author: Aristoteles Pascoal (218290276)
        Date: 15 March 2022
        */


package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.entity.Chef;

import static org.junit.jupiter.api.Assertions.*;

class ChefFactoryTest {
    @Test
    void createChef(){
        Chef chef = ChefFactory.createChef("Danny","dany@gmail,com","maitland");
        System.out.println(chef);
        assertNotNull(chef);
    }

}