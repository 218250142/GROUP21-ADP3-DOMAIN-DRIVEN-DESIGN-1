package za.ac.cput.repository;

import za.ac.cput.entity.Chef;
import za.ac.cput.repository.IRepository;

import java.util.Set;

public interface IChefRepository extends IRepository <Chef,String > {
    Chef create(Chef chef);

    Chef read(String id);

    Chef update(Chef chef);

    public Set<Chef> getAll();
}

