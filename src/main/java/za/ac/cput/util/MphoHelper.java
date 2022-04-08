package za.ac.cput.util;
/*
Mpho Sefoloko
218336322
group 21
 */
import java.util.UUID;

public class MphoHelper {

    public static int itemId(){return UUID.randomUUID().hashCode();}


    public static String totalLimit(){return UUID.randomUUID().toString();}

}
