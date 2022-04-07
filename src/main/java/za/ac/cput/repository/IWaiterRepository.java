package za.ac.cput.repository;

import za.ac.cput.entity.Waiter;

import java.util.Set;
/*Warren Jaftha(Leader) -219005303
IWaiterRepository.java
27/03/2022
 */
public interface IWaiterRepository extends IRepository<Waiter,String>{
    //create,read,update,delete
    public Set<Waiter> getAll();
}

