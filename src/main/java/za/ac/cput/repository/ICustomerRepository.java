package za.ac.cput.repository;

import za.ac.cput.entity.Customer;

import java.util.Set;
/*Warren Jaftha(Leader) -219005303
ICustomerRepository.java
27/03/2022
 */
public interface ICustomerRepository extends IRepository<Customer,String>{
    //create,read,update,delete
    public Set<Customer> getAll();
}