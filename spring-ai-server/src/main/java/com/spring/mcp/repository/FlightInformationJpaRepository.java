package com.spring.mcp.repository;

import com.spring.mcp.model.FlightInformation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface FlightInformationJpaRepository extends JpaRepository<FlightInformation, String> {

    List<FlightInformation> findAll();

    Optional<FlightInformation> findByFlightId(String flightId);
}
