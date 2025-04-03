package com.example.HotelManagement;

import com.example.HotelManagement.model.Guest;
import com.example.HotelManagement.model.Hotel;
import com.example.HotelManagement.service.HotelManagementService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/users")
public class HotemangementController {

    private Hotel hotel;
    private Guest guest;
    private HotelManagementService hotelManagementService;

//    public HotelManagementService getHotelManagementService() {
//        return hotelManagementService;
//    }
//
//    public void setHotelManagementService(HotelManagementService hotelManagementService) {
//        this.hotelManagementService = hotelManagementService;
//    }

    public HotemangementController(Hotel hotel, Guest guest,HotelManagementService hotelManagementService){
        this.hotel = hotel;
        this.guest = guest;
        this.hotelManagementService = hotelManagementService;
    }

    // This is for the rooms for admins

    // get all the rooms
    @GetMapping()
    public Map<String, Integer> getRooms(){
     return hotel.getRooms();
    }

    // add a rooms to the list of rooms
    @PostMapping("/addRoom")
    public Map<String,Integer> addRoom(@RequestBody Map<String, Integer> request){
        for(Map.Entry<String,Integer> entry: request.entrySet()){
            String roomName = entry.getKey();
            int price = entry.getValue();



            hotelManagementService.addHotel(roomName, price);
        }
        return hotel.getRooms();
    }

    // This for hotels and its users //

    @GetMapping("/hotels")
    public Map<String , Map<String, Object>> getHotels(){
        return guest.getCustomers();
    }

    @PostMapping("/addHotel")
    public Map<String, Map<String, Object>> addHotel(@RequestBody Guest guest){
        String customerId = "Customer" + (guest.getCustomers().size() + 1 );

        hotelManagementService.addGuest(customerId,guest);
        return guest.getCustomers();
    }

    @GetMapping("hotel/1")
    public Guest getGuest(){
        return hotelManagementService.getGuest(1);
    }




}
