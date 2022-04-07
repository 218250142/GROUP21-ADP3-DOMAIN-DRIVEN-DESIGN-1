package za.ac.cput.repository;

import za.ac.cput.entity.BookingPrice;

import java.util.HashSet;
import java.util.Set;

/* BookingPriceRepository.java
   Repository for the BookingPriceRepository
   Author: Nawaaz Amien (219099839)
   Date: 7 April 2022
 */


public class BookingPriceRepository implements IBookingPriceRepository{
    private static BookingPriceRepository bookingPriceRepository=null;
    private Set<BookingPrice> bookingDB=null;

    private BookingPriceRepository()
    {

        bookingDB=new HashSet<BookingPrice>();
    }
    public static BookingPriceRepository getRepository(){
        if(bookingPriceRepository==null)
        {
            bookingPriceRepository=new BookingPriceRepository();
        }
        return bookingPriceRepository;
    }
    @Override
    public BookingPrice create(BookingPrice bookingPrice) {
        boolean success=bookingDB.add(bookingPrice);
        if(!success)
            return null;
        return bookingPrice;
    }

    @Override
    public BookingPrice read(String bookingID) {
        BookingPrice bookingPrice=bookingDB.stream()
                .filter(e-> e.getBookingId().equals(bookingID))
                .findAny()
                .orElse(null);
        return bookingPrice;
    }

    @Override
    public BookingPrice update(BookingPrice bookingPrice) {
        BookingPrice oldBookingPrice=read(bookingPrice.getBookingId());
        if(oldBookingPrice !=null)
        {
            bookingDB.remove(oldBookingPrice);
            bookingDB.add(bookingPrice);
            return bookingPrice;
        }
        return null;
    }

    @Override
    public boolean delete(String bookingID) {
        BookingPrice bookingToDelete=read(bookingID);
        if(bookingToDelete==null)
            return false;
        bookingDB.remove(bookingToDelete);
        return true;
    }
    @Override
    public Set<BookingPrice> getAll() {
        return bookingDB;
    }
}

