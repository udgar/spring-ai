package com.spring.mcp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Bookings {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String remarks;

    private String flightId;

    public Bookings(){}

    public Bookings(String name, String remarks, String flightId) {
        this.name = name;
        this.remarks = remarks;
        this.flightId = flightId;
    }
}
