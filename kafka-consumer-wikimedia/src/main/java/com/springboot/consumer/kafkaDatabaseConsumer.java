package com.springboot.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.springboot.consumer.entity.WikimediaData;
import com.springboot.consumer.repo.WikimediaRepo;

@Service
public class kafkaDatabaseConsumer {

	private static final Logger LOGGER = LoggerFactory.getLogger(kafkaDatabaseConsumer.class);

	@Autowired
	WikimediaRepo wikimediaRepo;

	@KafkaListener(topics = "wikimedia_recentchange", groupId = "Kafka_group")
	public void consume(String message) {
		LOGGER.info(String.format("Event Message received : %s", message));
		WikimediaData wikimediaData = new WikimediaData();
		wikimediaData.setWikimediaMessage(message);
		wikimediaRepo.save(wikimediaData);

	}
}
