
/* Chef.java
        Factory for Chef
        Author: Aristoteles Pascoal (218290276)
        Date: 15 March 2022
         */
package za.ac.cput.factory;

import za.ac.cput.entity.Chef;
import za.ac.cput.util.AristotelesHelper;

public class ChefFactory {

    public static Chef createChef(String name, String email, String address){

        String chefId = AristotelesHelper.generateChefId();


        Chef chef = new Chef.Builder().setId(chefId)
                .setName(name)
                .setEmail(email)
                .setAddress(address)
                .build();
        return chef;

    }
}
