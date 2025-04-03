package com.example.HotelManagement.service;

import com.example.HotelManagement.model.Hotel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Scanner;

@Service
public class HotelManagementService {
    private Scanner scan = new Scanner(System.in);
    private Hotel hotel ;

    public Hotel getHotel() {
        return hotel;
    }

    @Autowired
    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public void arrangeUserBookings(){


    }

}
