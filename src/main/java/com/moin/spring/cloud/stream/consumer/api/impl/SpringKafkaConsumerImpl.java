package com.moin.spring.cloud.stream.consumer.api.impl;

import com.moin.spring.cloud.stream.consumer.api.SpringKafkaConsumer;
import com.moin.spring.cloud.stream.consumer.data.SampleMessage;
import com.moin.spring.cloud.stream.consumer.repo.EventRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

@EnableBinding(Sink.class)
public class SpringKafkaConsumerImpl implements SpringKafkaConsumer<SampleMessage, Long> {
    Logger log = LoggerFactory.getLogger(SpringKafkaConsumerImpl.class);

    @Autowired
    EventRepository repo;

    @StreamListener(Sink.INPUT)
    @Override
    public void consumeMessage(SampleMessage data) {
        log.trace(data.toString());
        data.setName("REMOVED");
        data.setAddress("REMOVED");
        data.setLatitude("REMOVED");
        data.setLongitude("REMOVED");
        repo.save(data);
    }
}
