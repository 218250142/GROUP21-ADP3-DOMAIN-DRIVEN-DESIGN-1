package za.ac.cput.factory;
/*
Mpho Sefoloko
218336322
group 21
March
 */
import za.ac.cput.entity.ReserveLimit;
import za.ac.cput.util.MphoHelper;

public class ReserveLimitFactory {
    public static ReserveLimit createReserveLimit(int totalLimit, boolean availability) {

        ReserveLimit limit = new ReserveLimit.Builder().setTotalLimit(totalLimit)
                .setAvailability(availability)
                .build();
        return limit;
    }

}
