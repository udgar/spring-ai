package com.spring.mcp.model;

public class FlightInformation {

    private String flightId;

    private String airline;

    private String flightNumber;

    private String startPoint;

    private String endPoint;

    private String status;

    private Integer duration;

    public FlightInformation(String flightId,
                             String airline,
                             String flightNumber,
                             String startPoint,
                             String endPoint,
                             String status,
                             Integer duration) {
        this.flightId = flightId;
        this.airline = airline;
        this.flightNumber = flightNumber;
        this.startPoint = startPoint;
        this.endPoint = endPoint;
        this.status = status;
        this.duration = duration;
    }

    public String getFlightId() {
        return flightId;
    }

    public void setFlightId(String flightId) {
        this.flightId = flightId;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getStartPoint() {
        return startPoint;
    }

    public void setStartPoint(String startPoint) {
        this.startPoint = startPoint;
    }

    public String getEndPoint() {
        return endPoint;
    }

    public void setEndPoint(String endPoint) {
        this.endPoint = endPoint;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }
}
