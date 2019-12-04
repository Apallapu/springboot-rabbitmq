package com.ankamma.spring.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import com.ankamma.spring.model.Ticket;
import com.ankamma.spring.service.TicketServiceSender;

@Controller
public class TicketController {
	
	private final TicketServiceSender ticketServiceSender;

    @Autowired
    public TicketController(TicketServiceSender ticketServiceSender) {
        this.ticketServiceSender = ticketServiceSender;
    }

    @PostMapping("/sendMsg")
    public String handleMessage(Ticket ticket) {
    	ticketServiceSender.sendTicket(ticket);
        return "success";
    }
}

