package com.phuongheh.streamkafka.service;

import com.phuongheh.streamkafka.model.Greetings;
import com.phuongheh.streamkafka.stream.GreetingsStreams;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class GreetingsListener {
    @StreamListener(GreetingsStreams.INPUT)
    public void handleGreetings(@Payload Greetings greetings){
        log.info("Received greetings: {}", greetings);
    }
}
