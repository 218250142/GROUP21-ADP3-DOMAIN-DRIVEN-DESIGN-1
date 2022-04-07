//Levi Williams
//218250142
package za.ac.cput.factory;

import za.ac.cput.entity.Reservation;

public class ReservationFactory {

    public static Reservation createReservation(int reservationNo, int timeOfReservation, int numSeats, int tableID){
        return new Reservation.Builder().setReservationNo(reservationNo)
                .setTimeOfReservation(timeOfReservation)
                .setNumSeats(numSeats)
                .setTableID(tableID)
                .build();
    }
}

