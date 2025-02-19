package com.ioprogramming.handsonpracticeproblems.databasetojson;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DatabaseToJsonReportTest {

    @Test
    void testGenerateJsonReport() {
        String jsonReport = DatabaseToJsonReport.generateJsonReport();

        assertTrue(jsonReport.contains("\"name\": \"Samay\""));
        assertTrue(jsonReport.contains("\"age\": 25"));
        assertTrue(jsonReport.contains("\"email\": \"samay@raina.com\""));
    }
}
