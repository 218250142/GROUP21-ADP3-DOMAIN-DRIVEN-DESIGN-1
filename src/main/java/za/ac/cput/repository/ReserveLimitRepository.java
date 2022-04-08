package za.ac.cput.repository;
/*
Mpho Sefoloko
218336322
group 21
 */
import za.ac.cput.entity.ReserveLimit;

import java.util.HashSet;
import java.util.Set;


public class ReserveLimitRepository implements IReserveLimitRepository{

    private static ReserveLimitRepository repository = null;
    private Set<ReserveLimit> limitDB = null;

    private ReserveLimitRepository() {

        limitDB = new HashSet<ReserveLimit>();
    }
    public static ReserveLimitRepository getRepository() {
        if (repository == null) {
            repository = new ReserveLimitRepository();
        }
        return repository;
    }

    public ReserveLimit create(ReserveLimit limit) {

        boolean success = limitDB.add(limit);
        if (!success)
            return null;
        return limit;
    }

    @Override
    public ReserveLimit read(Integer integer) {
        return null;
    }

    public ReserveLimit read(int totalLimit) {
        ReserveLimit limit = limitDB.stream()
                .filter(e -> e.getTotalLimit()==(totalLimit))
                .findAny()
                .orElse(null);
        return limit;
    }

    public ReserveLimit update(ReserveLimit limit) {
        ReserveLimit oldMenu=read(limit.getTotalLimit());
        if(oldMenu !=null) {
            limitDB.remove(oldMenu);
            limitDB.add(limit);
            return limit;
        }
        return null;

    }

    @Override
    public boolean delete(Integer integer) {
        return false;
    }

    public boolean delete(int menuId) {
        ReserveLimit limitToDelete=read(menuId);
        if(limitToDelete == null)
            return false;
        limitDB.remove(limitToDelete);
        return true;

    }
    @Override
    public Set<ReserveLimit> getAll() {
        return limitDB;
    }
}
