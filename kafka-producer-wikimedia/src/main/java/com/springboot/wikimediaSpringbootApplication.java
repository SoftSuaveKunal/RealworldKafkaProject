package com.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springboot.service.WikimediaKafkaProducer;

@SpringBootApplication
public class wikimediaSpringbootApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(wikimediaSpringbootApplication.class);
	}
	@Autowired
    private WikimediaKafkaProducer wikimediaKafkaProducer;

    @Override
    public void run(String... args) throws Exception {
    	wikimediaKafkaProducer.sendMessage();
    }
}
