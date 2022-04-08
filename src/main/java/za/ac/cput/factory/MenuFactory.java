package za.ac.cput.factory;
/*
Mpho Sefoloko
218336322
group 21
March
 */
import za.ac.cput.entity.Menu;
import za.ac.cput.util.MphoHelper;

public class MenuFactory {

    public static Menu createMenu(String itemName, double itemPrice, double total ) {


        int itemId= MphoHelper.itemId();
        Menu menu = new Menu.Builder().setItemId(itemId)
                .setItemName(itemName)
                .setItemPrice(itemPrice)
                .setTotal(total)
                .build();
        return menu;

    }

}
