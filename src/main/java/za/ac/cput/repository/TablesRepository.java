package za.ac.cput.repository;

import za.ac.cput.entity.Reservation;
import za.ac.cput.entity.Tables;

import java.util.HashSet;
import java.util.Set;

public class TablesRepository implements ITablesRepository{
    private static TablesRepository repository = null;
    private Set<Tables> tablesDB = null;

    private TablesRepository(){
        tablesDB = new HashSet<Tables>();
    }

    public static TablesRepository getRepository(){
        if (repository == null){
            repository = new TablesRepository();
        }
        return repository;
    }

    @Override
    public Tables create(Tables tables) {
        boolean success = tablesDB.add(tables);
        if(!success){
            return null;}

        return tables;
    }

    @Override
    public Tables read(String l) {
        for (Tables t : tablesDB){
            if(t.getReservedTable().equals(t.getReservedTable()))
                return t;
        }
        return  null;
    }

    @Override
    public Tables update(Tables tables) {
        Tables oldTable = read(tables.getReservedTable());
        if(oldTable != null){
            tablesDB.remove(oldTable);
            tablesDB.add(tables);
            return tables;
        }
        return null;
    }

    @Override
    public boolean delete(String s) {
        Tables tableToDelete = read(String.valueOf(true));
        if(tableToDelete == null)
            return false;
        tablesDB.remove(tableToDelete);
        return true;
    }

    @Override
    public Set<Tables> getAll() {
        return tablesDB;
    }
}

