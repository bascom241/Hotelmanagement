package com.example.HotelManagement;

import com.example.HotelManagement.model.Guest;
import com.example.HotelManagement.model.Hotel;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Map;

@SpringBootApplication
public class HotelManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(HotelManagementApplication.class, args);
		System.out.println("Weclome to Java Project");
		 Hotel hotel = new Hotel();
		 for(Map.Entry<String, Integer> entry: hotel.getRooms().entrySet()){
			 System.out.println("Room: " + entry.getKey() + " Price: " + entry.getValue());
		 }
		Guest guests = new Guest();
		 for(Map.Entry<String, Map<String, Object>> entry: guests.getCustomers().entrySet()){
			 for(Map.Entry<String, Object> data: entry.getValue().entrySet()){
				 System.out.println("Customer: " + entry.getKey() +" "+  "Details: " + data.getKey() + " " + data.getValue());
			 }
		 }


	}

}
