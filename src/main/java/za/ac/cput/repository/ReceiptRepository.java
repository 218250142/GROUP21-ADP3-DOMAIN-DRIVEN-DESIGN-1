package za.ac.cput.repository;
import za.ac.cput.entity.Receipt;
import java.util.HashSet;
import java.util.Set;

public class ReceiptRepository implements IReceiptRepository{

    private static ReceiptRepository repository=null;
    private Set<Receipt> receiptDB=null;

    private ReceiptRepository(){

        receiptDB = new HashSet<Receipt>();
    }
    public static ReceiptRepository getRepository() {
        if (repository == null){
            repository = new ReceiptRepository();
        }
        return repository;
    }
    @Override
    public Receipt create(Receipt receipt) {

        boolean success=receiptDB.add(receipt);
        if(!success)
            return null;
        return receipt;
    }
    @Override
    public Receipt read(String receiptID) {

        Receipt receipt=receiptDB.stream()
                .filter(e-> e.getReceiptID().equals(e.getReceiptID()))
                .findAny()
                .orElse(null);
        return receipt;
    }


    @Override
    public Receipt update(Receipt payment) {
        Receipt oldReceipt=read(payment.getReceiptID());
        if(oldReceipt !=null) {
            receiptDB.remove(oldReceipt);
            receiptDB.add(payment);
            return payment;
        }
        return null;

    }
    @Override
    public boolean delete(String receiptID) {
        Receipt receiptToDelete=read(receiptID);
        if(receiptToDelete == null)
            return false;
        receiptDB.remove(receiptToDelete);
        return true;

    }
    @Override
    public Set<Receipt> getAll() {
        return receiptDB;
    }
}

