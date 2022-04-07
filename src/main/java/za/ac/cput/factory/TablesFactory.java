//Levi Williams
//218250142
package za.ac.cput.factory;

import za.ac.cput.entity.Tables;

public class TablesFactory {
    public static Tables createTables(int tableID, boolean occupied, String reservedTable, int numSeats){
        return new Tables.Builder().setTableID(tableID)
                .setOccupied(occupied)
                .setReservedTable(reservedTable)
                .setNumSeats(numSeats)
                .build();
    }
}

