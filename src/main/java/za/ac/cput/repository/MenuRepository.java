package za.ac.cput.repository;
/*
Mpho Sefoloko
218336322
group 21
March
 */
import za.ac.cput.entity.Menu;
import java.util.HashSet;
import java.util.Set;

public class MenuRepository implements IMenuRepository {

    private static MenuRepository repository = null;
    private Set<Menu> menuDB = null;

    private MenuRepository() {

        menuDB = new HashSet<Menu>();
    }

    public static MenuRepository getRepository() {
        if (repository == null) {
            repository = new MenuRepository();
        }
        return repository;
    }

    public Menu create(Menu menu) {

        boolean success = menuDB.add(menu);
        if (!success)
            return null;
        return menu;
    }

    @Override
    public Menu read(Integer integer) {
        return null;
    }

    public Menu read(int itemId) {
    Menu menu = menuDB.stream()
            .filter(e -> e.getItemId()==(itemId))
            .findAny()
            .orElse(null);
   return menu;
}

    public Menu update(Menu menu) {
        Menu oldMenu=read(menu.getItemId());
        if(oldMenu !=null) {
            menuDB.remove(oldMenu);
            menuDB.add(menu);
            return menu;
        }
        return null;

    }

    @Override
    public boolean delete(Integer integer) {
        return false;
    }

    public boolean delete(int menuId) {
        Menu menuToDelete=read(menuId);
        if(menuToDelete == null)
            return false;
        menuDB.remove(menuToDelete);
        return true;

    }
    @Override
    public Set<Menu> getAll() {
        return menuDB;
    }
}



