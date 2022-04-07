
/* Supplier java
        Repository for Supplier
        Author: Aristoteles Pascoal (218290276)
        Date: 29 March 2022
        */
package za.ac.cput.repository;

import za.ac.cput.entity.Supplier;
import za.ac.cput.repository.ISupplierRepository;

import java.util.HashSet;
import java.util.Set;

public class SupplierRepository implements ISupplierRepository {
    private static SupplierRepository repository = null;
    private Set<Supplier> supplierDB = null;

    private SupplierRepository() {
        supplierDB = new HashSet<Supplier>();

    }

    public static SupplierRepository getRepository() {
        if (repository == null) {
            repository = new SupplierRepository();
        }
        return repository;
    }

    @Override
    public Supplier create(Supplier supplier) {
        boolean
                success = supplierDB.add(supplier);
        if (!success)
            return null;
        return supplier;
    }

    @Override
    public Supplier read(String supplierID) {
        Supplier
                supplier = supplierDB.stream()
                .filter(e ->
                        e.getId().equals(supplierID))
                .findAny()
                .orElse(null);
        return supplier;

    }

    @Override
    public Supplier update(Supplier supplier) {
        Supplier
                oldSupplier = read(supplier.getId());
        if (oldSupplier != null) {
            supplierDB.remove(oldSupplier);
            supplierDB.add(supplier);
            return supplier;

        }
        return null;

    }

    public boolean delete(String SupplierID) {
        Supplier
                supplierToDelete = read(SupplierID);
        if (supplierToDelete == null)
            return false;
        supplierDB.remove(supplierToDelete);
        return true;

    }

    @Override
    public Set<Supplier> getAll() {
        return supplierDB;
    }

}
