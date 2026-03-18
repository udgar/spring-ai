package com.spring.mcp.service;

import com.spring.mcp.model.FlightInformation;
import com.spring.mcp.repository.FlightInformationJpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlightInformationService {

    private final FlightInformationJpaRepository repository;

    public FlightInformationService(FlightInformationJpaRepository repository) {
        this.repository = repository;
    }

    public FlightInformation saveFlightInfo(FlightInformation info) {
        return repository.save(info);
    }

    public List<FlightInformation> getAllFlightInfo() {
        return repository.findAll();
    }
}
