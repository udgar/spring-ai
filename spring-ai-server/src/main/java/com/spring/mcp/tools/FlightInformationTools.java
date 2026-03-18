package com.spring.mcp.tools;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spring.mcp.model.FlightInformation;
import org.springframework.ai.tool.annotation.Tool;
import org.springframework.ai.tool.annotation.ToolParam;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class FlightInformationTools {

    private final Map<String,FlightInformation> listOfFlights=new HashMap<>();

    @Tool(name="flight-add-to-list", description = "Add new flight information")
    public String addFlight(
            @ToolParam(description = "The flight id, eg. 3456") @JsonProperty("flightId") String flightId,
            @ToolParam(description = "The airline id, eg. BUD") @JsonProperty("airlineId") String airlineId,
            @ToolParam(description = "The flight number, eg. RA217") @JsonProperty("flightNumber") String flightNumber,
            @ToolParam(description = "Start point, eg. KTM") @JsonProperty("startPoint") String startPoint,
            @ToolParam(description = "End point, eg. DEL") @JsonProperty("endPoint") String endPoint,
            @ToolParam(description = "Status, eg. Scheduled, Cancelled") @JsonProperty("status") String status,
            @ToolParam(description = "Duration, eg. 120") @JsonProperty("duration") String duration
    ){
        try {
            var flight=new FlightInformation(flightId,airlineId,flightNumber,startPoint,endPoint,status,Integer.parseInt(duration));
            listOfFlights.put(flightId,flight);
            return String.format("Flight information with flight id %s added Successfully whose status is %s",flightId,status);
        }
        catch (Exception exception){
           return """
                    The flight information could not be added, is your information correct?
                    """;
        }
    }

    @Tool(name="latest-flight-list",description = "Get flight information")
    public List<FlightInformation> getListOfFlights(){
        return listOfFlights.values().stream().toList();
    }
}
