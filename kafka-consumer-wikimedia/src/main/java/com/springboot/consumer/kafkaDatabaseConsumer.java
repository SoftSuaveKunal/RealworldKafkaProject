package com.springboot.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class kafkaDatabaseConsumer {

	private static final Logger LOGGER = LoggerFactory.getLogger(kafkaDatabaseConsumer.class);
	@KafkaListener(topics = "wikimedia_recentchange", groupId = "Kafka_group")
	public void consume(String message) {
		LOGGER.info(String.format("Event Message received : %s",message));
	}
}
