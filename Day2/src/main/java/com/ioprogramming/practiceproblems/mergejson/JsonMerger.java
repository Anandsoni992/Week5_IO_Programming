package com.ioprogramming.practiceproblems.mergejson;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class JsonMerger {

    public static String mergeJson(String json1, String json2) throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode node1 = objectMapper.readTree(json1);
        JsonNode node2 = objectMapper.readTree(json2);

        ObjectNode mergedNode = objectMapper.createObjectNode();
        mergedNode.setAll((ObjectNode) node1);
        mergedNode.setAll((ObjectNode) node2);

        return objectMapper.writeValueAsString(mergedNode);
    }

    public static void main(String[] args) throws Exception {
        String json1 = "{ \"name\": \"Deepak kalal\", \"email\": \"deepak@don.com\" }";
        String json2 = "{ \"age\": 30, \"city\": \"New York\" }";

        String mergedJson = mergeJson(json1, json2);
        System.out.println("Merged JSON: " + mergedJson);
    }
}
