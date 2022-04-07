package za.ac.cput.repository;

import za.ac.cput.entity.Manager;

import java.util.Set;

/* IManagerRepository.java
   Repository for the IManagerRepository
   Author: Nawaaz Amien (219099839)
   Date: 7 April 2022
 */


/*
IRepository.java--must only have one of these for the whole project--
the leader must add this
 */


public interface IManagerRepository extends IRepository<Manager,String>{
    //create,read,update,delete
    public Set<Manager> getAll();
}

