package za.ac.cput.repository;
/*
Mpho Sefoloko
218336322
group 21
March
 */
import za.ac.cput.entity.Menu;
import java.util.Set;

public interface IMenuRepository extends IRepository<Menu, Integer>{

    public Set<Menu> getAll();
}



