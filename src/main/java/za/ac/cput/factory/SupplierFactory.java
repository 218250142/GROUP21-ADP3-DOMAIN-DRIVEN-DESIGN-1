

/* SupplierFactory.java
        Factory for Supplier
        Author: Aristoteles Pascoal (218290276)
        Date: 15 March 2022
         */
package za.ac.cput.factory;

import za.ac.cput.entity.Supplier;
import za.ac.cput.util.AristotelesHelper;

public class SupplierFactory {
    public static Supplier createSupplier(String nameCompany, String email, String address){


        String  supplierId = AristotelesHelper.intergenerational();
        Supplier supplier = new  Supplier.Builder().setId(supplierId)
                .setAddress(address)
                .setEmail(email)
                .setNameCompany(nameCompany)
                .build();
        return supplier;

    }

}
