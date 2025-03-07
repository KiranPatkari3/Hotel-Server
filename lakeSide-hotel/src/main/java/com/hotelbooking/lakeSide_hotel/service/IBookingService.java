package com.hotelbooking.lakeSide_hotel.service;

import com.hotelbooking.lakeSide_hotel.model.BookedRoom;

import java.util.List;

public interface IBookingService {
    BookedRoom findByBookingConfirmationCode(String confirmationCode);

    List<BookedRoom> getBookingsByUserEmail(String email);

    void cancelBooking(Long bookingId);

    List<BookedRoom> getAllBookingsByRoomId(Long roomId);

    String saveBooking(Long roomId, BookedRoom bookingRequest);

    List<BookedRoom> getAllBookings();
}
