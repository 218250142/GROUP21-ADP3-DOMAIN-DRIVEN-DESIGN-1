package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.entity.Tables;

import static org.junit.jupiter.api.Assertions.*;

class TablesFactoryTest {
    @Test
    public void test(){
        Tables tables = TablesFactory.createTables(12, true, "Table12", 5 );
        System.out.println(tables.toString());
        assertNotNull(tables);
    }
}