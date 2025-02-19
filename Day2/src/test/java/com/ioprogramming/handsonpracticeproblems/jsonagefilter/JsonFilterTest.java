package com.ioprogramming.handsonpracticeproblems.jsonagefilter;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class JsonFilterTest {

    @Test
    void testFilterByAge() throws Exception {
        String inputJson = "[ { \"name\": \"Samay\", \"age\": 22 }, { \"name\": \"Raftaar\", \"age\": 30 }, { \"name\": \"Badshah\", \"age\": 28 } ]";
        String result = JsonFilter.filterByAge(inputJson);

        assertFalse(result.contains("\"name\":\"Samay\""));
        assertTrue(result.contains("\"name\":\"Raftaar\""));
        assertTrue(result.contains("\"name\":\"Badshah\""));
    }
}
