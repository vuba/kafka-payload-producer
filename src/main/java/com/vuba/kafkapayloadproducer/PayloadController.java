package com.vuba.kafkapayloadproducer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PayloadController {

    @Autowired
    private PayloadService payloadService;

    @PostMapping(value = "/post/{kafkaTopic}")
    public ResponseEntity postPayload(@PathVariable("kafkaTopic") String kafkaTopic, @RequestBody String payload){
        payloadService.postPayload(kafkaTopic, payload);
        return ResponseEntity.ok().build();
    }
}
