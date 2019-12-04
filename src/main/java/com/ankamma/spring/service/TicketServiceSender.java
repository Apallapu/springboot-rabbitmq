package com.ankamma.spring.service;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ankamma.spring.config.RabbitConfig;
import com.ankamma.spring.model.Ticket;

@Service
public class TicketServiceSender {
	private final RabbitTemplate rabbitTemplate;
   
    
    @Autowired
    public TicketServiceSender(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
       
    }

    
    public void  sendTicket(Ticket ticket) {
        this.rabbitTemplate.convertAndSend(RabbitConfig.QUEUE_TICKET, ticket);
      
    }
}

