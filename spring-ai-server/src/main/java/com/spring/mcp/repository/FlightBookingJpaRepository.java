package com.spring.mcp.repository;

import com.spring.mcp.model.Bookings;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlightBookingJpaRepository extends JpaRepository<Bookings, Long> {
}
