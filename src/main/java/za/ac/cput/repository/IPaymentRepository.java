package za.ac.cput.repository;

import za.ac.cput.entity.Payment;

import java.util.Set;
public interface IPaymentRepository extends IRepository<Payment, String>{

    public Set<Payment> getAll();
}
