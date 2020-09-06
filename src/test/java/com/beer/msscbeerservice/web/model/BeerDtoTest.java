package com.beer.msscbeerservice.web.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;

@JsonTest
public class BeerDtoTest extends BaseTest {

    @Autowired
    ObjectMapper objectMapper;

    @Test
    void testSerializeDto() throws JsonProcessingException {
        BeerDto beerDto = getDto();
        String jsonString = objectMapper.writeValueAsString(beerDto);
        System.out.println(jsonString);
    }

    @Test
    void testDeserialize() throws JsonProcessingException {
        String json = "{\"version\":null,\"createdDate\":\"2020-09-06T13:12:26+0100\",\"lastModifiedDate\":\"2020-09-06T13:12:26+0100\",\"beerName\":\"BeerName\",\"beerStyle\":\"ALE\",\"upc\":12231,\"price\":\"12.99\",\"quantityOnHand\":null,\"myLocalDate\":\"20200906\",\"beerId\":\"4519d2b9-de86-475f-a98b-e087cc159921\"}\n";
        BeerDto dto = objectMapper.readValue(json , BeerDto.class);
        System.out.println(dto);
    }
}
