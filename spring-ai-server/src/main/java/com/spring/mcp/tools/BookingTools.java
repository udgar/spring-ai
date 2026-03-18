package com.spring.mcp.tools;

import com.spring.mcp.model.Bookings;
import com.spring.mcp.service.BookingService;
import org.springframework.ai.tool.annotation.Tool;
import org.springframework.ai.tool.annotation.ToolParam;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BookingTools {

    private final BookingService service;

    public BookingTools(BookingService service) {
        this.service = service;
    }

    @Tool(name="book-flight",description = "Book particular flight for certain individual")
    public String bookFlight(@ToolParam(description = "Flight number, eg. SW123") String flightNumber
            , @ToolParam(description = "passenger name, eg. udgar") String passengerName
            ,@ToolParam(description = "remarks, eg. allergic to peanut")String remarks){

        try {
            service.saveBooking(passengerName,remarks,flightNumber);
            return """
                Flight has been added sucessfully
                """;
        }
        catch (Exception e){
            return """
                    Flight could not be added, is your information correct?""";
        }

    }

    @Tool(name="retieve-booking",description = "Get the bookings")
    public List<Bookings> getBookings(){
        return service.getAll();
    }
}
