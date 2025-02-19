package com.ioprogramming.practiceproblems.validatejson;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class JsonValidatorTest {

    @Test
    void testValidJson() {
        String json = "{ \"name\": \"Amitabh\", \"email\": \"amitabh@bachha.com\", \"age\": 25 }";
        assertTrue(JsonValidator.isValidJson(json));
    }

    @Test
    void testInvalidJson() {
        String json = "{ \"name\": \"Amitabh\", \"email\": \"amitabh@bachha.com\" "; // Malformed JSON
        assertFalse(JsonValidator.isValidJson(json));
    }

    @Test
    void testValidJsonStructure() {
        String json = "{ \"name\": \"Amitabh\", \"email\": \"amitabh@bachha.com\", \"age\": 25 }";
        assertTrue(JsonValidator.validateJsonStructure(json));
    }

    @Test
    void testInvalidJsonStructure() {
        String json = "{ \"name\": \"Amitabh\", \"email\": \"amitabh@bachhaj.com\" }"; // Missing "age"
        assertFalse(JsonValidator.validateJsonStructure(json));
    }
}
