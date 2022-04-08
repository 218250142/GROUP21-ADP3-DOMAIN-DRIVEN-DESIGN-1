package za.ac.cput.repository;

import za.ac.cput.entity.Receipt;

import java.util.Set;

public interface IReceiptRepository extends IRepository<Receipt, String> {

    public Set<Receipt> getAll();
}
