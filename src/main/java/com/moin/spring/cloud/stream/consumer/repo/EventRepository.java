package com.moin.spring.cloud.stream.consumer.repo;

import com.moin.spring.cloud.stream.consumer.data.SampleMessage;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends ElasticsearchRepository<SampleMessage, Long> {
}
