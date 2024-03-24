package com.du6ak.elasticsearchdemo.dto.mapper;


import com.du6ak.elasticsearchdemo.document.Ticket;
import com.du6ak.elasticsearchdemo.elasticsearch.dto.TicketDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface TicketMapper {

    @Mapping(source = "ticket_no", target = "ticket_no")
    @Mapping(source = "bookRef", target = "bookRef")
    @Mapping(source = "passengerId", target = "passengerId")
    @Mapping(source = "passengerName", target = "passengerName")
    TicketDto ticketToTicketDto(Ticket ticket);

    @Mapping(source = "ticket_no", target = "ticket_no")
    @Mapping(source = "bookRef", target = "bookRef")
    @Mapping(source = "passengerId", target = "passengerId")
    @Mapping(source = "passengerName", target = "passengerName")
    Ticket ticketDtoToTicket(TicketDto ticketDto);
}
