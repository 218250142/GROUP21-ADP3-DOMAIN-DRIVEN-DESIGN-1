package za.ac.cput.repository;
import za.ac.cput.entity.Payment;
import java.util.HashSet;
import java.util.Set;

public class PaymentRepository implements IPaymentRepository {
    private static PaymentRepository repository=null;
    private Set<Payment> paymentDB=null;

    private PaymentRepository(){

        paymentDB = new HashSet<Payment>();
    }
    public static PaymentRepository getRepository() {
        if (repository == null){
            repository = new PaymentRepository();
        }
        return repository;
    }
    @Override
    public Payment create(Payment payment) {

        boolean success=paymentDB.add(payment);
        if(!success)
            return null;
        return payment;
    }
    @Override
    public Payment read(String paymentID) {

        Payment payment=paymentDB.stream()
                .filter(e-> e.getPaymentID().equals(paymentID))
                .findAny()
                .orElse(null);
        return payment;
    }


    @Override
    public Payment update(Payment payment) {
        Payment oldPayment=read(payment.getPaymentID());
        if(oldPayment !=null) {
            paymentDB.remove(oldPayment);
            paymentDB.add(payment);
            return payment;
        }
        return null;

    }
    @Override
    public boolean delete(String paymentID) {
        Payment paymentToDelete=read(paymentID);
        if(paymentToDelete == null)
            return false;
        paymentDB.remove(paymentToDelete);
        return true;

    }
    @Override
    public Set<Payment> getAll() {
        return paymentDB;
    }

}
