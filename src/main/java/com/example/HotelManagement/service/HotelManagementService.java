package com.example.HotelManagement.service;

import com.example.HotelManagement.model.Guest;
import com.example.HotelManagement.model.Hotel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

@Service
public class HotelManagementService {

    private Hotel hotel ;

    public Guest getGuest() {
        return guest;
    }

    @Autowired
    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    private Guest guest;

    public Hotel getHotel() {
        return hotel;
    }

    @Autowired
    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public Hotel addHotel(String roomName, int price){
        hotel.getRooms().put(roomName, price);
        return hotel;
    }


    public Guest addGuest(String user, Guest guest){
       Map<String, Object> users = new HashMap<>();
       users.put("id", guest.getId());
       users.put("name", guest.getUserName());
       users.put("age", guest.getAge());

       guest.getCustomers().put(user,users);

       return guest;
    }

    public Guest getGuest(int val){

        for(Map.Entry<String, Map<String, Object>> entry : guest.getCustomers().entrySet()){
          Map<String, Object> data = entry.getValue();
          int id = (int) data.get("id");
          if(id == val){
              return guest;
          }
        }
        return null;
    }





}
