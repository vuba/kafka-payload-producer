package com.vuba.kafkapayloadproducer;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class PayloadService {

    private static final ObjectMapper MAPPER = new ObjectMapper();

    @Autowired
    private KafkaTemplate kafkaTemplate;

    public void postPayload(String kafkaTopic, String payload){
        LOG.info("attempting to send [payload={}] to [topic={}]", payload, kafkaTopic);
        kafkaTemplate.send(kafkaTopic, payload);
    }
}
