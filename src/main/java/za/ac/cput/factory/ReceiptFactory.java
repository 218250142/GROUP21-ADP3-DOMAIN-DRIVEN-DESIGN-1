package za.ac.cput.factory;

import za.ac.cput.entity.Receipt;
import za.ac.cput.util.ZelinoHelper;

public class ReceiptFactory {

    public static Receipt createReceipt( double amount, String date) {



        String receipt1 = ZelinoHelper.receipt1 ();

        Receipt receipt = new
                Receipt.Builder().setReceiptID(receipt1)
                .setAmount(amount)
                .setDate(date)
                .build();
        return receipt;
    }
}
