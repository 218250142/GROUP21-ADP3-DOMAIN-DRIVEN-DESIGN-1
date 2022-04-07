package za.ac.cput.repository;

import za.ac.cput.entity.Manager;

import java.util.HashSet;
import java.util.Set;

/* ManagerRepository.java
   Repository for the ManagerRepository
   Author: Nawaaz Amien (219099839)
   Date: 7 April 2022
 */


public class ManagerRepository implements IManagerRepository{
    private static ManagerRepository managerRepository=null;
    private Set<Manager> managerDB=null;

    private ManagerRepository()
    {

        managerDB=new HashSet<Manager>();
    }
    public static ManagerRepository getRepository(){
        if(managerRepository==null)
        {
            managerRepository=new ManagerRepository();
        }
        return managerRepository;
    }
    @Override
    public Manager create(Manager manager) {
        boolean success=managerDB.add(manager);
        if(!success)
            return null;
        return manager;
    }

    @Override
    public Manager read(String managerID) {
        Manager manager=managerDB.stream()
                .filter(e-> e.getManagerId().equals(managerID))
                .findAny()
                .orElse(null);
        return manager;
    }

