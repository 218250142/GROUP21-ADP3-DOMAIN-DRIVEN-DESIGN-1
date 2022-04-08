package za.ac.cput.repository;
/*
Mpho Sefoloko
218336322
group 21
 */
import za.ac.cput.entity.ReserveLimit;

import java.util.Set;

public interface IReserveLimitRepository extends IRepository<ReserveLimit, Integer> {

    public Set<ReserveLimit> getAll();
}
