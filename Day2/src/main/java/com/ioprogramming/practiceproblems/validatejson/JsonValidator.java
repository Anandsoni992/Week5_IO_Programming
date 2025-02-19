package com.ioprogramming.practiceproblems.validatejson;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonValidator {

    public static boolean isValidJson(String json) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.readTree(json);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean validateJsonStructure(String json) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            JsonNode rootNode = objectMapper.readTree(json);

            return rootNode.has("name") && rootNode.has("email") && rootNode.has("age");
        } catch (Exception e) {
            return false;
        }
    }

    public static void main(String[] args) {
        String validJson = "{ \"name\": \"Dynamo\", \"email\": \"dynamo@gaming.com\", \"age\": 30 }";
        String invalidJson = "{ \"name\": \"Dynamo\", \"email\": \"dynamo@gaming.com\" }"; // Missing "age"

        System.out.println("Valid JSON Check: " + isValidJson(validJson));
        System.out.println("Valid Structure Check: " + validateJsonStructure(validJson));
        System.out.println("Invalid Structure Check: " + validateJsonStructure(invalidJson));
    }
}
