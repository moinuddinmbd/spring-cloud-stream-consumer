package com.moin.spring.cloud.stream.consumer.api;

public interface SpringKafkaConsumer<SampleMessage, Long> {
    void consumeMessage(SampleMessage data);
}
