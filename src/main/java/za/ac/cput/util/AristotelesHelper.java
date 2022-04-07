
/* Helper UTil java
        Util for Helper
        Author: Aristoteles Pascoal (218290276)
        Date: 15 March 2022
        */



package za.ac.cput.util;

import java.util.UUID;

public class AristotelesHelper {
    public static  String intergenerational(){

        //supplier
        return UUID.randomUUID().toString();
    }
    public static  String generateChefId(){

        // chef
        return UUID.randomUUID().toString();

    }
    public static boolean isNullorEmpty(String s){
        return  (s == null || s.isEmpty() || s.equalsIgnoreCase("null"));

    }



}
