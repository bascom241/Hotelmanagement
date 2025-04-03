package com.example.HotelManagement;

import com.example.HotelManagement.model.Guest;
import com.example.HotelManagement.model.Hotel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/users")
public class HotemangementController {

    private Hotel hotel;
    private Guest guest;

    public HotemangementController(Hotel hotel, Guest guest){
        this.hotel = hotel;
        this.guest = guest;
    }
    @GetMapping()
    public Map<String, Integer> getRooms(){
     return hotel.getRooms();
    }

    @GetMapping("/hotels")
    public Map<String , Map<String, Object>> getHotels(){
        return guest.getCustomers();
    }
}
