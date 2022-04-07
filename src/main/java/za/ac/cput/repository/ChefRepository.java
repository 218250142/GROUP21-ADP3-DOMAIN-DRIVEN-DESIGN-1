
/* Chef java
        Repository for Chef
        Author: Aristoteles Pascoal (218290276)
        Date: 29 March 2022
        */



package za.ac.cput.repository;

import za.ac.cput.entity.Chef;
import za.ac.cput.repository.IChefRepository;

import java.util.HashSet;
import java.util.Set;

public class ChefRepository implements IChefRepository {
    private static ChefRepository repository =null;
    private Set<Chef> chefDB = null;

    private  ChefRepository(){
        chefDB = new HashSet<Chef>();

    }
    public static ChefRepository getRepository(){
        if (repository == null){
            repository =new ChefRepository();
        }
        return repository;
    }
    @Override
    public Chef create(Chef chef){
        boolean
                success = chefDB.add(chef);
        if (!success)
            return null;
        return chef;
    }
    @Override
    public Chef read(String chefId){
        Chef
                chef = chefDB.stream()
                .filter(e->
                        e.getId().equals(chefId))
                .findAny()
                .orElse(null);
        return chef;

    }
    @Override
    public Chef update(Chef chef){
        Chef
                oldChef = read(chef.getId());
        if (oldChef !=null){
            chefDB.remove(oldChef);
            chefDB.add(chef);
            return chef;

        }
        return null;
    }

    public boolean delete(String Id){
        Chef
                chefToDelete = read(Id);
        if (chefToDelete == null)
            return false;
        chefDB.remove(chefToDelete);
        return true;

    }
    @Override
    public Set<Chef> getAll(){
        return chefDB;
    }


    @Override
    public void create() {

    }

    @Override
    public void update() {

    }

    @Override
    public void read() {

    }

    @Override
    public boolean delete() {
        return false;
    }
}
