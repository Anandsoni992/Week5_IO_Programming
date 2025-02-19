package com.ioprogramming.handsonpracticeproblems.mergejsonfiles;

import org.junit.jupiter.api.Test;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import static org.junit.jupiter.api.Assertions.*;

public class JsonMergerTest {

    @Test
    void testMergeJsonFiles() throws Exception {
        String json1 = "{ \"name\": \"Samay\", \"age\": 25 }";
        String json2 = "{ \"email\": \"samay@raina.com\", \"city\": \"New York\" }";

        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode node1 = objectMapper.readTree(json1);
        JsonNode node2 = objectMapper.readTree(json2);

        JsonNode mergedJson = node1.deepCopy();

        assertEquals("Samay", mergedJson.get("name").asText());
        assertEquals(25, mergedJson.get("age").asInt());
        assertEquals("samay@raina.com", mergedJson.get("email").asText());
        assertEquals("New York", mergedJson.get("city").asText());
    }
}
