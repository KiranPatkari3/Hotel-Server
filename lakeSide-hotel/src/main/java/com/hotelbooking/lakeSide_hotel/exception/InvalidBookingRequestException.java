package com.hotelbooking.lakeSide_hotel.exception;

public class InvalidBookingRequestException extends RuntimeException
{
    public InvalidBookingRequestException(String message) {
        super(message);
    }
}
