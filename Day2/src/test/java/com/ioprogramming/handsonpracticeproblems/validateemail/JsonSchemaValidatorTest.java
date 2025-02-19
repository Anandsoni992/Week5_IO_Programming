package com.ioprogramming.handsonpracticeproblems.validateemail;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class JsonSchemaValidatorTest {

    @Test
    void testValidEmail() {
        String validJson = "{ \"email\": \"ranveer@allahbadia.com\" }";
        assertTrue(JsonSchemaValidator.validateJson(validJson));
    }

    @Test
    void testInvalidEmail() {
        String invalidJson = "{ \"email\": \"invalid-email\" }";
        assertFalse(JsonSchemaValidator.validateJson(invalidJson));
    }
}
