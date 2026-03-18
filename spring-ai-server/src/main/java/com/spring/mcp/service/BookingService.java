package com.spring.mcp.service;

import com.spring.mcp.model.Bookings;
import com.spring.mcp.repository.FlightBookingJpaRepository;
import com.spring.mcp.repository.FlightInformationJpaRepository;
import com.spring.mcp.tools.BookingTools;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingService {

    private final FlightBookingJpaRepository repository;
    private final FlightInformationJpaRepository flightInfoRepository;

    BookingService(FlightBookingJpaRepository repository,FlightInformationJpaRepository flightInfoRepository){
        this.repository=repository;
        this.flightInfoRepository = flightInfoRepository;
    }

    public Bookings saveBooking(String name,String remarks,String flightNumber){
        return flightInfoRepository.findByFlightId(flightNumber)
                .map(flightInfo->repository.save(new Bookings(name,remarks,flightNumber))).orElseThrow();

    }

    public List<Bookings> getAll(){
        return repository.findAll();
    }
}
