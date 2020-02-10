package com.moin.spring.cloud.stream.consumer.data;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import java.io.Serializable;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Document(indexName = "business-event")
public class SampleMessage implements Serializable {
    @Id
    @JsonProperty(value = "business_id")
    private String businessId;

    @JsonProperty(value = "name")
    private String name;

    @JsonProperty(value = "address")
    private String address;

    @JsonProperty(value = "city")
    private String city;

    @JsonProperty(value = "state")
    private String state;

    @JsonProperty(value = "postal_code")
    private String postalCode;

    @JsonProperty(value = "latitude")
    private String latitude;

    @JsonProperty(value = "longitude")
    private String longitude;

    @JsonProperty(value = "stars")
    private Double stars;

    @JsonProperty(value = "review_count")
    private Long reviewCount;

    @JsonProperty(value = "is_open")
    private Long isOpen;

    @JsonProperty(value = "attributes")
    private Map<String, String> attributes = new HashMap<>();

    @JsonProperty(value = "categories")
    private String categories;

    @JsonProperty(value = "hours")
    private EnumMap<DAYS, String> hours = new EnumMap<>(DAYS.class);

    public enum DAYS {
        Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday
    }
}
