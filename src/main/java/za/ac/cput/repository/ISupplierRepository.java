
/* Supplier java
        IRepository for Supplier
        Author: Aristoteles Pascoal (218290276)
        Date: 29 March 2022
        */

package za.ac.cput.repository;
import za.ac.cput.entity.Supplier;
import java.util.Set;

public interface ISupplierRepository extends IRepository<Supplier,String> {


    public Set<Supplier> getAll();
}
