package za.ac.cput.repository;


import za.ac.cput.entity.Tables;

import java.util.Set;

public interface ITablesRepository extends IRepository<Tables, String>{
    public Set<Tables> getAll();
}
