package com.ioprogramming.practiceproblems.mergejson;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class JsonMergerTest {

    @Test
    void testMergeJson() throws Exception {
        String json1 = "{ \"name\": \"Deepak_Kalal\", \"email\": \"Deepak@kalal.com\" }";
        String json2 = "{ \"age\": 25, \"city\": \"India\" }";

        String result = JsonMerger.mergeJson(json1, json2);

        assertTrue(result.contains("\"name\":\"Deepak_Kalal\""));
        assertTrue(result.contains("\"email\":\"Deepak@kalal.com\""));
        assertTrue(result.contains("\"age\":25"));
        assertTrue(result.contains("\"city\":\"India\""));
    }
}
