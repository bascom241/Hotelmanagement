package com.example.HotelManagement.model;

import java.util.*;

public class Guest {

    private Map<String, Map<String, Object>> customers = new HashMap<>();

    public void setCustomers(Map<String, Map<String,Object>> customers){
        this.customers = customers;
    }

    public Map<String, Map<String,Object>> getCustomers(){
        return customers;
    }


    public Guest(){
        Map<String,Object> customerDetails = new HashMap<>();
        customerDetails.put("name", "Abdullahi");
        customerDetails.put("age", 20);
        customerDetails.put("nationality",  "Nigerian");

        customers.put("customer1",customerDetails);
    }



}
