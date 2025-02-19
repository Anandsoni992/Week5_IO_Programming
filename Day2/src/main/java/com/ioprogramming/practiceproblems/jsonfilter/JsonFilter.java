package com.ioprogramming.practiceproblems.jsonfilter;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import java.util.ArrayList;
import java.util.List;

public class JsonFilter {

    public static String filterByAge(String jsonArray) throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode rootNode = objectMapper.readTree(jsonArray);

        List<JsonNode> filteredList = new ArrayList<>();
        for (JsonNode node : rootNode) {
            if (node.has("age") && node.get("age").asInt() > 25) {
                filteredList.add(node);
            }
        }

        return objectMapper.writeValueAsString(filteredList);
    }

    public static void main(String[] args) throws Exception {
        String jsonArray = "[ { \"name\": \"Samay\", \"age\": 22 }, { \"name\": \"Raftar\", \"age\": 30 }, { \"name\": \"Badshah\", \"age\": 28 } ]";

        String filteredJson = filterByAge(jsonArray);
        System.out.println("Filtered JSON: " + filteredJson);
    }
}
