package com.example.HotelManagement.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class Guest {

    private Map<String, Map<String, Object>> customers = new HashMap<>();




    public Guest(){
        Map<String,Object> customerDetails = new HashMap<>();
        customerDetails.put("name", "Abdullahi");
        customerDetails.put("age", 20);
        customerDetails.put("nationality",  "Nigerian");

        customers.put("customer1",customerDetails);
    }

    public Map<String, Map<String,Object>> getCustomers(){
        return customers;
    }



}
