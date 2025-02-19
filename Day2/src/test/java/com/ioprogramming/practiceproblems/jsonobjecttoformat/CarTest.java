package com.ioprogramming.practiceproblems.jsonobjecttoformat;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import com.fasterxml.jackson.databind.ObjectMapper;

public class CarTest {

    @Test
    void testCarJsonConversion() throws Exception {
        Car car = new Car("Honda", "Civic", 2022);
        String json = car.toJson();

        assertTrue(json.contains("\"brand\":\"Honda\""));
        assertTrue(json.contains("\"model\":\"Civic\""));
        assertTrue(json.contains("\"year\":2022"));
    }
}
