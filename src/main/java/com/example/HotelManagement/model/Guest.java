package com.example.HotelManagement.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class Guest {

    private Map<String, Map<String, Object>> customers = new HashMap<>();
    private String userName;
    private int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private int id;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Guest(){
        Map<String,Object> customerDetails = new HashMap<>();
        customerDetails.put("id",  1);
        customerDetails.put("name", "Abdullahi");
        customerDetails.put("age", 20);


        customers.put("customer1",customerDetails);
    }

    public Map<String, Map<String,Object>> getCustomers(){
        return customers;
    }



}
