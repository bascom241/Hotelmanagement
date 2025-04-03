package com.example.HotelManagement.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class Hotel {
    private HashMap<String,Integer> rooms = new HashMap<>();

    public Hotel(){
        rooms.put("Room1", 357);
        rooms.put("Room2", 200);
        rooms.put("Room3", 100);
        rooms.put("Room3", 50);
    }


    public HashMap<String,Integer> getRooms(){
        return rooms;
    }

}
