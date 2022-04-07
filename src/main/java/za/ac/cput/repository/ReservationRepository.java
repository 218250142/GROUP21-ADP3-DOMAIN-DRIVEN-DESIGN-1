package za.ac.cput.repository;

import za.ac.cput.entity.Reservation;

import java.util.HashSet;
import java.util.Set;

public class ReservationRepository implements IReservationRepository{
    private static ReservationRepository repository = null;
    private Set<Reservation> reservationDB = null;

    private ReservationRepository(){
        reservationDB = new HashSet<Reservation>();
    }

    public static ReservationRepository getRepository(){
        if (repository == null){
            repository = new ReservationRepository();
        }
        return repository;
    }


    @Override
    public Reservation create(Reservation reservation) {
        boolean success = reservationDB.add(reservation);
        if(!success){
            return null;}

        return reservation;
    }



    @Override
    public Reservation read(Integer reservationNo) {
        for (Reservation r : reservationDB){
            if(r.getReservationNo()==(reservationNo))
                return r;
        }
        return  null;
    }

    @Override
    public Reservation update(Reservation reservation) {
        Reservation oldReservation = read(reservation.getReservationNo());
        if(oldReservation != null){
            reservationDB.remove(oldReservation);
            reservationDB.add(reservation);
            return reservation;
        }
        return null;
    }



    @Override
    public boolean delete(Integer reservationNo) {
        Reservation reservationToDelete = read(reservationNo);
        if(reservationToDelete == null)
            return false;
        reservationDB.remove(reservationToDelete);
        return true;
    }

    @Override
    public Reservation read(int reservationNo) {
        for (Reservation r : reservationDB){
            if(r.getReservationNo()==(reservationNo))
                return r;}
        return null;
    }

    @Override
    public boolean delete(int reservationNo) {
        return true;
    }

    @Override
    public Set<Reservation> getAll() {
        return reservationDB;
    }
}

