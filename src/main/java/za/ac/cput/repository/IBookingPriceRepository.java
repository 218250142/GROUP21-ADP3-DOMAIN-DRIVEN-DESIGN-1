package za.ac.cput.repository;

import za.ac.cput.entity.BookingPrice;

import java.util.Set;

/* IBookingPriceRepository.java
   Repository for the IBookingPriceRepository
   Author: Nawaaz Amien (219099839)
   Date: 7 April 2022
 */


/*
IRepository.java--must only have one of these for the whole project--
the leader must add this
 */

public interface IBookingPriceRepository extends IRepository<BookingPrice,String>{
    //create,read,update,delete
    public Set<BookingPrice> getAll();
}

