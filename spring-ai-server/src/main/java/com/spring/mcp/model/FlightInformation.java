package com.spring.mcp.model;

import jakarta.persistence.*;
import org.springframework.cglib.core.GeneratorStrategy;

import java.time.LocalDateTime;

@Entity
public class FlightInformation {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String flightId;

    private String airline;

    private String flightNumber;

    private String startPoint;

    private String endPoint;

    private String status;

    private Integer duration;

    private LocalDateTime startDateTime;

    private LocalDateTime endDateTime;

    public FlightInformation() {
    }

    public FlightInformation(String flightId,
                             String airline,
                             String flightNumber,
                             String startPoint,
                             String endPoint,
                             String status,
                             Integer duration,
                             LocalDateTime startDateTime,
                             LocalDateTime endDateTime) {
        this.flightId = flightId;
        this.airline = airline;
        this.flightNumber = flightNumber;
        this.startPoint = startPoint;
        this.endPoint = endPoint;
        this.status = status;
        this.duration = duration;
        this.startDateTime=startDateTime;
        this.endDateTime=endDateTime;
    }
}
