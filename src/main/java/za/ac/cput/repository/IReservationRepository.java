package za.ac.cput.repository;

import za.ac.cput.entity.Reservation;

import java.util.Set;

public interface IReservationRepository extends IRepository<Reservation, Integer>{
    Reservation read(int reservationNo);

    boolean delete(int reservationNo);

    public Set<Reservation> getAll();
}