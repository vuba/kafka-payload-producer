package com.vuba.kafkapayloadproducer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
@ComponentScan
public class KafkaPayloadProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaPayloadProducerApplication.class, args);
	}

}
