package com.ankamma.spring.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.ankamma.spring.config.RabbitConfig;
import com.ankamma.spring.model.Ticket;

@Component
public class TicketListener {

	static final Logger logger = LoggerFactory.getLogger(TicketListener.class);

	@RabbitListener(queues = RabbitConfig.QUEUE_TICKET)
	public void processTicket(Ticket ticket) {
		logger.info("ticket Received: " + ticket);
	}
}
